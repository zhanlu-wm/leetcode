package wm.zhanlu.learning.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *136. 只出现一次的数字
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wangming
 */
public class SingleNumber {


    /**
     * 方法 4：位操作
     * 概念
     *
     * 如果我们对 0 和二进制位做 XOR 运算，得到的仍然是这个二进制位
     * a ⊕ 0 = a
     * 如果我们对相同的二进制位做 XOR 运算，返回的结果是 0
     * a ⊕ a = 0
     * XOR 满足交换律和结合律
     * a ⊕ b ⊕ a = (a ⊕ a) ⊕ b = 0 ⊕ b = b
     * 所以我们只需要将所有的数进行 XOR 操作，得到那个唯一的数字。
     *
     * @param nums
     * @return
     */
    public int singleNumber4(int[] nums) {
        int result = 0;
        for (int num: nums) {
            result ^= num;
        }
        return result;
    }


    /**
     * 方法 3：数学
     * 概念
     *
     * 2 * (a + b + c) - (a + a + b + b + c) = c
     *
     * @param nums
     * @return
     */
    public int singleNumber3(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum1 = 0;
        int sum2 = 0;
        for (int num: nums) {
            if (!set.contains(num)) {
                set.add(num);
                sum1 += num;
            }
            sum2 += num;
        }
        return sum1 * 2 - sum2;
    }


    /**
     * 方法 2：哈希表
     * 算法
     *
     * 我们用哈希表避免每次查找元素是否存在需要的 O(n) 时间。
     *
     * 遍历 nums 中的每一个元素
     * 查找 hash_table 中是否有当前元素的键
     * 如果没有，将当前元素作为键插入 hash_table
     * 最后， hash_table 中仅有的一个元素就是目标元素
     *
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }


    /**
     * 方法 1：列表操作
     * 算法
     *
     * 遍历 nums 中的每一个元素
     * 如果某个 nums 中的数字是新出现的，则将它添加到列表中
     * 如果某个数字已经在列表中，删除它
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num: nums) {
            if (list.contains(num)) {
                list.remove(Integer.valueOf(num));
            } else {
                list.add(num);
            }
        }
        return list.get(0);
    }

}
