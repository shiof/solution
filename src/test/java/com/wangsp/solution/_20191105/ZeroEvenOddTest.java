package com.wangsp.solution._20191105;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import static org.junit.Assert.*;

/**
 * @author spwang Created on 2019/11/5 at 17:36
 * @version 1.0.0
 */
public class ZeroEvenOddTest {

    @Test
    public void test() {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(2);
        run(zeroEvenOdd);
    }


    @Test
    public void test_1() {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(5);
        run(zeroEvenOdd);
    }

    private void run(ZeroEvenOdd zeroEvenOdd) {
        List<Integer> list = new ArrayList<>();

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, ()->{
            System.out.println(list.size());
            for (int value : list) {
                System.out.print(value);
            }
        });

        new Thread(()->{
            try {
                zeroEvenOdd.zero(list::add);
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                zeroEvenOdd.even(list::add);
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                zeroEvenOdd.odd(list::add);
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();
    }

}