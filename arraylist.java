import java.util.*;  // this star means all over the world things present getting import here;;;;;
public class arraylist {

     public static void swap(ArrayList<Integer> list, int ixd1, int ixd2) {
        int temp;
        temp = list.get(ixd1);
        list.set(ixd1,list.get(ixd2));
        list.set(ixd2,temp);
     }
    public static void main(String args[]) {
        // java collection framework == ya vo hai jisma hama kafi sara mil jayanga; jisma hama kafi sari chiza milangi jaisa arraylist phala ki tarah milanga
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // // OPERATION;
        // list.add(5); // o(1)
        // list.add(4);
        // list.add(73);
        // list.add(7);
        // list2.add("c"); // o(1)
        // list2.add("z");
        // list2.add("54");
        // list2.add("alpha");
        // System.out.println("ADD ELEMENT - OPERATION");
        // System.out.println(list);
        // System.out.println(list2);
        // // GET-OPERATION = O(1);
        // System.out.println("GET - OPERATION");
        // System.out.println(list.get(1));
        // System.out.println(list2.get(2));
        // // REMOVE ELEMENT;
        // System.out.println("REMOVE - OPERATION");
        // list.remove(2);
        // list2.remove(2);
        // System.out.println(list);
        // System.out.println(list2);
        // // SET ELEMENT AT INDEX;
        // System.out.println("SET ELEMENT AT INDEX n");
        // list.set(1, 10);
        // list2.set(1,"x");
        // System.out.println(list);
        // System.out.println(list2);
        // // CONTAINS ELEMENT;
        // System.out.println("CONTAINS ELEMENT");
        // System.out.println(list.contains(2));
        // System.out.println(list2.contains("alpha"));

//                                                          lc - 1+2; end

//                                                          lc - 3 and 4;

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // System.out.println("ArrayList size : " + list.size());
        // for(int i = list.size()-1; i>=0;i--) {
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

//                                                            lc - 5 and 6 & 7;
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);
        // int max = Integer.MIN_VALUE;
        // for(int i = 0;i<list.size();i++) {
        //     // if(max < list.get(i)) {
        //     //     max = list.get(i);
        //     // }
        //     //     ||
        //     max = Math.max(max, list.get(i));
        // } 
        // System.out.println("MAX ELEMENT IN THE ARRAYLIST IS : "+max);        // lc 5;

    //     int temp;
    //     temp = list.get(1);
    //     list.set(1,list.get(3));
    //     list.set(3,temp);
    //    System.out.println(list); 
    //                                                                           // lc 6
        // int ixd1 = 1, ixd2 = 3;
        // System.out.println(list);
        // swap(list,ixd1,ixd2); // lc 6
        // System.out.println(list);

    // //                                                                           // lc 7;
    // System.out.println(list);
    // Collections.sort(list);  // ASCENDING ORDER
    // System.out.println(list);

    // // DESCENDING ORDER;;
    // Collections.sort(list, Collections.reverseOrder());
    // System.out.println(list);
    
    //                                                                           // lc 9;
    // ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
    // ArrayList<Integer> list = new ArrayList<>();
    // list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
    // mainlist.add(list);

    // ArrayList<Integer> list2 = new ArrayList<>();
    // list2.add(2); list2.add(4); list2.add(6); list2.add(8); list2.add(10);
    // mainlist.add(list2);

    // ArrayList<Integer> list3 = new ArrayList<>();
    // list3.add(3); list3.add(6); list3.add(9); list3.add(12); list3.add(15);
    // mainlist.add(list3);

    // for(int i = 0;i<mainlist.size();i++) {
    //     ArrayList<Integer> currList = mainlist.get(i);
    //     for(int j = 0;j<currList.size();j++) {
    //         System.out.print(currList.get(j)+" ");
    //     }
    //     System.out.println();
    // }
    // System.out.println(mainlist);


//                                                          SHORTER WAY TO DONE THIS;
    ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>();
    for(int i = 1; i<=5;i++) {
        list1.add(i*1);
        list2.add(i*2);
        list3.add(i*3);
    }
    mainlist.add(list1);
    mainlist.add(list2);
    mainlist.add(list3);
    System.out.println(mainlist);
     for(int i = 0;i<mainlist.size();i++) {
        ArrayList<Integer> currList = mainlist.get(i);
        for(int j = 0;j<currList.size();j++) {
            System.out.print(currList.get(j)+" ");
        }
        System.out.println();
    }
       
}
}
