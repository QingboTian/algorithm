package cn.tianqb.tl;

import java.lang.reflect.Field;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/8/25 9:56
 */
public class ThreadLocalTest {



    public static void main(String[] args) throws InterruptedException, NoSuchFieldException, IllegalAccessException {

        ThreadLocal<Object> tl = new ThreadLocal<>();
        tl.set(new User("main"));
//        new Thread(() -> {
//            tl.set(new User("thread 1"));
//            System.out.println(tl.get());
//        }).start();
//
//
//        new Thread(() -> {
//            try {
//                Thread.sleep(2_000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            // if system gc
//            System.out.println(tl);
//            tl.set(new User("thread 2"));
//        }).start();

        System.gc();
        Thread thread = Thread.currentThread();
        Class<Thread> clazz = Thread.class;
        Field field = clazz.getDeclaredField("threadLocals");
        field.setAccessible(true);
        Object o = field.get(thread);
        Class<?> oClass = o.getClass();
        Field table = oClass.getDeclaredField("table");
        table.setAccessible(true);
        Object o1 = table.get(o);
        System.out.println();
        // main thread sleep
//        Thread.sleep(10_000);
    }

}
