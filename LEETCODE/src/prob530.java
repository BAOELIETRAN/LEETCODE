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
class prob530 {
    public class TreeNode {
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

    int ans = Integer.MAX_VALUE;
    int prev = Integer.MAX_VALUE;

    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.right);
        ans = Math.min(ans, Math.abs(root.val - prev));
        prev = root.val;
        inOrder(root.left);
    }
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return ans;
    }
}