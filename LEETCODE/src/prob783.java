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
class prob783 {
    int ans = Integer.MAX_VALUE;
    int prev = Integer.MAX_VALUE;
    private void InOrder(TreeNode root){
        if (root == null){
            return;
        }
        InOrder(root.left);
        ans = Math.min(ans, Math.abs(root.val - prev));
        prev = root.val;
        InOrder(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        InOrder(root);
        return ans;
    }
}