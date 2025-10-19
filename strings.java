import java.util.*;
public class strings {
    public static void printletter(String str) { // lc = 5;
        for(int i = 0; i<str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static boolean isPalindromic(String str) { // LC 6;
        int n = str.length();
        for(int i = 0; i<n/2; i++) {
            if(str.charAt(i)!=str.charAt(n-i-1)) {
                // not a palindromic condition;
                return false; 
            }
        }
        return true;
    }
    public static float getShortestpath(String path) { // lc 7, int use bcz last return displacement hai; lekin float lagaya hai samajh jao ki bcz koi aagar aata in pt value then vo pt chat jata.
        int x = 0, y = 0;
        for(int i = 0; i<path.length(); i++) {
            char dir = path.charAt(i);
            // south
            if(dir == 'S') {
                y--;
            }
            // north 
            else if(dir == 'N') {
                y++;
            }
            // west 
            else if(dir == 'W') {
                x--;
            }
            else {
                x++;
            } 
        }
    float X2 = x*x-0*0;
    float Y2 = y*y-0*0;
    return (float)Math.sqrt(X2+Y2); // ya maTH function double return karta hai isliya hama typecast karna paraga;
    }
    // lc 09;
    public static String subString(String str,int si,int ei) { // string return type bcz char hi mil raha at the end;
        String substr = "";
        for(int i = si; i < ei;i++) {
            substr+=str.charAt(i);
        }
        return substr;

    }
    public static void main(String args[]) {
        // char arr[] = {'a','b','c'};
        // String str = "abcd";
        // String str2 = new String("xyz");
                                        // lc 2
    // Scanner sc = new Scanner(System.in);
    // String name;
    // name = sc.nextLine();
    // System.out.println(name);   
                                       // lc 3
    // String  fullname = "tony stark ki mkc";
    // System.out.println(fullname.length());         
                                      // lc 4               
    // concatenation (addition of two thongs)
    // String firstname = "shraddha";
    // String lastname = "kappra";
    // String fullname = firstname + " " + lastname;
    // System.out.println(fullname.length()+","+fullname);
                                      // lc 5
    // to find the char at any index                                  
    // String firstname = "shraddha";
    // String lastname = "kappra";
    // String fullname = firstname + " " + lastname;
    // // System.out.println(fullname.length()+", "+"char at givem index : "+fullname.charAt(0)+", "+fullname);      
    // printletter(fullname);   

                                      // lc 6
// Scanner sc = new Scanner(System.in); 
// System.out.println("enter the word u want to check for palindromic");                                     
// String str = sc.nextLine();
// System.out.println(isPalindromic(str));

                                      // lc 7
// String path = "NESEEWWWNESNWNESNWNESNESW";   
// System.out.println(getShortestpath(path));

                                      // lc 8
// String s1 = "tomy";
// String s2 = "tomy";
// String s3 = new String("tomy");
// if(s1==s2) {
//     System.out.println("equal");
// } else { System.out.println("not equal");
// }
// if(s1==s3) {
//     System.out.println("equal");
// } else { System.out.println("not equal");
// }
// if(s1.equals(s3)) {
//     System.out.println("equal");
// } else { System.out.println("not equal");
// }

                                      // lc 9
// SUBSTRING.
String str = "HelloWorld";     
System.out.println(subString(str, 0, 4));
System.out.println(str.substring(0,4));                                
    }
}
