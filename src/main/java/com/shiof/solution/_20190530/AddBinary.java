package com.shiof.solution._20190530;

/**
 * 67. 二进制求和
 *
 * @author spwang on 2019/5/30 9:47
 * @version 1.0.0
 * @since 1.0.0
 */
public class AddBinary {
    public String solution(String a, String b) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= Math.max(a.length(), b.length()); i++) {
            int currentA = a.length() - i >= 0 ? a.charAt(a.length() - i) - 48 : 0;
            int currentB = b.length() - i >= 0 ? b.charAt(b.length() - i) - 48 : 0;
            sb.insert(0, (currentA + currentB + carry) % 2);
            carry = (currentA + currentB + carry) / 2;
        }
        if (carry == 1) {
            sb.insert(0, 1);
        }
        return sb.toString();
    }
}
