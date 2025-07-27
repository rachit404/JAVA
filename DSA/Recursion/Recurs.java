package DSA.Recursion;

public class Recurs {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0)
            return 1; // Base case
        return n * factorial(n - 1);
    }

    // Recursive method to reverse an array
    public static void reverse(int[] a, int i){
        int len = a.length;
        if(i >= len/2) return;
        // swap
        int temp = a[i];
        a[i] = a[len-i-1];
        a[len-i-1] = temp;
        reverse(a, i+1);
    }

    // Recursive method to check palindrome
    public static boolean isPalindrome(String s, int i){
        int len = s.length();
        if(i >= len/2) return true;
        if(s.charAt(i) == s.charAt(len-i-1))
            return isPalindrome(s, i+1);
        return false;
    }
    
    // Recursive method to return fiboncci series element at specified index
    public static int fibonacciElement(int idx){
        if(idx <= 1) return idx;
        return fibonacciElement(idx-2) + fibonacciElement(idx-1);
    }

    public static void main(String[] args) {
        //! Example usage
        // System.out.println("Factorial: " + factorial(5));

        // int arr[] = {1,2,3,4,5,6};
        // reverse(arr, 0);
        // System.out.println("Reverse array: " + Arrays.toString(arr)); 

        // String s = "NAMAN";
        // System.out.println("isPalindrome: " + isPalindrome(s, 0));

        System.out.println("Fibonacci at idx 5: " + fibonacciElement(7));
    }

    
}