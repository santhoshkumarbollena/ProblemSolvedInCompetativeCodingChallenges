import java.util.*;


public class TreeExample {
	Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeExample bt = new TreeExample();
		 
	    bt.add(1);
	    bt.add(2);
	    bt.add(3);
	    bt.add(4);
	    bt.add(5);
	    bt.add(9);
	    bt.add(7);
	 
	    bt.traverseInOrder(bt.root);
		
	}
	public void traverseInOrder(Node node) {
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(" " + node.value);
	        traverseInOrder(node.right);
	    }
	}
	public void add(int value) {
	    root = addRecursive(root, value);
	}
	private static Node addRecursive(Node current, int value) {
	    if (current == null) {
	        return new Node(value);
	    }
	 
	    if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }
	 
	    return current;
	}
}

class Node {
    int value;
    Node left;
    Node right;
 
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}