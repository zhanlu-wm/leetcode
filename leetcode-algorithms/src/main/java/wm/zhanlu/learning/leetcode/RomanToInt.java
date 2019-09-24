package wm.zhanlu.learning.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    private static Map<Character, Integer> romanIntMap = new HashMap<>();

    static {
        romanIntMap.put('M', 1000);
        romanIntMap.put('D', 500);
        romanIntMap.put('C', 100);
        romanIntMap.put('L', 50);
        romanIntMap.put('X', 10);
        romanIntMap.put('V', 5);
        romanIntMap.put('I', 1);
    }

    public int romanToInt(String s) {

        int n = 0;
        if (s != null && s.length() > 0) {
            int len = s.length();
            for (int i=0; i<len; i++) {
                int j = i + 1;
                if (j == len) {
                    n = n + romanIntMap.get(s.charAt(i));
                } else {
                    if (romanIntMap.get(s.charAt(i)) >= romanIntMap.get(s.charAt(j))) {
                        n = n + romanIntMap.get(s.charAt(i));
                    } else {
                        n = n - romanIntMap.get(s.charAt(i)) + romanIntMap.get(s.charAt(j));
                        i++;
                    }
                }
            }
        }
        return n;
    }

}
