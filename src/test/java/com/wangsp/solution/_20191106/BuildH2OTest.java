package com.wangsp.solution._20191106;

import org.junit.Test;

import java.util.concurrent.BrokenBarrierException;

import static org.junit.Assert.*;

/**
 * @author spwang Created on 2019/11/6 at 8:57
 * @version 1.0.0
 */
public class BuildH2OTest {

    @Test
    public void test_1() {
        BuildH2O buildH2O = new BuildH2O();

        char[] c = "OHOHOOHHOHHOOHHHHOOHOOHHOHHOOHHHOOHOHHOHHOHHHHHOHHHHHHHHHHHH".toCharArray();

        for (char c1 : c) {
            new Thread(()->{
                try {
                    if (c1 == 'H') {
                        buildH2O.hydrogen(() -> System.out.print("H"));
                    } else if (c1 == 'O') {
                        buildH2O.oxygen(() -> System.out.print("O"));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

}