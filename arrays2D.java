// import java.util.*;
// public class arrays2D {

//     public static boolean search(int matrix[][],int key) { // here we made this for searching any other element in matrix.
//               for(int i= 0;i<matrix.length;i++) {
//             for(int j = 0;j<matrix[0].length;j++) {
//                 if(matrix[i][j]==key) {
//                     System.out.println("found at cell/index (" +i+","+j+")");
//                     return true;
//                 }
//             }
//         }
//  System.out.println("key not found");
//  return false;
//     }
//     public static void main(String args[]) {
//         int matrix[][] = new int[3][3];
//         int n = matrix.length, m = matrix[0].length ; // int n = 3, m = 3 ; also can done this; matrix[0].length means ki 0 index vali row ka total columns bcz nicha dekho.
//         Scanner sc = new Scanner(System.in);
//        // input
//         for(int i= 0;i<n;i++) {
//             for(int j = 0;j<m;j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//       // output 
//        for(int i= 0;i<n;i++) {
//             for(int j = 0;j<m;j++) {
//                 System.out.print(matrix[i][j]+ " ");
//             }
//         System.out.println();
//         }
//         search(matrix,51);
//    /* Why do we use matrix[0].length instead of just matrix.length twice?

// Because in a 2D array, different rows can have different column lengths in Java!

// Example:

// int matrix[][] = {
//     {1, 2, 3},
//     {4, 5},
//     {6, 7, 8, 9}
// };


// Here:

// matrix.length = 3 (3 rows)

// matrix[0].length = 3

// matrix[1].length = 2

// matrix[2].length = 4

// That’s why we write:

// int n = matrix.length;
// int m = matrix[0].length;


// to correctly get the number of rows and columns for the first row. */ 
//     }
// }


//                               homework based on above lc 4 learning ||
//                                                                     \/



//                               here we identified max value in matrix; same is for min value have to done.




// import java.util.*;
// public class arrays2D {

//     public static int search(int matrix[][]) { // here we made this for searching any other element in matrix.
//         int l = Integer.MIN_VALUE;      
//         for(int i= 0;i<matrix.length;i++) {
//             for(int j = 0;j<matrix[0].length;j++) {
//                 int compare = Math.max(l,matrix[i][j]);
//                 l = compare;
//                 }
//             }
//             System.out.println("the largest value in the matrix is : " + l );
// return 0;
//         }
 
    
//     public static void main(String args[]) {
//         int matrix[][] = new int[3][3];
//         int n = matrix.length, m = matrix[0].length ; // int n = 3, m = 3 ; also can done this; matrix[0].length means ki 0 index vali row ka total columns bcz nicha dekho.
//         Scanner sc = new Scanner(System.in);
//        // input
//         for(int i= 0;i<n;i++) {
//             for(int j = 0;j<m;j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//       // output 
//        for(int i= 0;i<n;i++) {
//             for(int j = 0;j<m;j++) {
//                 System.out.print(matrix[i][j]+ " ");
//             }
//         System.out.println();
//         }
//         search(matrix); }
//     }



// lc 5 and further;

import java.util.*;
 public class arrays2D { 
    public static void main(String args[]) {
        int 
    }
 }
