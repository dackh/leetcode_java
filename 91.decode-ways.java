/*
 * @lc app=leetcode id=91 lang=java
 *
 * [91] Decode Ways
 */
class Solution {
    public int numDecodings(String s) {
        int len = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(1) != '0' ? 1 : 0;
        for(int i = 2;i<=len;i++){
            if(s.charAt(i))
        }
    }
}

