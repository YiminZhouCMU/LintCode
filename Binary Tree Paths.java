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
     * @param root: the root of the binary tree
     * @return: all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if (root == null) {
            return result;
        }
        
        List<String> left = binaryTreePaths(root.left);
        List<String> right = binaryTreePaths(root.right);
        for (String path : left) {
            result.add(String.valueOf(root.val) + "->" + path);
        }
        for (String path : right) {
            result.add(String.valueOf(root.val) + "->" + path);
        }
        
        if (result.size() == 0) {
            result.add(String.valueOf(root.val));
        }
        return result;
    }
}