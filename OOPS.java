import java.util.*;
public class oops {
    // public static void main(String args[]) {
    //     // pen ko ek asli object banana ka liya code aur likhna paraga.
    //     // for create as a object ALL WE DONE IS BELOW.
    //     Pen p1 = new Pen(); // new sa hum memory ma nahi jagha bana rahaya hai jha sari PEN ki property store hogi,(2) Pen() = isa CONSTRUCTOR khata hai isma hamna apni pen class ko diya hai main f(X) ma. 
    //     // by the upper line = = = "CREATED A PEN OBJECT C/AS p1"   
    //     Scanner sc = new Scanner(System.in);
    //     // System.out.print("enter your desired colour :");
    //     // String n = sc.nextLine();
    //     // System.out.print("enter your desired tip size :");
    //     // int i = sc.nextInt();
    //     // p1.setcolour("blue");
    //     // lc 1 = System.out.println(p1.colour);
    //     // System.out.println(p1.getColour()); // lc 3
    //     // p1.setTip("5");
    //     // lc 1 = System.out.println(p1.tip); 
    //     // System.out.println(p1.gettip()); // lc 3  
    //     // multiple time we can use this p1.__(tip/colour)
    //     // lc 1 = p1.colour = "yellow"; // also can done this 
    //     // isma bhi hamara code error show nahi kar raha.
    //     // p1.setcolour("yellow"); // lc 3;
    //     // lc 1 = System.out.println(p1.colour);
    //     // System.out.println(p1.getcolour()); // lc 3
        
        
    //                                                 // lc 2;
    //     // BankAccount myAcc = new BankAccount();
    //     // myAcc.username = "shradha kappar";
    //     // // myAcc.password = "abcedf"; // on running code it shows error(as only accessible to the class bA)  
    //     // myAcc.setPassword("abcdef");  
        
         
        
    //                                                 // lc 5 + 6 +7(copy constructor);
    //     // student s1 = new student("Shradha"); 
    //     // System.out.println(s1.name);   
    //     // student s1 = new student();
    //     // student s2 = new student("shradha");
    //     // student s3 = new student(123);
    //     // student s4 = new student("aman" , 125);  == this shows error as their is no CONSTRUCTOR in which we have passed all the parameters.
    //     // System.out.println(s2.name +" "+s3.roll);  

    //                                                             //  COPY CONSTRUCTOR // 
    //     student s1 = new student();
    //     s1.name = "shradha";
    //     s1.roll = 456;
    //     s1.password = "abcd";
    //     s1.marks[0] = 100;
    //     s1.marks[1] = 90;
    //     s1.marks[2] = 80;
      
    //   student s2 = new student(s1);
    //   s2.password = "xyz"; // ya hamna naya password diya hai s2 ko na ki s1 ka copy kara.
    //   s1.marks[2] = 100; // here we update the s1 marks
    //   for(int i = 0; i<3;i++) {
    //     System.out.println(s2.marks[i]);
    //   }

    // }


    public static void main(String args[]) {
        // Fish shark = new Fish();//        lc 10;
        // shark.eat();

        Dog dobbu = new Dog(); //       lc 12;
            dobbu.eat();
            dobbu.legs = 4;
             System.out.println(dobbu.legs);
    }
}
                                                    // lc 1
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

// class student {
//         String name;
//         int age;
//         float percentage;

//         void calcPercentage(int phy, int che, int maths) {
//             percentage = (phy + che + maths) / 3;
//         }
//     } 
                                          
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


                                          
                                                                  // lc 5+6+7+8 ;
class student {
    String name;
    int roll;
    String password; // lc 7
    int marks[]; // lc 7

// // shallow copy constructor.
//     student(student s1) { // this one only lc 7 copy constructor
//         marks = new int[3]; // lc 7
//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.password = s1.password;
//         this.marks = s1.marks; // shallow copy for marks to share the array
//     }

// DEEP COPY CONSTRUCTOR. == LC 8
        student(student s1) { 
        marks = new int[3]; 
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i<marks.length; i++) {
        this.marks[i] = s1.marks[i];
        }
        
    }


    student(String name) { // constructor = isma hamm phala sa initialize bhi kar sakta hai cheezo ko and khali bhi chor sakta hai.
//                          "PARAMETRIZE" constructor. 
        marks = new int[3]; // lc 7
        this.name = name;
    }
    student() { // constructor + "NON PARAMETRIZE" CONSTRUCTOR.
        marks = new int[3]; // lc 7
        System.out.println("constructor is called...");
    }
    student(int roll) {
        marks = new int[3]; // lc 7
        this.roll = roll; 
    }
    //             *UNIQUENESS IS KI MAIN FUNCTION MA JA OR DEKH S1,S2,S3 YA SAB MA HAMNA PARAMETER JIS HISAB SA DALA HAI US HISAB SA HI "CONSTRUCTOR" CALL HOYANGA.*
}


                                          
                                                                   // lc 10;
// BASE CLASS;
class Animal {
    String colour;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breath");
    }

}

// DERIVED CLASS  /  SUBCLASS ;
// class Fish extends Animal {  // this extends ___ {} = means ki apni base class ya n ki animal class sa fish ma chiza
//                              // extend ho rahi hai, fish class kich raha hai animal class ki cheeza.
//     int fins;

//     void swim() {
//         System.out.println("swims in water");
//     }

// }

                                                                 // lc 12 = Multiple Inheritance 

// class Mammals extends Animal{ // use of anima class and further more.
//     int legs;
// }

// class Dog extends Mammals {
//     String breeds;
// }

                                                                 // lc 13 = Hierarchial Inheritance;
class Mammals extends Animal{ // use of anima class and further more.
    void walks() {
        System.out.println("can walk");
    }
}
class Fish extends Animal{
    void swim() {
        System.out.println("can swim");
    }
}
class Bird extends Animal{
    void fly() {
        System.out.println("can fly");
    }
}
