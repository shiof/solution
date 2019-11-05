package com.wangsp.solution._20191105;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author spwang Created on 2019/11/5 at 17:36
 * @version 1.0.0
 */
public class ZeroEvenOddTest {

    private ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(5);

    @Test
    public void test() {
        new Thread(()->{
            try {
                zeroEvenOdd.zero(System.out::print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                zeroEvenOdd.even(System.out::print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                zeroEvenOdd.odd(System.out::print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}