package Labs.Lab7; // get rid of when handing in

//This class contains the methods for the BinaryTree class.
//For the lab Exercise 1, you need to complete the TO-DO methods
import java.util.ArrayList;
public class BinaryTree<T> {
	private T data;
	private BinaryTree<T> parent;
	private BinaryTree<T> left;
	private BinaryTree<T> right;

	public BinaryTree() {
		parent = left = right = null;
		data = null;
	}

	public void makeRoot(T data) {
		if (!isEmpty()) {
			System.out.println("Can't make root. Already exists");
		} else
			this.data = data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setLeft(BinaryTree<T> tree) {
		left = tree;
	}

	public void setRight(BinaryTree<T> tree) {
		right = tree;
	}

	public void setParent(BinaryTree<T> tree) {
		parent = tree;
	}

	public T getData() {
		return data;
	}

	public BinaryTree<T> getParent() {
		return parent;
	}

	public BinaryTree<T> getLeft() {
		return left;
	}

	public BinaryTree<T> getRight() {
		return right;
	}

	public void attachLeft(BinaryTree<T> tree) {
		if (tree == null)
			return;
		else if (left != null || tree.getParent() != null) {
			System.out.println("Can't attach");
			return;
		} else {
			tree.setParent(this);
			this.setLeft(tree);
		}
	}

	public void attachRight(BinaryTree<T> tree) {
		if (tree == null)
			return;
		else if (right != null || tree.getParent() != null) {
			System.out.println("Can't attach");
			return;
		} else {
			tree.setParent(this);
			this.setRight(tree);
		}
	}

	public BinaryTree<T> detachLeft() {
		if (this.isEmpty())
			return null;
		BinaryTree<T> retLeft = left;
		left = null;
		if (retLeft != null)
			retLeft.setParent(null);
		return retLeft;
	}

	public BinaryTree<T> detachRight() {
		if (this.isEmpty())
			return null;
		BinaryTree<T> retRight = right;
		right = null;
		if (retRight != null)
			retRight.setParent(null);
		return retRight;
	}

	public boolean isEmpty() {
		if (data == null)
			return true;
		else
			return false;
	}

	public void clear() {
		left = right = parent = null;
		data = null;
	}

	public BinaryTree<T> root() {
		if (parent == null)
			return this;
		else {
			BinaryTree<T> next = parent;
			while (next.getParent() != null)
				next = next.getParent();
			return next;
		}
	}

	//this method counts the number of nodes in a BinaryTree recursively
	public static <T> int countNodes(BinaryTree<T> t){
	
        if (t == null){
            return 0;

        } else {
            return 1 + countNodes(t.getLeft()) + countNodes(t.getRight());
        }
	}


	// this method returns the height of a BinaryTree
	public static <T> int findHeight(BinaryTree<T> t) {
        if (t == null){
            return -1;

        } else {
            return 1 + Math.max(findHeight(t.getLeft()), findHeight(t.getRight()));
        }
	
	}
	
	// this method tests whether a tree is height balanced
	public static <T> boolean heightBalanced(BinaryTree<T> t) {
	
        if ((findHeight(t.getLeft()) > findHeight(t.getRight()) + 1 || findHeight(t.getLeft()) < findHeight(t.getRight()) + 1 )){
            return false;
        } 
         else {
            return true;
        }
	}

	public static <T> void preorder(BinaryTree<T> t) {
		if (t != null) {
			System.out.print(t.getData() + "\t");
			preorder(t.getLeft());
			preorder(t.getRight());
		}
	}

	public static <T> void inorder(BinaryTree<T> t) {
		if (t != null) {
			inorder(t.getLeft());
			System.out.print(t.getData() + "\t");
			inorder(t.getRight());
		}
	}

	public static <T> void postorder(BinaryTree<T> t) {
		if (t != null) {
			postorder(t.getLeft());
			postorder(t.getRight());
			System.out.print(t.getData() + "\t");
		}
	}

	// this method uses an ArrayList to print the data associated with all
	// nodes/trees in level order
	public static <T> void levelOrder(BinaryTree<T> t) {
	
		if (t == null) { // base case
		return;
		} 

		ArrayList<BinaryTree<T>> q = new ArrayList<BinaryTree<T>>(); 
		q.add(t); // add root node

		// repeat until q is empty
		while (!q.isEmpty()){
			BinaryTree<T> current = q.remove(0);
			System.out.print(current.getData() + "\t");

			// add left first
			if(current.getLeft() != null){ // glue case
				q.add(current.getLeft());
			}
			
			if(current.getRight() != null){ // glue case
				q.add(current.getRight());
			}
			

		}
	}
}