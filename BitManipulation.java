import java.util.*;
public class BitManipulation {
    public static void oddOReven(int n ) { // lc 10
        int bitmask = 1; 
        if((n & bitmask) == 0) {
            System.out.println("the given no. is even");
        } else {
            System.out.println("the given no. is odd");
        }
    }
    public static int getIthBIT(int n, int i) { // lc 11
        int bitmask = 1<<i;
        if((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static int setITHbit(int n, int i) { // lc 12
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int clearITHbit(int n, int i) { // lc 13
    int bitmask = ~(1<<i);
    return n & bitmask;
    }
    public static int updateITHBIT(int n, int i, int newbit) { // lc 14
// Simplest way to done this.
        // if(newbit == 0) {
        //     return clearITHbit(n, i);
        // } else {
        //     return setITHbit(n, i);
        // }

// ANOTHER EASY WAY TO APPROACH THIS.        
 n = clearITHbit(n, i);
 int bitmask = newbit<<i;
 return n | bitmask;    
}
public static int clearIbit(int n, int i) { // lc 15
    int bitmask = (~0) << i; // also knows ~0 = -1, can use -1 << i ; 
    return n & bitmask;    

}
public static int clear_range0f_bits(int n, int i, int j) { // lc 16
    int a = ((~0) << (j+1));
    int b = (1<<i) -1;
    int bitmask = a | b;
    return n & bitmask;
}
public static boolean power_twoORnot(int n) { // lc 17
    return (n&(n-1)) == 0;
}
public static int count_set_bits_number(int n) { // lc 18
    int count = 0;
    while(n>0) {
        if((n&1) != 0) { // check our LSB
            count++;
        } 
        n = n>>1;
    }
    return count;
}
public static int fast_EXPONENTIATION(int a, int n) { // lc 20
    int ans = 1;
    while(n>0) {
        if((n&1) != 0) { // check LSB
            ans = ans * a;
        } 
        a = a*a;
        n = n>>1;
    } 
    return ans;
}
    public static void main(String args[]) {
        // lc 4 binary and 
        // System.out.println(5&6);
        // lc 5 binary OR 
        // System.out.println(5 | 6);
        // lc 6 binary XOR 
        // System.out.println(5 ^ 6);
        // lc 7 binary ONE COMPLEMENT 
        // System.out.println(~ -1);
        // lc 8 binary LEFT SHIFT 
        // System.out.println(5<<2);
        // lc 9 binary RIGHT SHIFT 
        // System.out.println(6>>1);
        // lc 10 ODD OR EVEN
        Scanner sc = new Scanner(System.in);
        // System.out.print(" enter your number of choice : ");
        // int n = sc.nextInt();
        // oddOReven(n);

        // lc 11 GET ITH BIT
        // System.out.println(getIthBIT(10, 1));
        
        // lc 12 SET ITH BIT
        // System.out.println(setITHbit(10, 2));
        
        // lc 13 CLEAR ITH BIT
        // System.out.println(clearITHbit(10, 1));
        
        // lc 14  update ITH bit
        // System.out.println(updateITHBIT(10, 2, 1));
        
        // lc 15 clear last I bit
        // System.out.println(clearIbit(15,2));     
        
        // lc 16 CLEAR RANGE OF BITS
        // System.out.println(clear_range0f_bits(10, 2, 4)); 
                
        // lc 17 CHECK IF A NO. IS POWER OF 2 OR NOT
        // System.out.println(power_twoORnot(16));
                        
        // lc 18 COUNT SET BITS IN NO.
        // System.out.println(count_set_bits_number(15));
                    
        // lc 20 fast EXPONENTIATION code.
        System.out.println(fast_EXPONENTIATION(3, 5));
    }
    
}
