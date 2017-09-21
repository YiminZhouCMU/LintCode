public class Solution {
    /*
     * @param root: the root of tree
     * @return: the max node
     */
    TreeNode max = new TreeNode(Integer.MIN_VALUE);
    public TreeNode maxNode(TreeNode root) {
        // write your code here
        if (root == null){
            return root;
        }
        if (root.val > max.val){
            max = root;
        }
        maxNode(root.left);
        maxNode(root.right);
        return max;
    }
}