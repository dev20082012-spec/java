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
public static void update(int marks[],int changable) {
    changable = changable + 5;
for(int i = 0;i<marks.length;i++) {
    marks[i] = marks[i] + 1;
}
}

public static void main(String args[]) {
    int marks[] = {97,98,94};
    int changable = 5;
    update(marks,changable);
    System.out.println(changable);
    // instead of writting print marks[0] marks[1] and all this chaos done a """new loop to be written"""

// print our marks
for(int i = 0;i<marks.length;i++) {
    System.out.println(marks[i] + " ");
} System.out.println();

/// here the changable not get change {[{[during passing arrays dhayan rakhna hai ki others ki value change nahi hogi]}]}
 
 

}


}

