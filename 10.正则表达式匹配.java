/*
 * @lc app=leetcode.cn id=10 lang=java
 *
 * [10] 正则表达式匹配
 */
class Solution {
    public boolean isMatch(String s, String p) {
        //System.out.println("s: "+s+" p: "+p);
        if (p.length() == 0) {
            return s.length() == 0;
        }
        if (p.length() > 1 && p.charAt(1) == '*') {
            if (s.length() == 0) {
                return isMatch(s, p.substring(2));
            }
            return ((p.charAt(0) == '.' || p.charAt(0) == s.charAt(0)) 
                && isMatch(s.substring(1), p)) || isMatch(s, p.substring(2));
        } else {
            if (s.length() == 0) {
                return false;
            }
            return ((p.charAt(0) == '.' || p.charAt(0) == s.charAt(0)) 
            && isMatch(s.substring(1), p.substring(1)));
        }
    }
}

