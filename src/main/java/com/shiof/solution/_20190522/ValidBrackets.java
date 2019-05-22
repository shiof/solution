package com.shiof.solution._20190522;

import java.util.HashMap;
import java.util.Stack;

/**
 * 20. 有效的括号
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：  左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * 输入: "()"
 * 输出: true
 * <p>
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 * <p>
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 * <p>
 * 示例 4:
 * 输入: "([)]"
 * 输出: false
 * <p>
 * 示例 5:
 * 输入: "{[]}"
 * 输出: true
 *
 * @author spwang on 2019/5/22 8:22
 * @version 1.0.0
 * @since 1.0.0
 */
public class ValidBrackets {

    private HashMap<Character, Character> map;

    ValidBrackets() {
        this.map = new HashMap<>();
        this.map.put(')', '(');
        this.map.put('}', '{');
        this.map.put(']', '[');
    }

    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            if (map.containsKey(s.charAt(i))) {
                if (stack.empty() || stack.pop() != map.get(s.charAt(i))) {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
            i++;
        }
        return stack.empty();
    }
}
