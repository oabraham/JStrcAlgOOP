import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.*;

/*  Tree node structure */
class Node 
{
    int data;
    Node left, right;
  
    Node(int item) 
    {
        data = item;
        left = right = null;
    }
}
  
class BinaryTree 
{
    Node root;
      
    /* this function checks if a binary tree is full or not */
    boolean isFullTree(Node node)
    {
        // if empty tree
        if(node == null)
        return true;
          
        // if leaf node
        if(node.left == null && node.right == null )
            return true;
          
        // if both left and right subtrees are not null
        // the are full
        if((node.left!=null) && (node.right!=null))
            return (isFullTree(node.left) && isFullTree(node.right));
          
        // if none work
        return false;
    }
  
    /* returns true if given search tree is binary
    search tree (efficient version) */
   boolean isBST()  {
       return isBSTUtil(root, Integer.MIN_VALUE,
                              Integer.MAX_VALUE);
   }
    /* Returns true if the given tree is a BST and its
    values are >= min and <= max. */
  boolean isBSTUtil(Node node, int min, int max)
  {
      /* an empty tree is BST */
      if (node == null)
          return true;

      /* false if this node violates the min/max constraints */
      if (node.data < min || node.data > max)
          return false;

      /* otherwise check the subtrees recursively
      tightening the min/max constraints */
      // Allow only distinct values
      return (isBSTUtil(node.left, min, node.data-1) &&
              isBSTUtil(node.right, node.data+1, max));
  }
      
}

class Animal {
	   public void move() {
	      System.out.println("Animals can move");
	   }
	}

	class Dog extends Animal {
	   public void move() {
	      System.out.println("Dogs can walk and run");
	   }
	   public void bark() {
	      System.out.println("Dogs can bark");
	   }
	}
public class Comienzo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hey Hey!!! Baby I love you soooo much. I miss you. i want to hold you and kiss you.");
		
		String [] array = {"Ron", "Harry", "Hermoine"};
		 
        //enhanced for loop
        for (String x:array)
        {
            System.out.println(x);
        }
 
        /*for loop for same function
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
        */
        
        do
        {
            //statements..
        }
        while (false);
        
        
        
		Stack<String> stack = new Stack<String>();
	    stack.push("A");    // Insert "A" in the stack
	    stack.push("B");    // Insert "B" in the stack
	    stack.push("C");    // Insert "C" in the stack
	    stack.push("D");    // Insert "D" in the stack
	    System.out.println(stack.peek());    // Prints the top of the stack ("D")
	    stack.pop();    // removing the top ("D")
	    stack.pop();    // removing the next top ("C")
		
	    BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.right = new Node(40);
        tree.root.left.left = new Node(50);
        tree.root.right.left = new Node(60);
        tree.root.left.left.left = new Node(80);
        tree.root.right.right = new Node(70);
        tree.root.left.left.right = new Node(90);
        tree.root.left.right.left = new Node(80);
        tree.root.left.right.right = new Node(90);
        tree.root.right.left.left = new Node(80);
        tree.root.right.left.right = new Node(90);
        tree.root.right.right.left = new Node(80);
        tree.root.right.right.right = new Node(90);
          
        if(tree.isFullTree(tree.root))
            System.out.print("The binary tree is full");
        else
            System.out.print("The binary tree is not full"); 
	    
        tree = new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
 
        if (tree.isBST())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
        
        Map<String,String> countryNames = new HashMap<String,String>(200);
        countryNames.put("GB", "Great Britain");
        countryNames.put("FR", "France");
        countryNames.put("IT", "Italy");
        countryNames.put("FW", "Far Far Away");

        String name = countryNames.get("IT");
        
        LinkedList<String> anotherList = new LinkedList<String>();
        anotherList.add("Omar");
        
        
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        // ArrayList add
        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
        arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList add:  " + duration);

        
        
        // LinkedList add
        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
        linkedList.add(i);
        }
        endTime = System.nanoTime();pub
        duration = endTime - startTime;
        System.out.println("LinkedList add: " + duration);

        // ArrayList get
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
        arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList get:  " + duration);

        // LinkedList get
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
        linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList get: " + duration);


        // ArrayList remove
        startTime = System.nanoTime();

        for (int i = 9999; i >=0; i--) {
        arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList remove:  " + duration);

        // LinkedList remove
        startTime = System.nanoTime();

        for (int i = 9999; i >=0; i--) {
        linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList remove: " + duration);
        
		
        BufferedWriter writer = null;
        try {
            //create a temporary file
            String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            File logFile = new File("A_text_file_from_" + timeLog);

            // This will output the full path where the file will be written to...
            System.out.println(logFile.getCanonicalPath());

            writer = new BufferedWriter(new FileWriter(logFile));
            writer.write("Hello world!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }
	}

}
