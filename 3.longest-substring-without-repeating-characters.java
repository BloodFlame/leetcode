import java.util.Map;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (j < s.length()) {
            if (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i++));
            } else {
                set.add(s.charAt(j++));
                maxLen = Math.max(maxLen, set.size());
            }
        }
        maxLen = Math.max(maxLen, set.size());
        return maxLen;
    }
}

