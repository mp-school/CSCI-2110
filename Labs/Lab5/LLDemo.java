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

        System.out.println("\nPokemon in the list:");
        pokemon.enumerate();

        System.out.println("\n Even Pokemon in the list:");
        displayEven(pokemon);

        System.out.println("\n Odd Pokemon in the list:");
        displayOdd(pokemon);

    }

    

// Even Indices
public static void displayOdd(LinkedList<String> list){

    for(int i = 0; i < list.size(); i++){
        if(i % 2 != 0){
            System.out.print(list.getAt(i) + " ");
            }
    }
}



// Odd Indices
public static void displayEven(LinkedList<String> list){

    for(int i = 0; i < list.size(); i++){
        if(i % 2 == 0 || i == 0){
            System.out.print(list.getAt(i) + " ");
        }
    }
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



Keko
Mika
Crumb
Pookie
SnowGlobe
Peri
Pablo
Sydney
quit


0
1
2
3
4
5
6
7
quit
 * 
 * 
 */