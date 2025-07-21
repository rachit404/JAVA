package DSA.LeetCode;
// 31.Next Permutation - https://leetcode.com/problems/next-permutation/description/

import java.util.Arrays;

public class NextPermutation{
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int len = nums.length;
        for(int i = len-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            Arrays.sort(nums);
            return;
        }

        int temp;
        for(int i = len-1; i>idx ;i--){
            if(nums[i] > nums[idx]){
                temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
        int l = idx+1;
        int r = len-1;
        while(l<r){
            temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--; 
        }
    }
    public static void main(String args[]){
        System.out.println("Next Permutation");
        NextPermutation np = new NextPermutation();
        int[] nums = {1, 2, 3};
        np.nextPermutation(nums);
        System.out.println("Next permutation: " + Arrays.toString(nums));
    }
}

/*
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: [1,3,2]
 * 
 * Example 2:
 * Input: nums = [3,2,1]
 * Output: [1,2,3]
 * 
 * Example 3:
 * Input: nums = [1,1,5]
 * Output: [1,5,1]
*/