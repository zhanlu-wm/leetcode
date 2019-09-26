package wm.zhanlu.learning.leetcode;

/**
 * 5. 最长回文子串
 *
 *给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wangming
 */
public class LongestPalindrome {


    public String longestPalindrome2(String s) {
        // TODO 实现更高效的解法
        return null;
    }



    /**
     * 暴力解法：无法通过测试，超出时间限制
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if (s == null) return null;
        String palindrome = "";
        int len = s.length();
        for (int i =0; i < len; i++) {
            for(int j = i + 1; j <= len; j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub) && sub.length() > palindrome.length()) {
                    palindrome = sub;
                }
            }
        }
        return palindrome;
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

    public static void main(String[] args) {

        LongestPalindrome lp = new LongestPalindrome();
        System.out.println(lp.longestPalindrome("aabbccbb"));

    }


}
