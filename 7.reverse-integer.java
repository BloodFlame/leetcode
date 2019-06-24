/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */
class Solution {
    public int reverse(int x) {
        long result = 0;
        if ( x > (Math.pow(2,31)-1) || x < (-Math.pow(2,31)) ) {
            return 0;
        }
        while ( x!=0 ) {
            result = result * 10 + x%10;
            x = x/10;
        }
        if ( result > (Math.pow(2,31)-1) || result < (-Math.pow(2,31)) ) {
            return 0;
        }
        return (int) result;
    }
}

