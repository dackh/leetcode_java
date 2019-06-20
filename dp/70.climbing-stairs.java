/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i=1;i<n;i++){
            if(i ==1){
                dp[i] = 2;
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n-1];
    }
}

