/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */
class Solution {
    public int myAtoi(String str) {
        long result = 0;
        boolean start = false;
        int flag = 1;
        for (int i = 0; i < str.length(); i++){
            switch(str.charAt(i)) {
                case ' ':
                    if(start) {
                        return (int) result;
                    }
                    break;
                case '+':
                    if(start) {
                        return (int) result;
                    }
                    flag = 1;
                    start = true;
                    break;
                case '-':
                    if(start) {
                        return (int) result;
                    }
                    flag = -1;
                    start = true;
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    result = result * 10 + flag * (str.charAt(i) - '0');
                    if (result > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    if (result < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                    start = true;
                    break;
                default:
                    return (int) result;
            }
        }
        return (int) result;
    }
}

