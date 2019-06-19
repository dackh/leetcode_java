/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int cur = Integer.MIN_VALUE;
        int res = cur;
        for(int num : nums){
            cur = num + (cur > 0 ? cur : 0);
            res = Math.max(res,cur);
        }
        return res;
    }
}

