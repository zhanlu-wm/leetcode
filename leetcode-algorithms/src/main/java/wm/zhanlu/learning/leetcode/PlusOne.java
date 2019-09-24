package wm.zhanlu.learning.leetcode;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int add;
        while (i >= 0) {
            add = digits[i] + 1;
            digits[i] = add%10;
            if (add / 10 == 1) {
                i--;
            } else {
                return digits;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        System.arraycopy(digits, 0, newDigits, 1, digits.length);
        return newDigits;
    }

}
