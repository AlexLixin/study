import java.util.HashMap;
import java.util.Scanner;

public class problem3 {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashMap<Character, Integer> h = new HashMap<>();
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer freq = h.get(c);
            if (freq != null) {
                int length = i - start;
                max = max > length ? max : length;
                start = h.get(c) + 1;
                i = h.get(c);
                h.clear();
            } else {
                h.put(c, i);
            }
        }
        max = max > s.length() - start ? max : s.length() - start;
        return max;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); //$NON-NLS-1$
    }
}
