/*
    ! cmd: java DSA/Recursion/CombinationSum.java
    ? https://leetcode.com/problems/combination-sum/
*/
package DSA.Recursion;

import java.util.*;
class CombinationSum {
    public static void combinationSum1(int idx, List<List<Integer>> result, List<Integer> ans, int[] candidates, int target){
        if(idx == candidates.length){
            if(target == 0)
                result.add(new ArrayList<>(ans));
            return;
        }
        if(candidates[idx] <= target)
        {
            ans.add(candidates[idx]);
            combinationSum1(idx, result, ans, candidates, target-candidates[idx]);
            ans.remove(ans.size()-1);
        }
        combinationSum1(idx+1, result, ans, candidates, target);
    }
    public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        combinationSum1(0, result, ans, candidates, target);
        // System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        System.out.println(combinationSum(candidates, target));
    }
}