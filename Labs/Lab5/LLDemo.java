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


    }

}
