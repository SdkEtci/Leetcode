/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
        	return true;
		else
            return isSym(root.right, root.left);
    }

    public boolean isSym(TreeNode node1, TreeNode node2){
        if (node1 == null && node2 == null)
            return true;

        else if (node1 == null || node2 == null)
            return false;

        else if (node1.val != node2.val)
            return false;

        else
            return isSym(node1.right, node2.left) && isSym(node1.left, node2.right);
        
    }       
}