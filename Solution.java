import java.util.*;
   public class Solution {
    public static int differenceOfSums(int n, int m) {
        int sum = 0;
        int su = 0;
        for(int i=1;i<=n;i++) {
            if(i%m==0) {
                continue;
            }  
            sum=sum+i;
            }
            for(int i=1;i<=n;i++) {
            if(i%m==0) {
              su=su+i;
            }  

            }
        System.out.println("Integers in the range [1, n] that are not divisible by 3 have sum equal to "+sum);
        System.out.println("Integers in the range [1, n] that are divisible by 3 have sum equal to "+su);
        System.out.println("Sums difference "+ (sum-su));
    return 0;
    }
    public static void main(String args[]) {
     int n = 5;
     int m = 1;
     differenceOfSums(n,m);
    }
}

