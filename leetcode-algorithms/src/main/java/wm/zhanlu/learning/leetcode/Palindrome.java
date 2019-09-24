package wm.zhanlu.learning.leetcode;

/**
 * 回文数和回文字符串判断
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
