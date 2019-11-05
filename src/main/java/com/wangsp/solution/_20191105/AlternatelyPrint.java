package com.wangsp.solution._20191105;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/**
 * <a href="https://leetcode-cn.com/problems/print-foobar-alternately/">1115. 交替打印FooBar</a>
 * <p>
 * 我们提供一个类：
 * <p>
 * class FooBar {
 * public void foo() {
 *     for (int i = 0; i < n; i++) {
 *       print("foo");
 *     }
 * }
 * <p>
 * public void bar() {
 *     for (int i = 0; i < n; i++) {
 *       print("bar");
 *     }
 * }
 * }
 * <p>
 * 两个不同的线程将会共用一个 FooBar 实例。其中一个线程将会调用 foo() 方法，另一个线程将会调用 bar() 方法。
 * <p>
 * 请设计修改程序，以确保 "foobar" 被输出 n 次。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: n = 1
 * 输出: "foobar"
 * 解释: 这里有两个线程被异步启动。其中一个调用 foo() 方法, 另一个调用 bar() 方法，"foobar" 将被输出一次。
 * 示例 2:
 * <p>
 * 输入: n = 2
 * 输出: "foobarfoobar"
 * 解释: "foobar" 将被输出两次。
 * </p>
 *
 * @author spwang Created on 2019/11/5 at 16:51
 * @version 1.0.0
 */
public class AlternatelyPrint {
    private Semaphore foo = new Semaphore(1);
    private Semaphore bar = new Semaphore(0);

    private int n;

    public AlternatelyPrint(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            foo.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            bar.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            bar.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            foo.release();
        }
    }
}
