package wm.zhanlu.learning.leetcode;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int idxA = 0;
        int idxB = 1;
        for (; idxB < nums.length; idxB++) {
            if (nums[idxB] != nums[idxA]) {
                nums[++idxA] = nums[idxB];
            }
        }
        return idxA+1;
    }

}
