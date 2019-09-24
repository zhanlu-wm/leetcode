package wm.zhanlu.learning.leetcode;

/**
 * 67. 二进制求和
 *
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-binary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wangming
 *
 */
public class AddBinary {

    /**
     * 思路：
     * 将两个二进制数低位对齐，从右向左，将每个对应位上的两个数、以及上一低位的进位值共三个数相加，相加结果分成两部分：
     * 1. 当前位的值：用相加结果对2取余得到
     * 2. 进位值：用相加结果除以2得到
     *
     * 注：由于两个数的长度可能不同，当对较长的数的超出部分做计算时，依然是3个数相加，只是较短的数的对应位均用0参与计算。
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int len = Math.max(lenA, lenB);
        int i = 0;
        int add = 0;
        StringBuilder sb = new StringBuilder();
        while (i <= len - 1) {
            add = add + (lenA-1-i >= 0 && a.charAt(lenA-1-i) == '1' ? 1 : 0) + (lenB-1-i >= 0 && b.charAt(lenB-1-i) == '1' ? 1 : 0);
            sb.insert(0, add%2);
            add = add / 2;
            i++;
        }
        if (i == len && add == 1) {
            sb.insert(0, 1);
        }
        return sb.toString();
    }

}
