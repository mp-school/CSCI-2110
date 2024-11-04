package Labs.Lab7; // get rid of when handing in
import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        
// use array list 
    ArrayList<BinaryTree<String>> testTree = new ArrayList<>(); 
    
    Scanner in = new Scanner(System.in);

// ui loop
    while (true) {

            System.out.print("Enter name or done: ");

            String ui = in.nextLine(); // user input

            if (ui.equalsIgnoreCase("done")) { // exit case is done and ignore caps
                break; 
            }

            // make binary tree
            BinaryTree<String> node = new BinaryTree<>();
            node.makeRoot(ui); 
            testTree.add(node);
            
        }

       
    BinaryTree<String> root = null; // set root to null

    for (int i = 0; i < testTree.size(); i++) {

        if (root == null) { // base case
                root = testTree.get(i); 
            
        } else { // glue case
               
            BinaryTree<String> current = root;

    while (true) {

         if (current.getLeft() == null) { // base case
                current.attachLeft(testTree.get(i));
                break;

        } else if (current.getRight() == null) { // base case
                current.attachRight(testTree.get(i));
                break;

        } else { // glue case         
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

    	/*        
		      emboar
              /   \
        unfezant   palkia
            / \   
    seperior   samurott
          
    */


    /*        
		        1
              /   \
             2     3
            / \   
            4  5
           / \
          6   7
         / \
        8  9
    */


     /*        
		        A
              /   \
             B     C
            / \
           D   E
          / \
         F   G
        / \
       H   I
      / \
     J   K
    / \
   L   M
    */
}