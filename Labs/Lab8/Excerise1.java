package Labs.Lab8;
import java.util.*;
// [Megan Picard]
// [B00939548]

import javax.swing.tree.TreeNode;


public class Excerise1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        BinarySearchTree testTree = new BinarySearchTree(); // make new tree

    // - - - - - - -  -- - - - - - -- - - -  -

        // takes in user input until 0 is inputed
        System.out.println("  ");
        System.out.println(" - - - - -");
        System.out.println("Enter int or '0': ");
        
// ui input loop
        int ui = in.nextInt(); 
        
        if (ui >= 1){ // insert first node as long as not 0
            testTree.insert(ui);
        }

        while (ui != 0){ // while ui not zero read in the rest of values
            System.out.println("Enter int or '0': ");
            ui = in.nextInt(); 

//make the binary search tree
            
            if (ui != 0 ){ // make sure 0 isnt added
                testTree.insert(ui); // the bst will sort it
           }

        }

    // - - - - - - -  -- - - - - - -- - - -  -

// call find max 
        System.out.println(" ");
        System.out.println("The max data value in the BST is: " + testTree.findMax());

// call find min
        System.out.println("The min data value in the BST is: " + testTree.findMin());

// search   
        System.out.println(" ");
        System.out.println("What key would you like to search for? ");
        int key = in.nextInt();

// call recursive search method
        BinaryTree<Integer> checkKey = testTree.recursiveSearch(key); 
       
        if (checkKey != null && checkKey.getData() == (key)){ // if checkkey isnt null and matches user input key
            System.out.println(" ");
            System.out.println("Key Found!"); // found
            System.out.println(" - - - - -");
        } else{
            System.out.println(" ");
            System.out.println("Key Not Found!"); // not found
            System.out.println(" - - - - -");
        }
    }

    // - - - - - - -  -- - - - - - -- - - -  -

     // test cases
        // [ 1 2 3 4 5 6 7 8 9 10]
        // [ 9 10 8 7 6 5 4 3 2 1 ]




}
