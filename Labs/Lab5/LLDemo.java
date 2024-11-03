// Full Name: [Megan Picard]
// ID Number: [B00939548]

package Labs.Lab5; // comment out whe handing in
import java.util.*;

public class LLDemo {
    

public static void main(String[] args){
    
Scanner in = new Scanner(System.in);

String n = " "; //user input placeholder

// ui
System.out.println("Enter Pokemon names, one on each line");
System.out.println("Enter quit to end");

LinkedList<String> pokemon = new LinkedList<String>(); // create linked list



    do { // get input while user not inputed quit
        n = in.nextLine();
        if (!n.equals("quit")) {
            pokemon.add(n);
    }
    } while (!n.equals("quit"));

        // prints list with arrows
        System.out.println(" ");
        System.out.println("\nPokemon in the list:");
        pokemon.enumerate();

        // prints even list without arrows
        System.out.println(" ");
        System.out.println("\nEven Pokemon in the list:");
        displayEven(pokemon);

        // prints odd list without arrows
        System.out.println(" ");
        System.out.println("\nOdd Pokemon in the list:");
        displayOdd(pokemon);

        // prints reverse list with arrows
        System.out.println(" ");
        System.out.println("\nReveresed List:");
        reverse(pokemon);

        // prints no middle index list with arrows
        System.out.println(" ");
        System.out.println("\nRemoved Middle Index:");
        removeMiddle(pokemon);
    }

    

// Even Indices
public static void displayEven(LinkedList<String> list){

    for(int i = 0; i < list.size(); i += 2){ // start at 0 add 2
        System.out.print(list.getAt(i) + " ");
    }
} 



// Odd Indices
public static void displayOdd(LinkedList<String> list){ // start at 1 add 2

    for(int i = 1; i < list.size();  i += 2){
            System.out.print(list.getAt(i) + " ");

    }
}

//method to create a reversed linked list
public static LinkedList<String> reverse(LinkedList<String> list){
    
    LinkedList<String> reversed = new LinkedList<String>();

    for (int i = list.size() - 1; i >= 0; i--) {
        reversed.add(list.getAt(i));
        System.out.print(list.getAt(i) + "--> "); // I used this because if i call enumerate its prints it backwards
    
    }
    
    
    return reversed;
    
 }


//method to remove the middle node in the linked list
public static void removeMiddle(LinkedList<String> list){
        
    int middle = (list.size() - 1)/ 2; // finds middle, rounds down cause int divison ex -> 9/2 = 4.5v -> 4
    list.removeAt(middle);
        
       
        list.enumerate();
        
    }

}


// Test Cases
/*

Pikachu
Charizard
Mewtwo
Emboar
Bulbasaur
Eevee
Gengar
Ditto
Charmander
quit


Pikachu
Charizard
Mewtwo
Emboar
Eevee
Gengar
Ditto
Charmander
quit


5
4
3
2
1
0
quit

6
5
4
3
2
1
0
quit
 * 
 * 
 */

 