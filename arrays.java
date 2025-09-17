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
  



                                                  /// [[{ lc 9-binary search}]]
 

//   public static int binarysearch(int numbers[],int key) {
//     int start = 0, end = numbers.length-1;  
//     while(start<=end) {
//         int mid = (start+end)/2;

//         // comparisons 
//         if(numbers[mid] == key) {   // found 
//             return mid;
//         }
//         if(numbers[mid]<key) {    // RIGHT
//             start = mid +1;

//         } else {  // LEFT 
//         end = mid-1;    
//         }
//     }
// return -1;
//   }                                                 
//    public static void main(String args[]) {
//     int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
//     int key = 25; 
//  int s = binarysearch(numbers, key);
//  if(s==-1) {
//     System.out.println("the data entered is out of range : "+s);
//  } else {
//     System.out.println("the index of the key is :"+s);
//  }

// }



                                                  /// [[{ lc 10-reverse arrays with in mind  S*C  }]]

//  public static void reverse(int numbers[]) {
//     int first = 0, last = numbers.length-1;
//     while(first<last) {
//         // swap
//         int temp = numbers[last]; // temp is an temperary variable
//         numbers[last] = numbers[first];
//         numbers[first] = temp;

//         first++;
//         last--;
//     }
//  }
//    public static void main(String args[]) {
//     int numbers[] = {2,4,6,8,10};
//      reverse(numbers);
//      for(int i = 0;i<numbers.length;i++) {
//         System.out.print(numbers[i]+" ");
//      }
// System.out.println();

// }                


                               /// [[{ lc 11-all possible pairs in an array }]]   nested loop to be used
                               
// public static void printpairs(int numbers[]) {
//    int totalpairs=0;
// for(int i = 0;i<numbers.length;i++) {
//    int curre = numbers[i];
//    for(int j = i+1;j<numbers.length;j++) {
//       System.out.print("("+curre+","+numbers[j]+")");
//    totalpairs++;
//    } System.out.println();
// } System.out.println("total pairs ="+totalpairs);
// }
// public static void main(String args[]) {
//     int numbers[] = new int[15]; 
//     numbers[0] = 1;
//      printpairs(numbers);            
// }
// //////////////////
// ///       imp for interview
// /// 
// ///  formula for total pairs in an arrays = n(n-1)/2



// ***************************************************************************************************mast question*****************************************************************************************************
                               /// [[{ lc 12-print subarrays }]]   nested loop to be used
    
// public static void printsubarrays(int n[]) {
//    int ts = 0;
// for(int i = 0;i<n.length;i++) {
// /// int start = i;
//    for(int j=i;j<n.length;j++) {
//      /// int end = j;
//      for(int k = i;k<=j;k++) {    // print 
//       System.out.print(n[k]+" ");  // subarray
//      } 
//      int sum = 0;
//      for(int l = i;l<=j;l++) {
//       sum+=n[l];
        
//      }
//      System.out.println("sum of the subarray "+sum);
//      ts++;
//      System.out.println();
//    } System.out.println();
// } System.out.println("total subarrays = "+ts);
// }
// public static void main(String args[]) {
//    int n[]={2,4,6,8,10};
//    printsubarrays(n);
// }





                                /// [[{ lc 13-max. subarrays sum }]]   nested loop to be used
 
// public static void maxsubarray_sum(int number[]) {

// int currsum = 0;
// int maxsum = Integer.MIN_VALUE;
// for(int i =0;i<number.length;i++) {
//   for(int j = i;j<number.length;j++) {
//     currsum = 0;
//     for(int k=i;k<=j;k++) {
//       currsum+=number[k];

//     }
//   System.out.print(currsum);
//   if(maxsum<currsum) {
//     maxsum=currsum;
//   }

  
// System.out.println();
  
//   }

// System.out.println();
// }
// System.out.println("MAX SUM = "+maxsum); 

// } 
// public static void main(String args[]) {
//   int number[] = {1,-2,46,-1,3};
//   maxsubarray_sum(number);
// }






                                /// [[{ lc 14-max. subarrays sum (prefix sum array)}]]   nested loop to be used
                                ///  nearly code same as 13 lc;
                                // public static void maxsubarray_sum(int number[]) {



// public static void maxsubarray_sum(int number[]) {
// int currsum = 0;
// int maxsum = Integer.MIN_VALUE;
// int prefix[] = new int[number.length];


// prefix[0] = number[0];
// // as o index ele takk tho sirf uska sum means ki vo hi hai isliya ya nicha vala loop ma 1 sa start hua hai;
// // calculate prefix array;
// for(int i = 1;i<prefix.length;i++) {
// prefix[i] = prefix[i-1] + number[i];
// // iska above ka through hamna phala ek array bana diya jo ki ele ka sum ka equal hai.
// // ab aaga hamm ya uss array ma prefix[] ma index ka help sa uss set ma j-i karanaga and answer jaldi aa jayaga so the time complexcity is less than the above code;

// }

// for(int i =0;i<number.length;i++) {
//   for(int j = i;j<number.length;j++) {
//     currsum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];
//     // for(int k=i;k<=j;k++) {
//     //   currsum+=number[k];

//     // }
//   //System.out.print(currsum);
//   if(maxsum<currsum) {
//     maxsum=currsum;
//   }
  
//   }

// }
// System.out.println("MAX SUM = "+maxsum); 

// } 
// public static void main(String args[]) {
//   int number[] = {1,-2,6,-1,3,6,7,7,45,345,-345,66,4,3};
//   maxsubarray_sum(number);
// }




                                /// [[{ lc 15-max. subarrays sum (****KADANE'S**** algorithms)}]]   nested loop to be used
                                ///  nearly code same as 13,14 lc;
                                
public static void maxsubarraysum_KADANES(int number[]) {
int cs = 0;
int ms = Integer.MIN_VALUE;
for(int i = 0;i<number.length;i++) {
  cs = cs+number[i];
  if(cs<0) {
    cs=0;
  }
ms = Math.max(ms,cs);


}

System.out.println("our max subarray sum : "+ms);
}


// chatgpt ka updated                         KADANE'S            FOR when all array no. are  *****NEGATIVELY***** 
public static void negative_KADANES(int number[]) {
int cs = number[0]; // yha pa initialize kara hai cs ko first ele sa of array
int ms = Integer.MIN_VALUE; // or here we can also done ms = number[0];
for(int i = 0;i<number.length;i++) {
  cs = Math.max(number[i],cs+number[i]);
ms = Math.max(ms,cs);
}

System.out.println("our max subarray sum : "+ms);

}
public static void main(String args[]) {
  int number[] = {-2,-3,4,-1,-2,1,5,-3};
//maxsubarraysum_KADANES(number);
negative_KADANES(number);
}


}