package Labs.Lab7;
import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        
// use array list 
    ArrayList<BinaryTree<String>> q = new ArrayList<>(); 
    
    Scanner in = new Scanner(System.in);

// ui loop - arbitrary number of Strings
    while (true) {

        System.out.print("Enter name or done: ");

        String ui = in.nextLine(); // user input

        // exit case is done and ignore caps
        if (ui.equalsIgnoreCase("done")) { 
            break; 
        } 

        // make binary tree
        BinaryTree<String> node = new BinaryTree<>();
        node.makeRoot(ui); 
        q.add(node);
            
        }

       
    BinaryTree<String> root = null; // set root to null

    for (int i = 0; i < q.size(); i++) {

        if (root == null) { // base case
                root = q.get(i); 
            
        } else { // glue case
               
        BinaryTree<String> current = root; // use to go through tree

            // adds to the left first
            while (true) { // while loop to add to left/right branch
            
            if (current.getLeft() == null) { // base case 
                current.attachLeft(q.get(i));
                break;

            } else if (current.getRight() == null) { // base case
                current.attachRight(q.get(i));
                break;

            } else { // glue case - add left        
                current = current.getLeft();
            }


            }
        }
    }

// Test statements -> from binary tree demo

        System.out.println();
        System.out.printf("Height of the tree is: %d\n", BinaryTree.findHeight(root));
        System.out.printf("Number of nodes in the tree is: %d\n", BinaryTree.countNodes(root));
        System.out.println();

        System.out.print("Inorder:\t");
        BinaryTree.inorder(root);
        System.out.println();

        System.out.print("Preorder:\t");
        BinaryTree.preorder(root);
        System.out.println();

        System.out.print("Postorder:\t");
        BinaryTree.postorder(root);
        System.out.println();

        System.out.print("Level order:\t");
        BinaryTree.levelOrder(root);
        System.out.println();
    }

}