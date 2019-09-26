package wm.zhanlu.learning.leetcode;

/**
 * 9. 回文数
 *
 *判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 *
 * 你能不将整数转为字符串来解决这个问题吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wangming
 *
 */
public class Palindrome {

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome("fssf"));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int tmp = x;
        int y = 0;
        while (tmp/10 > 0) {
            y = (y + tmp%10) * 10;
            tmp = tmp/10;
        }
        y = y + tmp;
        return y == x;
    }

    public boolean isPalindrome(String x) {
        if (x == null || x.length() == 0) return false;
        boolean flag = true;
        int len = x.length();
        int mid = len/2;
        for (int i=0; i<mid; i++) {
            if (x.charAt(i) != x.charAt(len-1-i)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
