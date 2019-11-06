package com.wangsp.solution._20191106;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/**
 * <a href="https://leetcode-cn.com/problems/building-h2o/">1117. H2O 生成</a>
 *
 * <div class="notranslate"><p>现在有两种线程，氢 <code>oxygen</code> 和氧 <code>hydrogen</code>，你的目标是组织这两种线程来产生水分子。</p>
 *
 * <p>存在一个屏障（barrier）使得每个线程必须等候直到一个完整水分子能够被产生出来。</p>
 *
 * <p>氢和氧线程会被分别给予 <code>releaseHydrogen</code> 和 <code>releaseOxygen</code> 方法来允许它们突破屏障。</p>
 *
 * <p>这些线程应该三三成组突破屏障并能立即组合产生一个水分子。</p>
 *
 * <p>你必须保证产生一个水分子所需线程的结合必须发生在下一个水分子产生之前。</p>
 *
 * <p>换句话说:</p>
 *
 * <ul>
 * 	<li>如果一个氧线程到达屏障时没有氢线程到达，它必须等候直到两个氢线程到达。</li>
 * 	<li>如果一个氢线程到达屏障时没有其它线程到达，它必须等候直到一个氧线程和另一个氢线程到达。</li>
 * </ul>
 *
 * <p>书写满足这些限制条件的氢、氧线程同步代码。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入: </strong>"HOH"
 * <strong>输出: </strong>"HHO"
 * <strong>解释:</strong> "HOH" 和 "OHH" 依然都是有效解。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入: </strong>"OOHHHH"
 * <strong>输出: </strong>"HHOHHO"
 * <strong>解释:</strong> "HOHHHO", "OHHHHO", "HHOHOH", "HOHHOH", "OHHHOH", "HHOOHH", "HOHOHH" 和 "OHHOHH" 依然都是有效解。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>限制条件:</strong></p>
 *
 * <ul>
 * 	<li>输入字符串的总长将会是 3<em>n</em>, 1 ≤&nbsp;<em>n</em>&nbsp;≤ 50；</li>
 * 	<li>输入字符串中的 “H” 总数将会是 2n；</li>
 * 	<li>输入字符串中的 “O” 总数将会是 n。</li>
 * </ul>
 * </div>
 *
 * @author spwang Created on 2019/11/6 at 8:44
 * @version 1.0.0
 */
public class BuildH2O {
    public BuildH2O() {
    }

    private Semaphore h = new Semaphore(2);
    private Semaphore o = new Semaphore(1);
    private CyclicBarrier h20 = new CyclicBarrier(3, () -> {
        h.release(2);
        o.release();
    });

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        h.acquire();

        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();

        try {
            h20.await();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        o.acquire();

        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();

        try {
            h20.await();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
