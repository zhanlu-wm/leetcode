package wm.zhanlu.learning.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wangming
 *
 */
public class TwoSum {

    /**
     * 两遍哈希表
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIdxMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            numIdxMap.put(nums[i], i);
        }
        int i = 0;
        int j = -1;
        for (; i<nums.length-1; i++) {
            int intOne = nums[i];
            int intTwo = target - intOne;
            if (numIdxMap.containsKey(intTwo) && (j = numIdxMap.get(intTwo)) > i) {
                break;
            }
        }
        return j < 0 ? new int[0] : new int[]{i, j};
    }

    /**
     * 一遍哈希表
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numIdxMap = new HashMap<>();
        int j = 0;
        int i = -1;
        for (; j<nums.length; j++) {
            int intTwo = nums[j];
            int intOne = target - intTwo;
            if (numIdxMap.containsKey(intOne)) {
                i = numIdxMap.get(intOne);
                break;
            }
            numIdxMap.put(intTwo, j);
        }

        return i < 0 ? new int[0] : new int[]{i, j};
    }

}
