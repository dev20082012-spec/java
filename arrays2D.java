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
    public static void printspiral(int matrix[][]) {
    int startrow = 0;
    int startcolu = 0;
    int endrow = matrix.length-1;
    int endcolu = matrix[0].length-1;
    while(startrow <= endrow && startcolu <= endcolu) {
    // top
    for(int j = startcolu;j<=endcolu;j++) {
        System.out.print(matrix[startrow][j]+" ");

    }
    // right 
    for(int i =startrow + 1; i<=endrow; i++ ) {
        System.out.print(matrix[i][endcolu]+" ");
    }
      // bottom 
for(int j =endcolu - 1; j>=startcolu; j-- ) {
    if(startcolu==endcolu) { // this is bcz if 'row > col' then for not printing the same value in again this is done, also for get print the middle one this is done as acc to while condition this further is not execute. 
        break; // ya na ki ek ko do ya 3 baar print  nahi karvana, as ki {{{5*5}}} matrix ma loop bana ka dekho
    }
        System.out.print(matrix[endrow][j]+" ");
    }
    // left
for(int i = endrow - 1; i>=startrow + 1; i-- ) {
        System.out.print(matrix[i][startcolu]+" ");
    }
    startrow ++;
    startcolu ++;
    endcolu --;
    endrow --;

    }
    System.out.println();
}

                                                    // lc - 8;
    public static int diagonalsum(int matrix[][]) { // HERE WE HAVE TO FIND SUM OF ALL THE DIAGONAL ELEMENTS BOTH PRI D + SEC D 
        int sum = 0;
        

// T.C = O(n^2)
        // for(int i = 0; i < matrix.length; i++) {
        //     for(int j = 0; j< matrix[0].length; j++) {
        //       // PRIMARY DIAGONAL SUM; 
        //         if(i==j) {
        //             sum+=matrix[i][j];
        //         }
        //                 // SECONDARY DIAGONAL SUM METHOD;
        // // HERE THE GORR KARNA VALI CHEEZ HAI KI   I + J = N - 1, HAI;
        // else if(i+j == matrix.length-1) {
        //     sum+=matrix[i][j];
        // }
        //     }
        // }

// T.C = O(n)

         for(int i=0; i<matrix.length; i++) {
            // PD 
            sum+=matrix[i][i];
            // SD = i+j = n-1, such that j = n-1-i.
            if(i != matrix.length-i-1) {      // <-^
            sum+=matrix[i][matrix.length-i-1]; //  | isma overlaping ho gayi hai as ki 3*3 matrix ma (1,1) do baar count ho jayaga so ek orr comdition dalni hai.
            }
         }


 return sum;

    }                                                

public static boolean staircasesearch(int matrix[][], int key) {
    int row = 0 , col = matrix[0].length-1; // yha pa hamna "top right" ko apna starting pt consider kara hai bcz vha sa chalna easy rahata hai seen in copy or repeaat array2D last 10 lc.
    while(row < matrix.length && col >=0) {
        if(matrix[row][col]==key) {
            System.out.println("found key at : "+row+","+col+", (0 indexing based so add 1 if want real life matrix case, THANK YOU )" );
return true;
        }

    else if (key < matrix[row][col]) {
        col--;
    } else {
        row++;// as ki key>current i,j;
    }
    }
    System.out.println("key not found!");
return false;
}
    public static void main(String args[]) {
        int matrix[][] = {{10,20,30,40}, 
                          {15,25,35,45}, 
                          {27,29,37,48}, 
                          {32,33,39,50}};
// printspiral(matrix);
// System.out.println(diagonalsum(matrix));
int key = 33;
staircasesearch(matrix, key);
    }
 }
