package Labs.Lab8;
import java.util.*;
// [Megan Picard]
// [B00939548]

import javax.swing.tree.TreeNode;


public class Excerise1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        BinarySearchTree testTree = new BinarySearchTree();

        // takes in user input until 0 is inputed
        System.out.println("Enter int or '0': ");
        double ui = in.nextDouble();

        while (ui != 0){
            System.out.println("Enter int or '0': ");
            ui = in.nextDouble();

            //make the binary search tree
            
            if (ui != 0 ){ // make sure 0 isnt added
            testTree.insert(ui);
           }

        }

        BinaryTree.inorder(testTree.getTree());

        // find max not working -  just ouputs null
        // System.out.println(testTree.findMax());


    }


     // test cases
        // [ 1 2 3 4 5 6 7 8 9 10]
        // [ 9 10 8 7 6 5 4 3 2 1 ]




}
