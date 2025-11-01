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

                                                                //  COPY CONSTRUCTOR //
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

        // Dog dobbu = new Dog(); //       lc 12;
        //     dobbu.eat();
        //     dobbu.legs = 4;
        //      System.out.println(dobbu.legs);


                                                                 // lc 16 = POLYMORPHISM(METHOD OVERLOADING)+(METHOD OVERRIDING)
//    Calculator calc = new Calculator();
//     System.out.println(calc.sum(1, 2));
//     System.out.println(calc.sum(1.5f, 2.5f)); // check there is typecasting in this, no need of write long (float).
//     System.out.println(calc.sum(1, 2, 3));

//     Deer d =  new Deer();
//     d.eat();



                                                                 // lc 20 = ABSTRACT CLASSES;
 
// Animal an = new Animal(); // THIS SHOW ERROR AS WE CAN'T MAKE OBJECT WITH ABSTRACT CLASSES;
// Horse h = new Horse();
// h.eat();
// h.walk();
// System.out.println(h.colour);
// Chicken ch = new Chicken();
// ch.eat();
// ch.walk();
// System.out.println(ch.colour);

// mustang myHorse = new mustang(); // for showing more heiracky with 2 or more '"MAINLY EXPLANING 3RD PT"',

// Animal -> Horse -> mustang.


                                                                 // lc 21 = INTERFACE;
// Queen q = new Queen();
// q.moves();
// Bear b = new Bear();
// b.eats();


                                                         // lc 22 = STATIC(PROPERTY, FUNCTIONS, BLOCKS, NESTED CLASSES)
// Student s1 = new Student();
// s1.schoolname = "JMV";
// Student s2 = new Student();
// System.out.println(s2.schoolname); // kayada sa yha pa ek empty string aani chaiya, lekin nahi hua bcz hamna STATIC ban diya for all the s_ who uses the Student class.
// Student s3 = new Student();
// s3.schoolname = "ABC"; // isma bhi school name s1, s2, s3 sab ka ABC ho jayaga as ki STATIC ek baar hi banta hai.


                                                         // lc 23 = SUPER KEYWORD;

        Horses hs = new Horses();
System.out.println(hs.colour);
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
// class BankAccount {
//    public String username;
//    private String password; // only accesible for this class.

//    public void setPassword(String pwd) {
//     password = pwd;
//    }
// } 
                                          
//                                                                   // lc 3;
// class Pen {
//     // properties2 + function2
//     private String colour;
//     private int tip;

//     String getColour() {
//         return this.colour;
//         // THIS = keyword of java, means current obj jo ki this ko replace kar lagi, jo bhi call kar rahi hai iss function ko vo replace kar lagi this ki jagha 
//     }
//     int gettip() {
//         return this.tip;
//     }
//     void setcolour(String newcolour) {
//         colour = newcolour;

//     }
//     void setTip(int tip) {
//         this.tip = tip; // means ho jayaga same keyword ma ki this.tip isi class ka ho jayaga int tip and = tip jo hai vo new tip pass ho jayagi.
        
//     }
// }


                                          
                                                                   // lc 5+6+7+8 ;
// class student {
//     String name;
//     int roll;
//     String password; // lc 7
//     int marks[]; // lc 7

// // shallow copy constructor.
//     student(student s1) { // this one only lc 7 copy constructor
//         marks = new int[3]; // lc 7
//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.password = s1.password;
//         this.marks = s1.marks; // shallow copy for marks to share the array
//     }

// DEEP COPY CONSTRUCTOR. == LC 8
    //     student(student s1) { 
    //     marks = new int[3]; 
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     for(int i = 0; i<marks.length; i++) {
    //     this.marks[i] = s1.marks[i];
    //     }
        
    // }


//     student(String name) { // constructor = isma hamm phala sa initialize bhi kar sakta hai cheezo ko and khali bhi chor sakta hai.
// //                          "PARAMETRIZE" constructor. 
//         marks = new int[3]; // lc 7
//         this.name = name;
//     }
//     student() { // constructor + "NON PARAMETRIZE" CONSTRUCTOR.
//         marks = new int[3]; // lc 7
//         System.out.println("constructor is called...");
//     }
//     student(int roll) {
//         marks = new int[3]; // lc 7
//         this.roll = roll; 
//     }
    //             *UNIQUENESS IS KI MAIN FUNCTION MA JA OR DEKH S1,S2,S3 YA SAB MA HAMNA PARAMETER JIS HISAB SA DALA HAI US HISAB SA HI "CONSTRUCTOR" CALL HOYANGA.*
// }


                                          
                                                                   // lc 10;
// BASE CLASS;
// class Animal {
//     String colour;
//     void eat() {
//         System.out.println("eats");
//     }
//     void breathe() {
//         System.out.println("breath");
//     }

// }

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
// class Mammals extends Animal{ // use of anima class and further more.
//     void walks() {
//         System.out.println("can walk");
//     }
// }
// class Fish extends Animal{
//     void swim() {
//         System.out.println("can swim");
//     }
// }
// class Bird extends Animal{
//     void fly() {
//         System.out.println("can fly");
//     }
// }


                                        // THE THIRD PILLAR ==== // lc 16 = POLYMORPHISM(METHOD OVERLOADING)+(METHOD OVERRIDING)
class Calculator {
    int sum(int a, int b) {
        return a+b;
    }
    float sum(float a, float b) {
        return a+b;
    }
    int sum(int a, int b, int c) {
        return a+b+c;
    }
}

class Animals {
    void eat() {
        System.out.println("eats anything");
    }
}
class Deer {
    void eat() {
        System.out.println("eats only grass");
    }
}




                                                                 // lc 20 = ABSTRACT CLASSES;
abstract class Animal {
    String colour;
    Animal() {
       // colour = "Brown";   ==   for testing the that heiracky chal rahi hai that ki ya constructor hi call hoyaga chaya change kar la aaga. 
       System.out.println("Animal constructor called "); // for showing more heiracky with 2 or more '"MAINLY EXPLANING 3RD PT"', 
    }
    void eat() { // this is non abstract method.
        System.out.println("animal eats");
    }
    abstract void walk(); // {
        // abstract classes vo hoti hai jisma hamm object nahi bana sakta // also this is abstract as their is no IMPLEMENTATION.
//    }
}
class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor called");  // for showing more heiracky with 2 or more '"MAINLY EXPLANING 3RD PT"', 
    }
    void changecolour() {
        colour = "White";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class mustang extends Horse { // this class is made for ==== for showing more heiracky with 2 or more '"MAINLY EXPLANING 3RD PT"', 
    mustang() {
        System.out.println("Mustang constructor called");
    }
}


class Chicken extends Animal { // this class is from starting of this 20th lc and above than mustang.
        void changecolour() {
        colour = "Dark Brown";
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}




                                                                 // lc 21 = INTERFACE;
interface chessplayer {
void moves();    
}

class Queen implements chessplayer {
public void moves() {  // public bcz interface ma sab kuch public karna hota hai and here default ho jayaga so have to write public.
System.out.println("up, down, left, right, diagonal (in all four direction)");
}
}
class Rock implements chessplayer {
public void moves() {  
System.out.println("up, down, left, right");
}
}
class King implements chessplayer {
public void moves() {  
System.out.println("up, down, left, right, diagonal - (by 1 step)");
}
}

// for multiple inheritance;
interface herbivour {
void eats();
}
interface carnivour {
void eatss();
}
class Bear implements herbivour, carnivour {
public void eats() {
    System.out.println("generally included fruits for their eats, so be a part of herbivour");
}
public void eatss() {
    System.out.println("get shikar their pray and eat them all, so be a part of carnivour class also");
}
}


                                                        // lc 22 = STATIC(PROPERTY, FUNCTIONS, BLOCKS, NESTED CLASSES);
class Student {
    static int returnpercentage(int maths, int phy, int che) { // ab STATIC lagana sa ya f(x) ek hi barr create hua baar baar create nahi hoga JUST LIKE MAIN FUNCTION IN MAIN CLASS;
    return (maths + phy + che) / 3; // here f(x) protect code for MULTIPLE CREATION;
}

    String name;
    int roll;

    static String schoolname;
    void setname(String name) {
        this.name = name;
    }
    String getname(String name) {
        return this.name;
    }
}


                                                         // lc 23 = SUPER KEYWORD;
class Animalss {
    String colour;
    Animalss() {
        System.out.println("Animal constructor is called");
    }
}
class Horses extends Animalss {
    Horses() {
        super(); // if super keyword ka aaga hamm sidha paranthesis laga deta hai tho sidha animal class ka constructor call ho jayaga.
//     super means immediate uppar vali parent class. (ko call karna)
//     YHA PA SAWAL UTHATHA KI AAGAR YA NAHI LIKHATA SUPER THO BHI THO SAME HI LINE EXECUTE HOTI THO FIR ISKI JARURAT KYU PARI ??
// ANS= AAGR YHA PA HAMM NAHI LIKHTA THO JAVA BY DEFAULT ISA CALL KARTA HAI, YHA PA BASS HAMNA LIKH KAR DIKHA DIYA HAI.
        super.colour = "brown";   // issa hamm parent class ma colour ki value ko setup kar denga.
        System.out.println("Horses class constructor is callad");
    }
}
