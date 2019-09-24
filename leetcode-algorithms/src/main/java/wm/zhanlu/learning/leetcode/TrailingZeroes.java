package wm.zhanlu.learning.leetcode;

/**
 * 计算n!结果中尾数里0的个数
 */
public class TrailingZeroes {

    public int trailingZeroes(int n) {

        int count = 0;
        while (n >= 5) {
            count = count + n/5;
            n = n/5;
        }
        return count;

    }

    public static void main(String[] args) {
        TrailingZeroes tz = new TrailingZeroes();
        System.out.println(tz.trailingZeroes(5));
    }

}
