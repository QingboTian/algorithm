package cn.tianqb.juc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/9/2 17:18
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(10);

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            list.add(1);
        }



    }

}
