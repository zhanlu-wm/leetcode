package wm.zhanlu.learning.leetcode;

/**
 * 7. 整数反转
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wangming
 *
 */
public class IntReverse {

    /**
     * 思路：通过不断将整数对10取余，并求商更新，将原来的低位数字放置到左侧，从而实现翻转。
     *
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        long tmp = Math.abs((long)x);
        long y = 0;
        while (tmp/10 > 0) {
            y = (y + tmp%10) * 10;
            tmp = tmp/10;
        }
        y = (y + tmp) * (x < 0 ? -1 : 1);
        if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) {
            y = 0;
        }
        return (int) y;
    }

    public static void main(String[] args) {
        IntReverse ir = new IntReverse();
        System.out.println(Math.abs(-2147483648));
        System.out.println(ir.reverse(-2147483648));
    }

}
