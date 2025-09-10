import java.util.*;
public class arrays {
//     public static void main(String args[] ) {

//         /// / //  1ST LC 
//         // /// 1st way to declare arrays 
//         // int marks[] = new int[50];
//         // /// 2nd way to declare arrays
//         // int numbers[] = {1,2,3}; 
         
    
    
//     /// // /// 2ND LC \\
    
    

    
// // int marks[] = new int[100];

// //  Scanner sc = new Scanner(System.in);
// //   // simplest way to input values in arrays function  int phy= sc.nextInt();
// // marks[0] = (int)sc.nextFloat(); // phy
// // marks[1] = (int)sc.nextFloat(); // chem
// // marks[2] = (int)sc.nextFloat(); // math

// // System.out.println("phy : " + marks[0]);
// // System.out.println("chem : " + marks[1]);
// // System.out.println("math : " + marks[2]);

// // // marks[2] = marks[2] + 1;
// // // System.out.println("math :"+marks[2]);\
// // float percentage = (float)(marks[0]+marks[1]+marks[2])/3;
// // System.out.println("percentage = "+percentage+"%");



// // nterestimng  thing is ki   [[{TO KNOW THE LENGTH OF ARRAY}]]
// System.out.println("length of array = "+ marks.length);// array ka naam and .length simple
//     }




                                                              // 4rd lc //
// public static void update(int marks[],int changable) {
//     changable = changable + 5;
// for(int i = 0;i<marks.length;i++) {
//     marks[i] = marks[i] + 1;
// }
// }

// public static void main(String args[]) {
//     int marks[] = {97,98,94};
//     int changable = 5;
//     update(marks,changable);
//     System.out.println(changable);
//     // instead of writting print marks[0] marks[1] and all this chaos done a """new loop to be written"""

// // print our marks
// for(int i = 0;i<marks.length;i++) {
//     System.out.println(marks[i] + " ");
// } System.out.println();

// /// here the changable not get change {[{[during passing arrays dhayan rakhna hai ki others ki value change nahi hogi]}]}
 
 

// }



                                                  /// [[{ lc 6-linear  seearch}]]

// public static int linearsearch(int numbers[],int key) {
// for(int i = 0;i<numbers.length;i++){
//     if(numbers[i] == key) {
//         return 1;
//     }
// }
// return -1;
// }
//  public static void main(String args[]) {
//     int numbers[] = {2,4,6,8,10,12,14,16,18,20};
//     int key = 40;
//     int index = linearsearch(numbers,key);
//     if(index==-1) {
//         System.out.println("not found = " + index);
//     } else {
//         System.out.println("key is at index = " +index);
//     }
//  }             





                                                  /// [[{ lc 7-largest no.}]]


  // public static int getlargest(int numbers[]) {
// int largest = Integer.MIN_VALUE;  //  -INFINITY;
// int smallest = Integer.MAX_VALUE;  //  +INFINITY;
//  for(int i =0;i<numbers.length;i++) {
//         if(largest<numbers[i]) {
//             largest=numbers[i];
// }
//  if(smallest>numbers[i]) {
//             smallest=numbers[i];
// }

//  }
//  System.out.println("smallest value is : "+smallest);
//  return largest;
// // also here can done ki syso(largest) & reutrn 0 ; result will  be same
// }

//   public static void main(String args[]) {
//     int numbers[] = {1,2,3,0,6,8,4,20,5,16};
//    System.out.println("largest value is : "+getlargest(numbers));


//         }
    //***************************************** remember ki initialisation for max and min ka***********************************
  



                                                  /// [[{ lc 8-binary search}]]
 

  public static int binarysearch(int numbers[],int key) {
    int start = 0, end = numbers.length-1;  
    while(start<=end) {
        int mid = (start+end)/2;

        // comparisons 
        if(numbers[mid] == key) {   // found 
            return mid;
        }
        if(numbers[mid]<key) {    // RIGHT
            start = mid +1;

        } else {  // LEFT 
        end = mid-1;    
        }
    }
return -1;
  }                                                 
   public static void main(String args[]) {
    int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
    int key = 25; 
 int s = binarysearch(numbers, key);
 if(s==-1) {
    System.out.println("the data entered is out of range : "+s);
 } else {
    System.out.println("the index of the key is :"+s);
 }

}

}                                 



