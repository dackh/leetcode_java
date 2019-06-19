import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


/*
 * @lc app=leetcode id=51 lang=java
 *
 * [51] N-Queens
 */
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        List<String> list = new ArrayList<>();
        boolean[] column = new boolean[n];
        boolean[] leftDiagonal = new boolean[2*n];
        boolean[] rigthDiagonal = new boolean[2*n];
        helper(0,column,leftDiagonal,rigthDiagonal,res,list);
        return res;
    }

    public void helper(int rowIndex,boolean[] column,boolean[] leftDiagonal,
                        boolean[] rightDiagonal,List<List<String>> res,List<String> list){
        int n = column.length;
        if(rowIndex == n){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0;i<n;i++){
            if(column[i] || leftDiagonal[rowIndex-i+n-1] || rightDiagonal[rowIndex+i]){
                continue;
            }
            char[] ch = new char[n];
            Arrays.fill(ch, '.');
            ch[i] = 'Q';
            list.add(new String(ch));
            column[i] = true;
            leftDiagonal[rowIndex-i+n-1] = true;
            rightDiagonal[rowIndex+i] = true;
            helper(rowIndex+1,column,leftDiagonal,rightDiagonal,res,list);
            ch[i] = '.';
            list.remove(list.size()-1);
            column[i] = false;
            leftDiagonal[rowIndex-i+n-1] = false;
            rightDiagonal[rowIndex+i] = false;
        }
    }
}

