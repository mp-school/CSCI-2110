package Labs.Lab5;
import java.util.*;

public class LLDemo {
    

public static void main(String[] args){
    
Scanner in = new Scanner(System.in);

String n = " ";

// ui
System.out.println("Enter Pokemon names, one on each line");
System.out.println("Enter quit to end");

LinkedList<String> pokemon = new LinkedList<String>();


    do {
        n = in.nextLine();
        if (!n.equals("quit")) {
            pokemon.add(n);
    }
    } while (!n.equals("quit"));

        System.out.println(" ");
        System.out.println("\nPokemon in the list:");
        pokemon.enumerate();

        System.out.println(" ");
        System.out.println("\nEven Pokemon in the list:");
        displayEven(pokemon);

        System.out.println(" ");
        System.out.println("\nOdd Pokemon in the list:");
        displayOdd(pokemon);

        System.out.println(" ");
        System.out.println("\nReveresed List:");
        reverse(pokemon);

        System.out.println(" ");
        System.out.println("\nRemoved Middle Index:");
        removeMiddle(pokemon);
    }

    

// Even Indices
public static void displayEven(LinkedList<String> list){

    for(int i = 0; i < list.size(); i += 2){
        System.out.print(list.getAt(i) + " ");
    }
} 



// Odd Indices
public static void displayOdd(LinkedList<String> list){

    for(int i = 1; i < list.size();  i += 2){
            System.out.print(list.getAt(i) + " ");

    }
}

//method to create a reversed linked list
public static LinkedList<String> reverse(LinkedList<String> list){
    
    LinkedList<String> reversed = new LinkedList<String>();

    for (int i = list.size() - 1; i >= 0; i--) {
        reversed.add(list.getAt(i));
        System.out.print(list.getAt(i) + "--> "); // I added this because if i call enumerate its prints it backwards
    
    }
    
    
    return reversed;
    
    }


    //method to remove the middle node in the linked list
    public static void removeMiddle(LinkedList<String> list){
        
        int middle = list.size() / 2;
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


Keko
Mika
Crumb
Pookie
SnowGlobe
Peri
Pablo
Sydney
quit


13
12
11
10
9
8
7
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

 