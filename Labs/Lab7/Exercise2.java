package Labs.Lab7;
import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<BinaryTree<String>> testTree = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        // user input loop
        while (true) {
            System.out.print("Enter name or done: ");
            String ui = in.nextLine();
            if (ui.equalsIgnoreCase("done")) {
                break;
            }
            BinaryTree<String> node = new BinaryTree<>();
            node.makeRoot(ui);
            testTree.add(node);
        }

       
        BinaryTree<String> root = null;
        for (int i = 0; i < testTree.size(); i++) {
            if (root == null) { // base case
                root = testTree.get(i); 
            
            } else { // glue case
               
                BinaryTree<String> current = root;
                while (true) {
                    if (current.getLeft() == null) {
                        current.attachLeft(testTree.get(i));
                        break;
                    } else if (current.getRight() == null) {
                        current.attachRight(testTree.get(i));
                        break;
                    } else {
                        
                        current = current.getLeft();
                    }
                }
            }
        }

        // Test statements
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