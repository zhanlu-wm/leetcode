package wm.zhanlu.learning.leetcode;

/**
 * 14. 最长公共前缀
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wangming
 */
public class LongestCommonPrefix {


    public String longestCommonPrefix2(String[] strs) {
        // TODO 其他方式的算法实现

        return null;
    }



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
