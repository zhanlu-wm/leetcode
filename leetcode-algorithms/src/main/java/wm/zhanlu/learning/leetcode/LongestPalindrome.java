package wm.zhanlu.learning.leetcode;

public class LongestPalindrome {


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

//    public String longestPalindrome(String s) {
//        if (s == null) return null;
//        String palindrome = "";
//        int len = s.length();
//        for (int i =0; i < len; i++) {
//            for(int j = i + 1; j <= len; j++) {
//                String sub = s.substring(i, j);
//                if (isPalindrome(sub) && sub.length() > palindrome.length()) {
//                    palindrome = sub;
//                }
//            }
//        }
//        return palindrome;
//    }

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
