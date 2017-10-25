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
     * @return: Level order a list of lists of integer
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> nodesOnLevelX = new LinkedList<TreeNode>();
        nodesOnLevelX.add(root);
        
        while (!nodesOnLevelX.isEmpty()) {
            List<Integer> nodes = new ArrayList<Integer>();
            int size = nodesOnLevelX.size();
            for (int i = 0; i < size; i++) {
                TreeNode parent = nodesOnLevelX.poll();
                nodes.add(parent.val);
                if (parent.left != null) {
                    nodesOnLevelX.add(parent.left);
                }
                if (parent.right != null) {
                    nodesOnLevelX.add(parent.right);
                }
            }
            result.add(nodes);
        }
        
        return result;
    }
}