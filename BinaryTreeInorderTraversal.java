
package binarytreeinordertraversal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author keeganjones
 * 
  
 *
 */
public class BinaryTreeInorderTraversal {

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
      //void setRight(...)
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> currList = new ArrayList<Integer>();
        
        // Left: use recursion to find our way to the bottom left leaf
        if (root.left != null) {
            List<Integer> retval = inorderTraversal(root.left);
            // if left is null we move to right
            
            // add to the end of the arraylist all the values for the lower left nodes that are returned
            currList.addAll(retval); 
        }
        // Root: add the value of the current node to the list
        currList.add(root.val);
        
        // Right
        if (root.right != null) {
            var retval = inorderTraversal(root.right);
            currList.addAll(retval);
        }
        return currList; //if left is null we return the list and move back up a node
        
    }
    public static void main(String[] args) {
        // for testing
        //    1
        //  2  3 
        //4 5  6 7
           TreeNode tn5 = new TreeNode(5);
           TreeNode tn4 = new TreeNode(4);
           TreeNode tn6 = new TreeNode(6);
           TreeNode tn7 = new TreeNode(7);
           TreeNode tn2 = new TreeNode(2, tn4, tn5);
           TreeNode tn3 = new TreeNode(3, tn6, tn7);
           TreeNode tn1 = new TreeNode(1, tn2, tn3);
           inorderTraversal(tn1);
        
    }
    
}

    

