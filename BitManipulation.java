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
    public static int updateITHBIT(int n, int i, int newbit) {
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
        
        // lc 14  
        System.out.println(updateITHBIT(10, 2, 1));
    
    }
    
}
