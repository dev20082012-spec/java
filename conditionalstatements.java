// import java.util.*;
// public class conditionalstatements {
//     public static void main(String args[]) {
        // int age;
        // Scanner sc = new Scanner(System.in);
        // age = sc.nextInt();

        // if (age>=18 ) {
        //     System.out.println("eligible for voting" );
        // }

        // if (age>13 && age<18 ) {
        //     System.out.println("teenager: wait for voting" );
        // }
        // else {
        //     System.out.println("not eligible for voting");

        // }





// int a,b;
//  Scanner sc = new Scanner(System.in);
//  a = sc.nextInt();
//  b = sc.nextInt();
//  if(a>=b) {
//     System.out.println("a is larger than b");
//  }
//  else {
// System.out.println("b is larger than a" );
//  }






// // check whether the no. is even/odd;
// Scanner sc  = new Scanner(System.in);
// double a;
// a = sc.nextDouble();
// if(a%2==0) {
//     System.out.println("the no. is even");
// } else {
//     System.out.println("the no. is odd");

// }





// // else if conditional statements check;;;
// Scanner sc = new Scanner(System.in);
// int age;
// age = sc.nextInt();
// if(age>18) {
//     System.out.println("adult");

// } else if(age>=13 && age <18) {
//     System.out.println("teenager");
// } else {
//     System.out.println("jaka duudh pee baacha");
// }





// // income tax calculator   
// Scanner sc = new Scanner(System.in);
// int income;
// int tax = 0;
// income = sc.nextInt();
// if(income<=500000) {
//     tax = 0;
// } else if (income>500000 && income<=1000000) {
//     tax = (int) ((int) income*0.2);
// } else {
//     tax = (int) ((int)income*0.3F);
  
// }
//   System.out.printf("tax = " + tax);
// // here can use double/float to get into an  perfect points result for perfection prefer "double".........





// //largest of three no...............
// int a = 1;
// int b = 3;
// int c = 6; 
// if(a>=b && a>=c) {
//     System.out.println("a is the largest of 3");
// } else if(a>=b && c>a) {
//     System.out.println("c is the largest of 3");
// } else if (a<=b && b<=c) {
//     System.out.println("c is the largest of 3");
// } else {
//     System.out.println("b is the largest of 3");
// }





// //ternary operators;
// Scanner s = new Scanner(System.in);

// int a = s.nextInt();
// String result = ((a%2) ==0) ? "even" : "odd";
// System.out.println(result);





// // // // //this through old method// // // // //
// Scanner sc = new Scanner(System.in);
// int marks = sc.nextInt();
// if (marks >= 33 && marks<=100) { 
//     System.out.println("pass congrats");
// } else if(marks>=0 && marks<=32) {
//     System.out.println("fail: thora parr lena chaiya tha");
// }


// // // // NEW METHOD // // // 
// Scanner sc = new Scanner(System.in);
// int marks = sc.nextInt();
// String report = marks>=33 ? "pass" : "fAIL";  
// System.out.println(report);





// // // // // // // // SWITCH STATEMENT // // // // // // // // 
// int number = 10; / ALSO CHAR CH = A /
// switch(number) {     / SWITCH(CH) /
//     case 1/B/ : System.out.println("samosa");
//                  break;
//     case 2/A/ : System.out.println("cold drinl");
//                 break;
//     case 3/D/ : System.out.println("burger");
//                 break;
//     default : System.out.println("wake up to reality");

// }
// }
//     }









// paper question answer








 
import java.util.*;
public class conditionalstatements {
    public static void main(String args[]) {

// q 1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the first no.");
        // int a = sc.nextInt();
        // if(a>=0) {
        //     System.out.println("the no. u enter is positive");
        // } else {
        //     System.out.println("the entered no. is negative");

        // }


// q 2 
    // Scanner sc = new Scanner(System.in);
    // double temp = sc.nextDouble();
    // String fever =  (temp>100) ? "fever" : "don't have fever";
    // System.out.println(fever);



   // // // // q3
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter week no. from 1-7");
//    int a = sc.nextInt();
//    switch(a) {
//     case 1 : System.out.println("monday");
//     break;
//     case 2 : System.out.println("tuesday");
//     break;
//     case 3 : System.out.println("wednesday");
//     break;
//     case 4 : System.out.println("thrusday");
//     break;
//     case 5 : System.out.println("friday");
//     break;
//     case 6 : System.out.println("saturday");
//     break;
//     case 7 : System.out.println("sunday");
//     break;
//     default : System.out.println("your entered no. is wrong , pls enter no. b/w 1-7");

//    }





// // // // q5 check whether the year is leap or not leap;


Scanner sc = new Scanner(System.in); 
System.out.print("Input the year: "); 
int year = sc.nextInt();
boolean x = (year % 4) == 0; 
boolean y = (year % 100) != 0; 
boolean z = ((year % 100 == 0) && (year % 400 == 0));
if (x && z) { 
System.out.println(year + " is a leap year"); 
} else { 
System.out.println(year + " is not a leap year"); 
} 



}
}