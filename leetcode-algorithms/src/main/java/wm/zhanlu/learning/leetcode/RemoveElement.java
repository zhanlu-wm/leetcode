package wm.zhanlu.learning.leetcode;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        for (; i < nums.length; i++) {
            if (nums[i] == val) {
                while (j >= 0 && nums[j] == val) {
                    j--;
                }
                if (i >= j) {
                    break;
                } else {
                    nums[i] = nums[j];
                    nums[j] = val;
                    j--;
                }
            }
        }
        return j+1;
    }

}
