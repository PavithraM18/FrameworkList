package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// the following program BFS search me
public class BinaryTreeLevelOrderTraversal {

public static class TreeNode {
	// Definition for a binary tree node.
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
	
}

	    public static List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> result = new ArrayList<>();
	        if (root == null) return result;
	        
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.add(root); // Start with the root node
	        
	        while (!queue.isEmpty()) {
	            int levelSize = queue.size();
	            List<Integer> levelValues = new ArrayList<>();
	            
	            for (int i = 0; i < levelSize; i++) {
	                TreeNode node = queue.poll();// Retrieve and remove the head of the queue
	                levelValues.add(node.val);// Add the node value to the current level list
	                
	                if (node.left != null) {
	                    queue.add(node.left); // Add left child to the queue
	                }
	                if (node.right != null) {
	                    queue.add(node.right);// Add right child to the queue
	                }
	            }
	            
	            result.add(levelValues);// Add the current level list to the result
	        }
	        
	        return result;
	    }
	    
	    public static void main(String[] args) {
	        // Example usage:
	        // Constructing the following binary tree:
	        //       3
	        //     /   \
	        //    9    20
	        //        /  \
	        //       15   7
	        TreeNode root = new TreeNode(3);
	        root.left = new TreeNode(9);
	        root.right = new TreeNode(20);
	        root.right.left = new TreeNode(15);
	        root.right.right = new TreeNode(7);
	        
	    
	        List<List<Integer>> result = levelOrder(root);
	        
	        // Output the result
	        System.out.println(result);
	    }
	    
}

