import java.util.*;
public class BitManipulation {
    public static void oddOReven(int n ) {
        int bitmask = 1;
        if((n & bitmask) == 0) {
            System.out.println("the given no. is even");
        } else {
            System.out.println("the given no. is odd");
        }
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
System.out.print(" enter your number of choice : ");
int n = sc.nextInt();
oddOReven(n);
    }
    
}
