package Assignments.A4;
// Megan Picard
// B009393548


import java.util.*;

public class Merged {


public static void main(String[] args) {
        
Scanner in = new Scanner(System.in);

// Ui
OrderedList<Integer> list1 = new OrderedList<>();
OrderedList<Integer> list2 = new OrderedList<>();

        System.out.println("Enter numbers for the first list (type 'done' to finish):");
        while (in.hasNext()) {
            if (in.hasNextInt()) {
                list1.add(in.nextInt());
            } else if (in.next().equalsIgnoreCase("done")) {
                break;
            }
        }

        System.out.println("Enter numbers for the second list (type 'done' to finish):");
        while (in.hasNext()) {
            if (in.hasNextInt()) {
                list2.add(in.nextInt());
            } else if (in.next().equalsIgnoreCase("done")) {
                break;
            }
        }
}


public static <T extends Comparable<T>> OrderedList<T> merge (OrderedList<T> list1, OrderedList<T> list2){

    OrderedList<T> list3 = new OrderedList<T>();

    int f1 = 0;
    int f2 = 0;

    while(f1 < list1.size() && f2 < list2.size()){
    
        if (list1.get(f1).compareTo(list2.get(f2)) <= 0){
            
            list3.add(list1.get(f1));
            f1++;
    }
         else if(list2.get(f2).compareTo(list1.get(f1)) <= 0){
            
            list3.add(list2.get(f2));
            f2++;
    
    }   else{
            
        list3.add(list1.get(f1));
            f1++;
            f2++;
    }

    if (f1 == list1.size()){
        list3.add(list1.get(f1));
    }

    if (f2 == list2.size()){
        list3.add(list2.get(f2));
    }

   
}
return list3;
}

}


// test cases
// Amar, Boris, Charlie, Dan, Fujian, Inder, Pei, Travis
// Alex, Betty, Charlie, Dan, Travis, Zola, Zulu