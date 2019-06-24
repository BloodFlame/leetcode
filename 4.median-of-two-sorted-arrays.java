/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int mid1 = 0;
        int mid2 = 0;
        int a = 0;
        int b = 0;
        int n = 0;
        if ((nums1.length+nums2.length)%2 == 0) {
            mid1 = (nums1.length+nums2.length)/2;
            mid2 = (nums1.length+nums2.length)/2 + 1;
        } else {
            mid1 = (nums1.length+nums2.length)/2 + 1;
            mid2 = (nums1.length+nums2.length)/2 + 1;
        }
        while(n < mid2) {
            n++;
            a = b;
            if ( i == nums1.length ) {
                b = nums2[j];
                j++;
                continue;
            } 
            if ( j == nums2.length ) {
                b = nums1[i];
                i++;
                continue;
            }
            if ( nums1[i] < nums2[j] ) {
                b = nums1[i];
                i++;
            } else {
                b = nums2[j];
                j++;
            }
        }
        if (mid1 == mid2) {
            return b;
        }else {
            return (double)(a + b) / 2.0;
        }
    }
}

