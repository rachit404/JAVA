package DSA.Recursion;

import java.util.*;

public class Subsequence {
    // Recursion method to print all subsequences
    public static void print_subsequence(int idx, int n, List<Integer> list, List<Integer> ans) {
        if (idx >= n) {
            System.out.println(ans);
            return;
        }
        ans.add(list.get(idx));
        print_subsequence(idx + 1, n, list, ans);
        ans.remove(ans.size() - 1);
        print_subsequence(idx + 1, n, list, ans);

    }

    // Recursion method to print all subsequences with sum = k
    public static void print_subsequence_sum(int idx, int n, List<Integer> list, List<Integer> ans, int sum, int k) {
        if (idx >= n) {
            if (sum == k)
                System.out.println(ans);
            return;
        }
        ans.add(list.get(idx));
        print_subsequence_sum(idx + 1, n, list, ans, sum + list.get(idx), k);
        ans.remove(ans.size() - 1);
        print_subsequence_sum(idx + 1, n, list, ans, sum, k);

    }
    
    // Recursion method to print one subsequence with sum = k
    public static boolean print_one_subsequence_sum(int idx, int n, List<Integer> list, List<Integer> ans, int sum,
            int k) {
        if (idx >= n) {
            if (sum == k) {
                System.out.println(ans);
                return true;
            } else
                return false;
        }
        ans.add(list.get(idx));
        if (print_one_subsequence_sum(idx + 1, n, list, ans, sum + list.get(idx), k) == true)
            return true;
        ans.remove(ans.size() - 1);
        return print_one_subsequence_sum(idx + 1, n, list, ans, sum, k);
    }

    // Recursion method to count all subsequences with sum = k
    public static int count_subsequence_sum(int idx, int n, List<Integer> list, List<Integer> ans, int sum, int k) {
        if (idx >= n) {
            if (sum == k)
                return 1;
            return 0;
        }
        ans.add(list.get(idx));
        int l = count_subsequence_sum(idx + 1, n, list, ans, sum + list.get(idx), k);
        ans.remove(ans.size() - 1);
        int r = count_subsequence_sum(idx + 1, n, list, ans, sum, k);
        return l + r;

    }

    /*
     ? @params
     * idx - index
     * n - list.size()
     * list - input list
     * ans - storing various subsequences
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);

        List<Integer> ans = new ArrayList<>();
        // print_subsequence(0, list.size(), list, ans);

        int k = 3;
        // print_subsequence_sum(0, list.size(), list, ans, 0, k);
        // print_one_subsequence_sum(0, list.size(), list, ans, 0, k);
        System.out.println("Count is: " + count_subsequence_sum(0, list.size(), list, ans, 0, k));
    }
}
