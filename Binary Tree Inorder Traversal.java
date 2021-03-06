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
     * @param root: A Tree
     * @return: Inorder in ArrayList which contains node values.
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        traversalHelper(root, result);
        return result;
    }
    
    private void traversalHelper(TreeNode node, ArrayList result) {
        if (node == null) {
            return;
        }
        
        traversalHelper(node.left, result);
        result.add(node.val);
        traversalHelper(node.right, result);
    }
}