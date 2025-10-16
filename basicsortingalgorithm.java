import java.util.Collections;
import java.util.Arrays; // for pt 4 inbuilt sort and further
public class basicsortingalgorithm{
    

        //                                printbubble is jann of all the sorting codes.


    public static void bubblesort(int arr[]) {
         for(int turn=0;turn<arr.length-1;turn++) {
            for(int j = 0;j<arr.length-1-turn;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]  = arr[j+1];
                   arr[j+1] = temp;
                }
            }

         }
    }
    // public static void printbubble(int arr[]) {
    //     for(int i = 0;i<arr.length;i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }


 
                                                          // 2nd //

public static void selectionsort(int arr[]) {
for(int i=0;i<arr.length-1;i++) {
    int minpos = i;
    for(int j=i+1;j<arr.length;j++) {
        if(arr[minpos] > arr[j]) {  // here change the bigger sign with smaller, so that will get descending order.
            minpos=j;
        }
    } 
    // swap;
    int t = arr[minpos];
    arr[minpos] = arr[i]; 
    arr[i] = t;
}
}






                                                          // 3rd //
public static void insertionsort(int arr[]) {
    int i=1;
    for(; i<arr.length;i++);
    int curr = arr[i];
    int prev = i-1;
    while(prev >=0 && arr[prev] > curr) { // finding out the correct position to insert.
           arr[prev + 1 ] =  arr[prev];
        prev--;
    }
    // insertion
    arr[prev+1] = curr; // yha pa +1 isliya kara hai because uppar vala code ma prev-- karna sa dry run karka dekha tho then index ki value thori bhaut uppar nicha ho gayi usa thik karna ka liya.

}


 


// public static void main(String args[]) {
// int arr[] = {5,4,1,3,2};



//(1) bubblesort(arr); 

// When printbubble(arr) is called, arr[i] refers to the updated/sorted values from the bubblesort function, not the original values from main
// The original array from main is overwritten by bubblesort because bubble sort operates directly on the input array.
//printbubble simply iterates through and prints the current state of the array, which is the sorted version.
//If you wanted to preserve the original array, you'd need to create a copy before sorting, but in this code, it's modified in place for simplicity.
//This demonstrates how Java handles array references: changes in bubblesort affect the original array in main.

//(1) printbubble(arr);

                                                          // 2nd //
    //selectionsort(arr);
   // printbubble(arr);
    
                                                          // 3nd //
 // insertionsort(arr);
   // printbubble(arr);                                                       





                                              // pt  4 = inbuilt sort.

//                printbubble specially for inbuilt collection type for reverse
//                     here have to change int to integer, orimitive datatypes for collection reverse                               
public static void printbubble(int arr[]) {
        for(int i = 0;i<arr.length;i++) { // int--> integer for collection specially.
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
   public static void countingsort(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for( int i = 0;i<arr.length; i++) {
        largest = Math.max(largest,arr[i]);
    }
    int count[] = new int[largest+1]; // +1 is for ki index 0 sa start hota hai and hama 7 takk jana jhai na ki uska index 6 takk hi jaya.
     for(int i = 0;i<arr.length;i++) {
        count[arr[i]]++;
     }

     // sorting 
     int j = 0;
     for(int i = 0; i<count.length;i++) {
        while(count[i]>0) {
            arr[j] = i;
            j++;
            count[i]--; // it is frequency decrease by one with every value used.
        }
     }
   }

   public static void main (String args[]) {
    int arr[] = {1,4,1,3,2,4,3,7};
    
   // Arrays.sort(arr);
//    Arrays.sort(arr,Collections.reverseOrder());
//Arrays.sort(arr,0,4,Collections.reverseOrder());
countingsort(arr);   
printbubble(arr);
   }                                           


}