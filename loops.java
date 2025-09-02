import java.util.*;
public class loops {
     public static void main(String args[]) {

// // // // // while loop learning // // // // //

//(1)//        // int counter = 0;
// while(counter<=10) {
//     System.out.println("24lpa");
//     counter++;

//(2)//          // int counter = 1;
// while(counter<=1000000) {
//     //System.out.println(counter);
//     System.out.println(counter+" ");
//     counter++;
// }

//(3_)//
//  Scanner sc = new Scanner(System.in);
// int a = 1;
// System.out.println("enter the integer till u have to print no.");
// int b = sc.nextInt();
// while(1<=a && a<=b) {
//     // System.out.println(a);
//     System.out.print(a+" ");
//     a++;
// }

// // // sum of n no. in while loop// // //
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the integer");
// int n=sc.nextInt();
// int i = 1;
// int sum = 0;
// while(i<=n) {
// sum = sum+i; // also sum+=i;
// i++;    
// }
// System.out.println("the sum ="+sum);



/*   know for loop study begim    */
// (1) // 
// // int i = 1;
// for(int i = 1; i<=10 ; i++) {
//      System.out.println("hello world");
// }

// (2) // 
// for(int i = 1; i<=4; i+=1) {
//       System.out.println("****");
// }

// with while loop // 

// int i = 1;
// while(i<=4) {
//      System.out.println("****");
// i++;
// }



// *****// print reverse of the given no.//*****//

/*  ****************************************************************************

Scanner s = new Scanner(System.in);
for(int n = s.nextInt(); n>0; n=n/10) {
int last = n % 10;
System.out.print(last);


***************************************************************************************
} */
// also we can done through\


// **********************************************************************************************
// Scanner s = new Scanner(System.in);
// int n = s.nextInt();
// while(n>0) {
//      int last = n%10;
//      System.out.print(last);
//      n = n/10;
// }
// *****************************************************************************


// // // // // reverse the given no.(another method) // // // // // 
// 1st way;
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int rev = 0;
// while(n>0) {
//      int lastdigit = n%10;
//      rev = (rev*10) + lastdigit;
//      n=n/10;
// }
// System.out.println(rev);

// 2nd way;
// Scanner sc = new Scanner(System.in);
// int rev = 0;
// for(int n =sc.nextInt();n >0; n= n/10 ) {
//      int lastdigit = n%10;
//      rev = (rev*10) + lastdigit;
// }
// System.out.println(rev);
//








// // // // // // // / do while loop / // // // // // // // 

// int counter = 1;
// do{ 
//      System.out.println("hello world");
//      counter++;
// } while(counter<=5);


// // break statement;
// for (int i = 1; i<=10;i++){
//      if(i == 7){
//           break;
//      }
//      System.out.println(i);
// }
// System.out.println("fucking bastard consider yourself lucky u are out of loop mc");







// // // // // /keep entering no. till user enter the no, is multipls of 10;
// Scanner sc = new Scanner(System.in);
// do {
//      System.out.println("enter your no.");
//      int n = sc.nextInt();
//      if(n%10 == 0) {
//           break;
//      } 
//      System.out.println(n);
// } while(true);
//********************************************************************************** 



// // continue statement 
// Scanner sc = new Scanner(System.in);
// for(int n = 1; n<=6;n++) {
//      if(n ==5) {
//           continue;
//      }
// System.out.println(n);

// }

// // question of continue statement     keep entering no. till user enter the no, is multipls of 10;
// Scanner sc = new Scanner(System.in);
// do {
//      System.out.println("enter your no.");
//      int n = sc.nextInt();
//      if(n%10 == 0) {
//           continue;
//      }
// System.out.println("no. is="+n);
// } while(true);



// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// if(n == 2){
//      System.out.println("no.is prime");
// } 
// else {
// boolean isprime = true;
// for(int i = 2;i<=n-1;i++) {
//      if(n % i == 0) { // the given no. have multiple factor not prime
//           isprime = false;
//      }
 
//  }
// if(isprime == true){
//      System.out.println("no. is prime");
// } else {
//      System.out.println("no. is not prime");
// }
// }





// //slight change eein above code because of ki ya code jab bari value hogi like 5lakh tab ya bhaut 
// //slow ho jayaga isliya isa fast karna ka liya ya n = sqrt(n)*sqrt(n) ka use karenga;
//  //                                                   matlab under root n;
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// if(n == 2){
//      System.out.println("no.is prime");
// } 
// else {
// boolean isprime = true;
// for(int i = 2;i<=Math.sqrt(n);i++) { // here is the change as is import ma maths ki bhi class hoti hai
//      if(n % i == 0) { // the given no. have multiple factor not prime
//           isprime = false;
//      }
 
//  }
// if(isprime == true){
//      System.out.println("no. is prime");
// } else {
//      System.out.println("no. is not prime");
// }
// }




// *************************************test question***************************************;


// Question 2 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers.


/* Scanner sc = new Scanner(System.in);
int number;
int choice;
int evensum = 0;
int oddsum = 0;
do {
     System.out.println("entrer the no.");
     number = sc.nextInt();

     if(number % 2 ==0) {
          evensum+=number;

     }
else {
     oddsum+=number;

}

System.out.print("Do you want to continue? Press 1 for yes or 0 for no");

choice = sc.nextInt();
} while(choice == 1);
System.out.println("Sum of even numbers: " + evensum);
System.out.println("Sum of odd numbers: " + oddsum);  */





/*Question 3 : Write a program to find the factorial of any number entered by the user.
(Hint : factorial of a number n = n * (n-1) * (n-2) * (n-3) * …… * 1 and exists for positive
numbers only. We write factorial as n!
So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)
*/



// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int  factorial = 1;
// for(int i = 1; i<=n ;i++) {
//      factorial*=i; 
// }
// System.out.println("the factorial is" + factorial);





/*Question 4 : Write a program to print the multiplication table of a number N, entered by the
user.
 */


// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// for(int i = 1; i<=10;i++) {
//   System.out.println(n + " * " + i + " = " + n*i);
// }


     }
}






    

