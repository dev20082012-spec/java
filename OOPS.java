import java.util.*;
public class oops {
    public static void main(String args[]) {
        // pen ko ek asli object banana ka liya code aur likhna paraga.
        // for create as a object ALL WE DONE IS BELOW.
        Pen p1 = new Pen(); // new sa hum memory ma nahi jagha bana rahaya hai jha sari PEN ki property store hogi,(2) Pen() = isa CONSTRUCTOR khata hai isma hamna apni pen class ko diya hai main f(X) ma. 
        // by the upper line = = = "CREATED A PEN OBJECT C/AS p1"   
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter your desired colour :");
        // String n = sc.nextLine();
        // System.out.print("enter your desired tip size :");
        // int i = sc.nextInt();
        p1.setcolour("blue");
        // lc 1 = System.out.println(p1.colour);
        System.out.println(p1.getColour()); // lc 3
        p1.setTip("5");
        // lc 1 = System.out.println(p1.tip); 
        System.out.println(p1.gettip()); // lc 3  
        // multiple time we can use this p1.__(tip/colour)
        // lc 1 = p1.colour = "yellow"; // also can done this 
        // isma bhi hamara code error show nahi kar raha.
        p1.setcolour("yellow"); // lc 3;
        // lc 1 = System.out.println(p1.colour);
         System.out.println(p1.getcolour()); // lc 3
        
        
                                                    // lc 2;
        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "shradha kappar";
        // // myAcc.password = "abcedf"; // on running code it shows error(as only accessible to the class bA)  
        // myAcc.setPassword("abcdef");                                  
    }
}
 
// class Pen {
//     // properties2 + function2
//     String colour;
//     int tip;

    
//     void setcolour(String newcolour) {
//         colour = newcolour;

//     }
//     void setTip(int newtip) {
//         tip = newtip;
        
//     }
// }
class student {
        String name;
        int age;
        float percentage;

        void calcPercentage(int phy, int che, int maths) {
            percentage = (phy + che + maths) / 3;
        }
    } 
                                          
                                                                  // lc 2;
class BankAccount {
   public String username;
   private String password; // only accesible for this class.

   public void setPassword(String pwd) {
    password = pwd;
   }
} 
                                          
                                                                  // lc 3;
class Pen {
    // properties2 + function2
    private String colour;
    private int tip;

    String getColour() {
        return this.colour;
        // THIS = keyword of java, means current obj jo ki this ko replace kar lagi, jo bhi call kar rahi hai iss function ko vo replace kar lagi this ki jagha 
    }
    int gettip() {
        return this.tip;
    }
    void setcolour(String newcolour) {
        colour = newcolour;

    }
    void setTip(int tip) {
        this.tip = tip; // means ho jayaga same keyword ma ki this.tip isi class ka ho jayaga int tip and = tip jo hai vo new tip pass ho jayagi.
        
    }
}

