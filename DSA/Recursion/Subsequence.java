package DSA.Recursion;
import java.util.*;

public class Subsequence {
    // Recursion method to print all subsequences
    public static void print_subsequence(int idx,int n,List<Integer> list, List<Integer> ans){
        if(idx >= n){
            System.out.println(ans);
            return;
        }
        ans.add(list.get(idx));
        print_subsequence(idx+1, n, list, ans);
        ans.remove(list.get(idx));
        print_subsequence(idx+1, n, list, ans);

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);

        List<Integer> ans = new ArrayList<>();
        print_subsequence(0, list.size(), list, ans);
    }
}
