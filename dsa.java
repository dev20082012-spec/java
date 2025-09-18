public class dsa {
    // #22 trapping rainwater
    public static int trappingwater(int height[]) {    // T.C = O(n) as it's t.c depent upon no. of bars


     //************     here the meant of n-1 is the last element as the height.lengthb meant total ele let that is equal to 7 but arrays work on index for this we take n-1 as index start from 0 to n-1 of the element */




        int n = height.length;
    /// calculate left max boundary -  array
    int leftmax[] = new int[n];
    leftmax[0] = height[0]; 
     for(int i = 1;i<n;i++) {
        leftmax[i] = Math.max(height[i],leftmax[i-1]);// yha pa minus 1 bcz pichla vala ka compare karna hai
     }
    
    /// calculate right max boundary - array
    int rightmax[] = new int[n];
    rightmax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i++) {
            rightmax[i] = Math.max(height[i],rightmax[i+1]);// yha pa plus 1 bcz hamna ulta suru kiya hai so hama ek picha means greater index ka dekhna hai.  
        }

int trappedWater = 0;
    // loop
     for(int i = 0;i<n;i++) {
     // watrelevel = min(leftmax bound, rightmax bound)
       int waterlevel = Math.min(leftmax[i],rightmax[i]);
        
       
   
    // trapped water = waterlevel - height[i] 
       trappedWater += waterlevel - height[i];

     }
        return trappedWater;
    }
 public static void main(String args[]) {
    int height[] = {4,2,0,6,3,2,5};
    System.out.println(trappingwater(height));
 }
}
