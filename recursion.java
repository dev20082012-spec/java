public class recursion { // lc 2;
    public static void printDec(int n) {
        if(n == 1) { // base case;
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void printInc(int n) { // lc 4;
        if( n == 1 ) {
            System.out.print(n + " "); // get more knowledge when done this line same as lc 2
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
    public static int fact(int n) { // lc 5
        if( n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    } //                                                                    nm1 = n-1;                                                                   
    public static int Calcsum(int n ) { // lc 6 
        if( n == 1) {
            return 1;
        }
        int Snm1 = Calcsum(n-1);
        int Sn = n + Snm1;
        return Sn;
    } 
    // calculate nth term in fibonacci;
    public static int fib(int n ) {  // lc 7;
        if( n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
public static boolean isSorted(int arr[], int i) {   // lc 8;
    if(i == arr.length - 1) {
        return true;
    }
    if(arr[i] > arr[i+1]) {
        return false;
    }
    return isSorted(arr, i+1);
}
public static int firstOccurence(int arr[], int key, int i) {      // lc 9
    if(i == arr.length - 1) {
        return -1;
    }
    if(arr[i] == key) {
        return i;
    }
    return firstOccurence(arr, key, i+1);
}
public static int lastOccurence(int arr[], int key, int i) {   // lc 10
    if(i == arr.length) {
        return -1;
    }
    int isFound = lastOccurence(arr, key, i+1);
    if(isFound == -1 && arr[i] == key) {
        return i;
    }
    return isFound;
}
public static int power(int x, int n) {   // lc 11
    if(n == 0) {
        return 1;
    }
    // int xnm1 = power(x, n-1);
    // int xn = x * xnm1;
    // return xn;
// short form of code =
return x * power(x, n-1);
}
public static long optimizedpower(int a, int n) {       // lc 12
   if(n==0) {
    return 1;
   }
    // long halfpowerSq = optimizedpower(a, n/2) * optimizedpower(a, n/2);  ==== t.c = O(n) STILL not decreases form previous.
    // for better
    long d = optimizedpower(a, n/2);
    long halfpowerSq = d*d; // now the t.c == O(log(n))

    if(n%2 != 0) {
        halfpowerSq = a * halfpowerSq;
    }
return halfpowerSq;
}
public static int tillingProblems(int n) {  // 2 * n (floor size)
    if(n==0 || n==1) {  // 2 * 0 = no tiles, so only one ways  
        return 1;
    }
//     // kaaam 
//     // verticial choice;
//      int fnm1 = tillingProblems(n-1);  // fnm1 = f(n-1);
// //  WE HAVE AT LAST FAITH KI N-1 AND N-2 LA LIYA AT LAST SAHI JAWAB AAYAGA // ****************************     
//      // horizontal choice;
//      int fnm2 = tillingProblems(n-2);

//      int totalways = fnm1 + fnm2;
//      return totalways;

    return tillingProblems(n-1) + tillingProblems(n-2);
}
public static void removeDuplication(String str, int idx, StringBuilder newStr, boolean map[] ) {
    // base
    if(idx == str.length()) {
    System.out.println(newStr);
    return;
    }
    // kaam 
    char currchar = str.charAt(idx);
    if(map[currchar-'a'] == true ) {  // as the index at which a is present is 0.
        // duplicate 
        removeDuplication(str, idx+1, newStr, map);  // newstr ko same hi copy kar liya hai hamm na.
    } else {
        map[currchar-'a'] = true;
        removeDuplication(str, idx+1, newStr.append(currchar), map);
    }

}
public static int friendsPairing(int n) {
    if(n==1 || n==2 ) {
        return n;
    }
    // // choice 
    // // SINGLE 
    // int fnm1 = friendsPairing(n-1);

    // // PAIRS
    // int fnm2 = friendsPairing(n-2);
    // int pairways = (n-1) * fnm2;
    // // totways
    // int totways = fnm1 + pairways;
    // return totways;
    return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
}
    public static void main(String args[]) {
        // int n = 10;
        // System.out.print("printDec: ");
        // printDec(n);  // lc 2
        // System.out.print("printInc: ");
        // printInc(n);  // lc 4
        // System.out.println();
        // System.out.println("fact(10): " + fact(n));  // lc 5
        // System.out.println("Calcsum(10): " + Calcsum(n));  // lc 6
        // System.out.println("fib(10): " + fib(n));  // lc 7
        // int arr1[] = {1,3,2,4,5,6};
        // System.out.println("isSorted(arr1, 0): " + isSorted(arr1, 0));   // lc 8
        // int arr2[] = {8,3,6,5,9,10,2,5,3};
        // System.out.println("firstOccurence(arr2,5, 0): " + firstOccurence(arr2,5, 0));   // lc 9
        // System.out.println("lastOccurence(arr2, 5, 0): " + lastOccurence(arr2, 5, 0));   // lc 10
        // System.out.println("power(10, 2): " + power(10, 2));      // lc 11
        // int a = 2;
        // System.out.println("optimizedpower(2, 10): " + optimizedpower(a, n));    // lc 12
        // System.out.print("Total no. of ways : ");
        // System.out.println(tillingProblems(3));       // lc 13;
        // String str = "appnnacollege";
        // removeDuplication(str, 0, new StringBuilder(""), new boolean[26]);          // lc 15;
        // System.out.println(friendsPairing(3));     // lc 16;
    }
}
