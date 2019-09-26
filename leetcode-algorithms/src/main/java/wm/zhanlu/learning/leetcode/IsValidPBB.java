package wm.zhanlu.learning.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 20. 有效的括号
 *
 *给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wangming
 */
public class IsValidPBB {


    public boolean isValid2(String s) {
        char[] chars = new char[s.length()];
        int idx = 0;
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    chars[idx] = ch;
                    idx++;
                    break;
                case ')':
                    if (idx == 0 || chars[--idx] != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (idx == 0 || chars[--idx] != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (idx == 0 || chars[--idx] != '{') {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return idx == 0;
    }


    public boolean isValid(String s) {
            Map<Character, Character> charMap = new HashMap<>(3);
            charMap.put('(', ')');
            charMap.put('[', ']');
            charMap.put('{', '}');
            List<Character> chars = new ArrayList<>(s.length());
            for (int i=0; i<s.length(); i++) {
                char currChar = s.charAt(i);
                int size = chars.size();
                if (size > 0) {
                    char lastChar = chars.get(size - 1);
                    if (currChar == charMap.get(lastChar)) {
                        chars.remove(size - 1);
                    } else if (charMap.containsValue(currChar)) {
                        return false;
                    } else {
                        chars.add(currChar);
                    }
                } else {
                    if (charMap.containsValue(currChar)) {
                        return false;
                    } else {
                        chars.add(currChar);
                    }
                }
            }

            return chars.isEmpty();
    }

}
