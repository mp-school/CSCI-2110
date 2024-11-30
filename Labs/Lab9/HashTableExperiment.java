package Labs.Lab9;

//Hash Table Experiment
//This is a simple demo program that
//creates an ArrayList of LinkedList of Integer objects
//It first displays the empty linked lists
//It then hashes some keys and displays the linked lists again
//It uses the generic LinkedList class and the generic Node class

//MODIFY THIS PROGRAM TO DO THE LAB EXERCISE 
import java.util.*;
public class HashTableExperiment
{
	public static void main(String[] args)
	{
		//prompt the user to enter the table size
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the hash table size: ");
		int n = keyboard.nextInt();
		
		//create an Arraylist of size n
		//The ArrayList holds a LinkedList object 
		//The LinkedList consists of nodes that hold integer objects
		ArrayList<LinkedList<Integer>> hashtable = new ArrayList<LinkedList<Integer>>();
		for (int i=0; i<n; i++)
		{
			hashtable.add(i, new LinkedList<Integer>());
		}
		//Display the arraylist of linked lists
		System.out.println("Empty lists");
		for (int i=0; i<n; i++)
		{
			System.out.print(i + ": ");
			hashtable.get(i).enumerate();
			System.out.println("null");
		}
				

// TO DO

// get number of keys to hash from user inpput
System.out.println("Enter the number of keys to be hashed:");
int key_Num = keyboard.nextInt();

HashSet<Integer> keySet = new HashSet<>();
Random ran = new Random();

while (keySet.size() < key_Num) {
    keySet.add(ran.nextInt(10000) + 1);
}

ArrayList<Integer> keys = new ArrayList<>(keySet);

System.out.println(keys); // ****TEST******


for (int k : keys){
	int index = k % n;
	hashtable.get(index).add(k);
}
		
		//Add keys 187, 105, 120, 205, 189 to the appropriate linked list
		//187 will be added to the linked list at index 187%n
		//105 will be added to the linked list at index 105%n
		//etc.
		int index = 187%n;
		hashtable.get(index).add(187);
		index = 105%n;
		hashtable.get(index).add(105);
		index = 120%n;
		hashtable.get(index).add(120);
		index = 205%n;
		hashtable.get(index).add(205);
		index = 189%n;
		hashtable.get(index).add(189);
		
		//Display the arraylist of linked lists
		System.out.println();
		System.out.println("After the keys are hashed");

		for (int i=0; i<n; i++)
		{
			System.out.print(i + ": ");
			hashtable.get(i).enumerate();
			System.out.println("--> null");
		}

			
// get info

// collisons
int collisons = 0;
for (LinkedList<Integer> cols : hashtable){
	if (cols.size() > 1){
		collisons += cols.size() - 1;
	}
}

// longest list
int longestList = 0;
for (LinkedList<Integer> longList : hashtable){
	int current = longList.size();

	if (current > longestList){
		longestList = current;
	}

}



// ui -> print stats
System.out.println(" ");
System.out.println("Statistics:");
System.out.println("Table size: " + n);
System.out.println("Number of keys:  " + key_Num);
System.out.println("Load factor: " + (double)key_Num/n);
System.out.println("Number of collisions: " + collisons);
System.out.println("Longest list: " + longestList);

	}
}
			
		
