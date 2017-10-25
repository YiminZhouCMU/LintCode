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
     * @param root: A tree
     * @return: buttom-up level order a list of lists of integer
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> level = new LinkedList<TreeNode>();
        level.add(root);
        
        while (!level.isEmpty()) {
            List<Integer> nodes = new ArrayList<Integer>();
            int size = level.size();
            for (int i = 0; i < size; i++) {
                TreeNode parent = level.poll();
                nodes.add(parent.val);
                if (parent.left != null) {
                    level.add(parent.left);
                }
                if (parent.right != null) {
                    level.add(parent.right);
                }
            }
            result.add(nodes);
        }
        
        Collections.reverse(result);
        return result;
    }
}