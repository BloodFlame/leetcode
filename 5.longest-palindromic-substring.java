/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 * 
 */
class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        int max_i = 1;
        int R = 0;
        int p = 0;
        int[] Len = new int[2*s.length()+3];
        String temp = "@";
        for (int i = 0; i < s.length(); i++) {
            temp += "#";
            temp += s.charAt(i);
        }
        temp += "#&";
        for (int i = 1; i < temp.length() - 1; i++) {
            if (i < R) {
                Len[i] = Math.min(Len[2*p-i], R-i);
            } else {
                Len[i] = 0;
                p = i;
                R = i;
            }
            if ( i >= R || i + Len[i] >= R) {
                while (temp.charAt(R+1) == temp.charAt( 2*i-R-1)) {
                    Len[i]++;
                    R++;
                    p = i;
                }
            }
            if (max < Len[i]) {
                max = Len[i];
                max_i = i;
            }
        }
        return s.substring((max_i-max+1)/2-1, (max_i+max-1)/2);
    }
}

