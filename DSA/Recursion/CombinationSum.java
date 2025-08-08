/*
    ! cmd: java DSA/Recursion/CombinationSum.java
    ? https://leetcode.com/problems/combination-sum/
    ? https://leetcode.com/problems/combination-sum-ii/
*/
package DSA.Recursion;

import java.util.*;

class CombinationSum {
    public static void combinationSum1(int idx, List<List<Integer>> result, List<Integer> ans, int[] candidates, int target) {
        if (idx == candidates.length) {
            if (target == 0)
                result.add(new ArrayList<>(ans));
            return;
        }
        if (candidates[idx] <= target) {
            ans.add(candidates[idx]);
            combinationSum1(idx, result, ans, candidates, target - candidates[idx]);
            ans.remove(ans.size() - 1);
        }
        combinationSum1(idx + 1, result, ans, candidates, target);
    }

    public static void combinationSum2(int idx, List<List<Integer>> result, List<Integer> ans, int[] arr, int target){
        if(target == 0){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i=idx; i<arr.length;i++){
            if(i > idx && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;
            
            ans.add(arr[i]);
            combinationSum2(i+1, result, ans, arr, target-arr[i]);
            ans.remove(ans.size()-1);
        }
        
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        // combinationSum1(0, result, ans, candidates, target);

        Arrays.sort(candidates);
        combinationSum2(0, result, ans, candidates, target);
        
        return result;
    }

    public static void main(String[] args) {
        //* combinationSum1
        // int[] candidates = { 2, 3, 6, 7 };
        // int target = 7;

        //* combinationSum2
        int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;

        System.out.println(combinationSum(candidates, target));
    }
}