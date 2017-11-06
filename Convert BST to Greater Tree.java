/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */


public class Solution {
    private int sum = 0;
    private void sumUpNodes(TreeNode root) {
        if (root == null) {
            return;
        }
        
        if (root.right != null) {
            sumUpNodes(root.right);
        }
        
        sum = sum + root.val;
        root.val = sum;
        
        if (root.left != null) {
            sumUpNodes(root.left);
        }
    }
    /*
     * @param root: the root of binary tree
     * @return: the new root
     */
    public TreeNode convertBST(TreeNode root) {
        sumUpNodes(root);
        return root;
    }
}