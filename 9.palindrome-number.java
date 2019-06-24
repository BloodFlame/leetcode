/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int p = 0;
        int x0 = x;
        while (x0!=0) {
            p = p*10 + x0%10;
            x0 = x0/10;
        }
        return p==x;
    }
}

