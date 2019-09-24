package wm.zhanlu.learning.leetcode;


public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int i=0;
        boolean endFlag = false;
        while (!endFlag) {
            if (i != strs[0].length()) {
                char ch = strs[0].charAt(i);
                for (String str: strs) {
                    if (i == str.length()) {
                        endFlag = true;
                        break;
                    }
                    char ch2 = str.charAt(i);
                    if (ch != ch2) {
                        endFlag = true;
                        break;
                    }
                }
            } else {
                endFlag = true;
            }
            i++;
        }
        return strs[0].substring(0, i-1);

    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(new String[]{"aa", "ac", "cc"}));


/*
        System.out.println("b \\\t a\\\t\\\t".split("\\\\\t").length);
        System.out.println("b \\\t a\\\t\\\t".split("\\\\t").length);
        System.out.println("b \\\t a\\\t\\\t".split("\\\t").length);
        System.out.println("b \\\t a\\\t\\\t".split("\\t").length);
        System.out.println("b \\\t a\\\t\\\t".split("\t").length);
        System.out.println(Pattern.compile("\\\\").pattern());
        System.out.println("\\\\");
        System.out.println(Pattern.compile("\\\\\t").pattern());
        System.out.println("\\\\\t");
        System.out.println(Pattern.compile("\\\\t").pattern());
        System.out.println("\\\\t");
        System.out.println(Pattern.compile("\\\t").pattern());
        System.out.println("\\\t");
        System.out.println(Pattern.compile("\\t").pattern());
        System.out.println("\\t");
        System.out.println(Pattern.compile("\t").pattern());
        System.out.println("\t");
*/

    }

}
