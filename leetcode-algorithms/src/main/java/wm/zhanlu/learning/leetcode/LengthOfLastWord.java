package wm.zhanlu.learning.leetcode;

/**
 * 58. 最后一个单词的长度
 *
 *给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 *
 * 输入: "Hello World"
 * 输出: 5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/length-of-last-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wangming
 *
 */
public class LengthOfLastWord {



    public int lengthOfLastWord2(String s) {
        // TODO 其他方式的算法实现
        return 0;
    }


    public int lengthOfLastWord(String s) {
//        String[] split = s.trim().split(" ");
//        return split[split.length - 1].length();

//        int lastSpaceIdx;
//        while ((lastSpaceIdx = s.lastIndexOf(' ')) >= 0 && lastSpaceIdx == s.length() - 1) {
//            s = s.substring(0, lastSpaceIdx);
//        }
//        return s.substring(lastSpaceIdx + 1).length();

        s = s.trim();
        return s.substring(s.lastIndexOf(' ') + 1).length();
    }


    public static void main(String[] args) {
        System.out.println("".substring(0, 0).length());
    }

}
