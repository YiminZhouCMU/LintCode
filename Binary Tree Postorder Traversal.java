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
     * @return: Postorder in ArrayList which contains node values.
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        traversalHelper(root, result);
        return result;
    }
    
    private void traversalHelper(TreeNode node, ArrayList result) {
        if (node == null) {
            return;
        }
        
        traversalHelper(node.left, result);
        traversalHelper(node.right, result);
        result.add(node.val);
    }
}