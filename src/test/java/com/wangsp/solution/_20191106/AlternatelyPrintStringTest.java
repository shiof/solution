package com.wangsp.solution._20191106;

import org.junit.Test;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import static org.junit.Assert.*;

/**
 * @author spwang Created on 2019/11/6 at 16:22
 * @version 1.0.0
 */
public class AlternatelyPrintStringTest {

    @Test
    public void test_1() {
        AlternatelyPrintString alternatelyPrintString = new AlternatelyPrintString(15);

        List<String> list = new ArrayList<>();

        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, ()->{
            System.out.println(list.size());
            for (String s : list) {
                System.out.print(s + ",");
            }
        });

        new Thread(() -> {
            try {
                alternatelyPrintString.buzz(()->{
                    list.add("buzz");
                });
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()-> {
            try {
                alternatelyPrintString.fizz(()->{
                    list.add("fizz");
                });
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()-> {
            try {
                alternatelyPrintString.fizzbuzz(()->{
                    list.add("fizzbuzz");
                });
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()-> {
            try {
                alternatelyPrintString.number(value -> list.add(String.valueOf(value)));
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();
    }

}