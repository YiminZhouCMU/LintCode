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
    /*
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        return isValidHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean isValidHelper(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        
        if ((root.val <= min) || (root.val >= max)) {
            return false;
        }
        
        boolean leftResult = isValidHelper(root.left, min, Math.min(max, root.val));
        boolean rightResult = isValidHelper(root.right, Math.max(min, root.val), max);
        
        return leftResult && rightResult;
    }
}