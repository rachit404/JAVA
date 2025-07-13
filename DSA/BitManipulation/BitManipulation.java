package DSA.BitManipulation;
// Credit: Striver
public class BitManipulation {
    public static void swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a: "+a+" b: "+b);
    }
    
    public static void check_ith_bit_is_set(int n, int i){
        // boolean check = (n&(1<<i)) != 0;
        boolean check = ((n>>i)&1) != 0;
        
        if(check)
            System.out.println("It is a set bit (i.e. 1)");
        else  
            System.out.println("It is not a set bit (i.e. 0)");
    }
    
    public static void set_ith_bit(int n, int i){
        System.out.println(n|(1<<i));
        /*
         * n=9, i=2 -> 1001
         *              1101 -> n=13
         * 
         *      1001
         *    | 0100
         *    -------
         *    = 1101
         */
    }
    
    public static void clear_ith_bit(int n, int i){
        System.out.println(n&~(1<<i));
        /*
         * n=13, i=2 -> 1101
         *              1001 -> n=9
         * ( 1<<i -> 0100)
         * (~ 0100 -> 1011)
         *      1101
         *    & 1011
         *    -------
         *    = 1001
         */
    }

    public static void toggle_ith_bit(int n, int i){
        System.out.println(n^(1<<i));
        /*
         * n=13, i=1 -> 1101
         *              1111 -> n=15
         * 
         *      1101
         *    ^ 0010
         *    --------
         *    = 1111
         */
    }
    
    public static void remove_last_set_bit(int n){
        System.out.println(n&(n-1));
    }

    public static void power_of_2(int n){
        System.out.println((n&(n-1)) == 0);
        /*
         * n = 16   -> 1000
         * n-1 = 15 -> 0111
         * n = 13   -> 1101
         * n-1 = 12 -> 1101
         */
    }

    //! Big Brain used
    public static void count_no_of_set_bits(int n){
        int count = 0;
        while(n != 0){
            count += n&1;
            n = n>>1;
        }
        System.out.println(count);
        /*
         *  n&1 -> return 1 for odd , 0 for even
         *  n>>1 -> equivalent to n/2
         */
    }
    
    public static void main(String[] args) {
        // swap 2 numbers
        swap(13, 7);
        check_ith_bit_is_set(13, 1);
        set_ith_bit(9, 2);
        clear_ith_bit(13, 2);
        toggle_ith_bit(13,1);
        remove_last_set_bit(3);
        power_of_2(16);
        count_no_of_set_bits(84);
    }
}
