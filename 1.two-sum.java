import java.lang.reflect.Array;
import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                return new int[]{index, i};
            }
            map.put(target-nums[i], i);
        }
        return new int[2];
    }
}

