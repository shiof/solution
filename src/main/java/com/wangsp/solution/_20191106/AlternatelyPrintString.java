package com.wangsp.solution._20191106;

import java.util.Vector;
import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * <a href="https://leetcode-cn.com/problems/fizz-buzz-multithreaded/">1195. 交替打印字符串</a>
 *
 * <div class="notranslate"><p>编写一个可以从 1 到 n 输出代表这个数字的字符串的程序，但是：</p>
 *
 * <ul>
 * 	<li>如果这个数字可以被 3 整除，输出 "fizz"。</li>
 * 	<li>如果这个数字可以被 5 整除，输出&nbsp;"buzz"。</li>
 * 	<li>如果这个数字可以同时被 3 和 5 整除，输出 "fizzbuzz"。</li>
 * </ul>
 *
 * <p>例如，当&nbsp;<code>n = 15</code>，输出：&nbsp;<code>1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz</code>。</p>
 *
 * <p>假设有这么一个类：</p>
 *
 * <pre>class FizzBuzz {
 * &nbsp; public FizzBuzz(int n) { ... }&nbsp;              // constructor
 *   public void fizz(printFizz) { ... }          // only output "fizz"
 *   public void buzz(printBuzz) { ... }          // only output "buzz"
 *   public void fizzbuzz(printFizzBuzz) { ... }  // only output "fizzbuzz"
 *   public void number(printNumber) { ... }      // only output the numbers
 * }</pre>
 *
 * <p>请你实现一个有四个线程的多线程版&nbsp;&nbsp;<code>FizzBuzz</code>，&nbsp;同一个&nbsp;<code>FizzBuzz</code>&nbsp;实例会被如下四个线程使用：</p>
 *
 * <ol>
 * 	<li>线程A将调用&nbsp;<code>fizz()</code>&nbsp;来判断是否能被 3 整除，如果可以，则输出&nbsp;<code>fizz</code>。</li>
 * 	<li>线程B将调用&nbsp;<code>buzz()</code>&nbsp;来判断是否能被 5 整除，如果可以，则输出&nbsp;<code>buzz</code>。</li>
 * 	<li>线程C将调用&nbsp;<code>fizzbuzz()</code>&nbsp;来判断是否同时能被 3 和 5 整除，如果可以，则输出&nbsp;<code>fizzbuzz</code>。</li>
 * 	<li>线程D将调用&nbsp;<code>number()</code>&nbsp;来实现输出既不能被 3 整除也不能被 5 整除的数字。</li>
 * </ol>
 * </div>
 *
 * @author spwang Created on 2019/11/6 at 10:22
 * @version 1.0.0
 */
public class AlternatelyPrintString {

    private int n;

    private Semaphore semaphore = new Semaphore(1);

    public AlternatelyPrintString(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for (int i = 3; i <= n; i += 3) {
            if (i % 5 != 0) {
                semaphore.acquire(i);
                printFizz.run();
                semaphore.release(i + 1);
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        for (int i = 5; i <= n; i += 5) {
            if (i % 3 != 0) {
                semaphore.acquire(i);
                printBuzz.run();
                semaphore.release(i + 1);
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for (int i = 15; i <= n; i += 3) {
            if (i % 3 == 0 && i % 5 == 0) {
                semaphore.acquire(i);
                printFizzBuzz.run();
                semaphore.release(i + 1);
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                semaphore.acquire(i);
                printNumber.accept(i);
                semaphore.release(i + 1);
            }
        }
    }

}
