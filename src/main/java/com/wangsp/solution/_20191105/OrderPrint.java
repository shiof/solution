package com.wangsp.solution._20191105;

import java.util.concurrent.Semaphore;

/**
 * <a href="https://leetcode-cn.com/problems/print-in-order/">1114. 按序打印</a>
 * <p>
 * 我们提供了一个类：
 * <p>
 * public class Foo {
 *   public void one() { print("one"); }
 *   public void two() { print("two"); }
 *   public void three() { print("three"); }
 * }
 * <p>
 * 三个不同的线程将会共用一个 Foo 实例。
 * <p>
 * 线程 A 将会调用 one() 方法
 * 线程 B 将会调用 two() 方法
 * 线程 C 将会调用 three() 方法
 * 请设计修改程序，以确保 two() 方法在 one() 方法之后被执行，three() 方法在 two() 方法之后被执行。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: "onetwothree"
 * 解释:
 * 有三个线程会被异步启动。
 * 输入 [1,2,3] 表示线程 A 将会调用 one() 方法，线程 B 将会调用 two() 方法，线程 C 将会调用 three() 方法。
 * 正确的输出是 "onetwothree"。
 * <p>
 * 示例 2:
 * <p>
 * 输入: [1,3,2]
 * 输出: "onetwothree"
 * 解释:
 * 输入 [1,3,2] 表示线程 A 将会调用 one() 方法，线程 B 将会调用 three() 方法，线程 C 将会调用 two() 方法。
 * 正确的输出是 "onetwothree"。
 * </p>
 *
 * @author spwang Created on 2019/11/5 at 16:22
 * @version 1.0.0
 */
public class OrderPrint {
    private Semaphore first = new Semaphore(1);
    private Semaphore second = new Semaphore(1);

    public OrderPrint() {
        try {
            first.acquire();
            second.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        first.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        first.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        second.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        second.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        second.release();
    }
}
