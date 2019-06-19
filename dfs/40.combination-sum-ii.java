import java.util.*;/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(candidates, 0, target, list, res);
        return res;
    }

    public void dfs(int[] candidates,int cur,int target,List<Integer> list,List<List<Integer>> res){
        if (target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        if (target < 0){
            return;
        }
        for(int i = cur;i<candidates.length;i++){
            if(i > cur && candidates[i] == candidates[i-1]){
                continue;
            }
            list.add(candidates[i]);
            dfs(candidates, i+1, target - candidates[i], list, res);
            list.remove(list.size()-1);
        }
    }
}

