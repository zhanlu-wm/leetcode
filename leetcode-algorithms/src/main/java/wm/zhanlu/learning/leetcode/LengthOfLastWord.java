package wm.zhanlu.learning.leetcode;

public class LengthOfLastWord {
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
