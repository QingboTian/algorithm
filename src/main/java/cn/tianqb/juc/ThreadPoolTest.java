package cn.tianqb.juc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/9/2 16:15
 */
public class ThreadPoolTest {

    public static void main(String[] args) {

        RejectedExecutionHandler handler = (r, executor) -> System.out.println("队列任务数满了！！！");

        AtomicInteger atomicInteger = new AtomicInteger(1);

        ThreadFactory factory = r -> {
            String name = "No:" + atomicInteger.getAndAdd(1);
            return new Thread(r, name);
        };

        LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(100);

        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(5, 10, 1, TimeUnit.MINUTES, queue, factory, handler);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        List<Future<Integer>> result = new ArrayList<>();

        list.forEach(id -> {
            Future<Integer> submit = executor.submit(() -> {
                String name = Thread.currentThread().getName();
                Thread.sleep(1000);
                System.out.println(name + "计算了" + (id + 1));
                return id + 1;
            });
            result.add(submit);
        });

        result.forEach(future -> {
            try {
                Integer sum = future.get();
//                System.out.println(sum);
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
    }

}
