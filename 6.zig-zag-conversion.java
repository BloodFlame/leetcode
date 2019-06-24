/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] ZigZag Conversion
 */
class Solution {
    public String convert(String s, int numRows) {
        int rownum = 0;
        int step = 0;
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] S = new StringBuilder[numRows];
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            S[i] = new StringBuilder();
        }
        for (int i = 0; i < s.length(); i++) {
            S[rownum].append(s.charAt(i));
            if (rownum == numRows-1) {
                step = -1;
            }
            if (rownum == 0) {
                step = 1;
            }
            rownum = rownum + step;
        }
        for (int i = 0; i < numRows; i++) {
            ret.append(S[i].toString());
        }
        return ret.toString();
    }
}

