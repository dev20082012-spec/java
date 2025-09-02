import java.util.*;
public class methodf11 {
    // public static void printHelloWorld() {
    //     System.out.println("Hello World");
    //      System.out.println("Hello World");
    //       System.out.println("Hello World");
    // }

    /// // /// syntax of parameters;
  // 1[1]  // public static void calculatesum() {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = a+b;
    //     System.out.println(sum);
    // } 

// 2[2]  //  public static void calculatesum(int  num1,int num2) {
        
//         int sum = num1 + num2;
//         System.out.println(sum);
//     } 

//     public static void main(String args[]) {  
//        Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         calculatesum(a,b);


// public static int calculatesum(int  num1,int num2) { // parameters or formal parameters;
        
//      int sum = num1 + num2;
//         return sum;
//     } 


      
// the bottom is refered to above 


    // public static void main(String args[]) {  
    //    Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = calculatesum(a,b); // arguments or actual parameters;
    // System.out.println(sum);



// here is new


// public static void swap(int a, int b) {
// int swap  = a;
// a = b;
// b = swap;
// System.out.println("a = "+a);
// System.out.println("b = "+b);
// }

// public static void main(String args[]) { 
// // swap - values exchange;
// int a = 5;
// int b = 8;
// swap(a,b);

//     }






/// // /// product of two things in different class to main class;





// public static int multiply(int a , int b) {
//     int product = a*b;
   
//     return product;
// }

// public static void main(String args[])  {
//    Scanner s = new Scanner(System.in);
//     int a = s.nextInt();
//     int b = s.nextInt();
//     int product = multiply(a,b);
//     System.out.println("product " + product);
//     product = multiply(40,50);
//      System.out.println("product " + product);
// }







// public static int factorial(int n) {
//     int f = 1;

// for(int i=1; i<=n;i++) {
//  f = f*i;


// }
// return f; // factorial of n:

// }
// public static void main(String args[]) {
 
//     System.out.println(factorial(5));





/// / /// next is binomial coefficient problem;



// public static int factorial(int a) {
//     int f = 1;
//     for(int i = 1;i<=a;i++) {
//         f*=i;

// }
// return f;

// }

// public static int bincoff(int n , int r) {
//     int fact_n =  factorial(n);
//     int fact_r = factorial(r);
//    int fact_nmr = factorial(n-r);
//  int bincoff = fact_n/(fact_r*fact_nmr);
//  return bincoff;
// } 
// public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int n1 = sc.nextInt();
//     int n2 = sc.nextInt();
    
//     System.out.println(bincoff(n1,n2));
// }







/// / /// fuction overloading ;
// public static int sum(int a, int b) {
//     return a+b;

// }
// public static int sum(int a, int b, int c) {
//     return a+b+c;
    
// }
// public static void main(String args[]) {
//  System.out.println(sum(1,2,3));

//  }




/// / /// function overloading using data types



// public static int sum(int a, int b) {
//     return a+b;

// }
// public static float sum(float a, float b) {
//     return a+b;
    
// }
// public static void main(String args[]) {
//     System.out.println(sum(3,5));
//     System.out.println(sum(2.9f,3.1f));

// }




/// / /// check whether the no. is prime or not;

// public static boolean prime(int n ) {

//     // corner case 
//     // 2\
//     if(n==2) {
//         return true;
//     }
//     for(int i = 2;i<=n-1;i++) { // herer is catch t0 small code by 2-3 lines;
//         if(n % i ==0) {
//           return false;

//         }
//     }
//     return true;

// }
// public static void main(String args[]) {
//     System.out.println("enter the no. u want to check prime or not = result is came as true or false");
// Scanner s = new Scanner(System.in);
// int a = s.nextInt();
//  System.out.println(prime(a));
// }





/// / // check no. is prime or not by     "OPTIMIZED WAY"............\
// ************************************* "OPTIMIZED WAY" *************************************
public static boolean isprime(int n) {
    boolean isprime = true;
    for(int i=2; i<=Math.sqrt(n);i++ ) {
        if(n%i==-0) {
            return false;
        }
    }
    return true;
}


public static void main(String args[]) {
    System.out.println("enter the no. u want to check prime or not = result is came as true or false");
Scanner s = new Scanner(System.in);
int a = s.nextInt();
 System.out.println(isprime(a));
}



}



