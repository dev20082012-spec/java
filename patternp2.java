import java.util.*;
public class patternp2 {
    
    // /// / /// HOLLOW  RECTANGLE PATTERN;
    // public static void hollow_rectangle(int totrows , int totcolu ) {
    //     // outer loop;
    //     for(int i = 1; i<=totrows;i++) {
    //         // inner loop - columns;
    //      // vaisa issa inner loop sa kya hoga ki i ki value fix ho jayagi or j ki value condition ka according 1 to totcolu takk jayagi 
    //      // thsi is the functioning as hamna i fix kar di or j ko inc as ki 11 ,12, 13, 14, 15 and so more 

    //         for(int j = 1;j<=totcolu;j++) {
    //             // cell-(i,j) here i represent ki ma konsa row pa hu or uska andar ma konsa columna pa hu vo j represent karaga 

           

    //             if(i == 1 || i == totrows || j == 1 || j == totcolu) {
    //                 // condition for boundary cells that only true for boundary cells;
    //                 System.out.print("*");

    //             } else {
    //             System.out.print(" ");
    //          }
    //         }
    //        /// notice this next line code is written after/outside  the inside loops code;
    //         System.out.println();
    //     } 
     
    // }    
    // public static void main(String args[]) {   

    //     hollow_rectangle(8, 8);
    // }




/// / /// inverted and rotated HALF - PYRAMID



// public static void inverted_rotated_half_pyramid(int n ) {
//     for(int i = 1;i<=n;i++) {
//         // inner loops for space 
//         for(int j = 1; j<=n-i;j++) {
//             System.out.print(" ");
//         }
//         // inner loop for stars
//         for(int k = 1; k<=i;k++) {
//             System.out.print("*");

//         }
//         System.out.println();

//     }
// }


// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in); 
// System.out.println("enter your desired no.");
// int l = sc.nextInt();
// inverted_rotated_half_pyramid(l);
// }




/// / /// // /// /// inverted HALF-PYRAMID c NUMBERS



// public static void inverted_half_pyramid_withnumbers(int n) {
//     for(int i= 1;i<=n;i++) {
//         for(int j= 1;j<=n-i+1;j++) {
//             System.out.print(j+" ");

//         } System.out.println();
//     }
// }

// public static void main (String args[]) {
//  Scanner sc = new Scanner(System.in); 
//  System.out.println("enter your desired no.");
//  int k = sc.nextInt();
//  inverted_half_pyramid_withnumbers(k);
// }






/// / /// /// FLOYD`S TRIANGLE

// public static void floyd_triangle(int n ) {
//     int counter = 1;
//     for(int i = 1;i<=n;i++) {
//         // inner - how many times will the counter be printed 
//         for(int j = 1;j<=i;j++) {
//             System.out.print(counter+" ");
//             counter++;
//         }
//         System.out.println(); 
//     }
  
// }


// public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//      System.out.println("enter your desired no.");
//  int l = sc.nextInt();
//  floyd_triangle(l);

// }







// /// / /// 0-1 TRIANGLE
// // i = outer loop(ROWS)
// // j inner loop(COLUMNS)
// /// i+j = even = print 1
// /// i+j = odd = print 2
// public static void triangl_01e(int n) {
//     for(int i =1;i<=n;i++) {
//         for(int j = 1;j<=i;j++) {
//           if((i+j)%2==0 ) {
//             System.out.print("1");
//           } else {
//             System.out.print("0");
//           }
//         } System.out.println();
//     }
// }

// public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//      System.out.println("enter your desired no.");
//  int l = sc.nextInt();
//  triangl_01e(l);
// }







// /// / /// butterfky pattern to be printed in nested loop;







//  public static void butterfly(int n ) {
//               //as their is butterfly so at a pt their is must an repetetion pattern;
//     // 1st half ^
//   for(int i=1;i<=n;i++) {
//     // stars - i
//     for(int s=1;s<=i;s++) {
//        System.out.print("*");

//     }   
   
//     // sapce - 2*(n-i)
//    for(int g=1;g<=2*(n-i);g++) {
//    System.out.print(" ");
//    }
   
//     // stars - i
//    for(int s=1;s<=i;s++) {
//     System.out.print("*");
//    }
     
// System.out.println();


    
//   }

//  /// 2nd half;
//  for(int i = n;i>=1;i--) {
//      for(int s=1;s<=i;s++) {
//        System.out.print("*");

//     }   
   
//     // sapce - 2*(n-i)
//    for(int g=1;g<=2*(n-i);g++) {
//    System.out.print(" ");
//    }
   
//     // stars - i
//    for(int s=1;s<=i;s++) {
//     System.out.print("*");
//    }
//    System.out.println();
//  }

//  }


// public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int l = sc.nextInt();
//     butterfly(l);
    
// }






// /// / /// // /// solid rhombus
// public static void rhombusS(int n ) {
//     for(int i = 1;i<=n;i++) {
//         // spaces 
//         for(int s = 1;s<=(n-i);s++) {
//             System.out.print(" ");

//         } 
//         // stars
//         int k =1;
//         while(k<=n) {
           
//             System.out.print("*");
//             k++;
// /// whaṭ mam done here is this 
// /// for(int j=1;j<=n;j++) {
// /// System.out.print("*");
 
// /// }

//         }
// System.out.println();
//         }
//     }



// public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int l = sc.nextInt();
//     rhombusS(l);
    
// }






// /// c/ // /// HOLLOW RHOMBUS 
       

// public static void hollow_rhombus(int n )  {
//      for(int i =1; i<=n;i++) {
//         // spaces
//         for(int j = 1;j<=(n-i);j++) {
//             System.out.print(" ");
//         }

//     // hollow rectangle - stars
//     for(int j = 1;j<=n;j++) {
//         if( i == 1 || i == n || j == 1 || j == n ) {
//             System.out.print("*");

//         } else {
//             System.out.print(" ");
//         }

//     }
//               System.out.println();

//      }
// }
// public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int l = sc.nextInt();
//     hollow_rhombus(l);
    
// }




/// / /// // /// DIAMOND PATTERN

public static void diamond(int n ) {

}



}



