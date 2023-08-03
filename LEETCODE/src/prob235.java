/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class prob235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return null;
        }
        if (p == root || q == root){
            return root;
        }
        if (p.val >= root.val && q.val >= root.val){
            root = lowestCommonAncestor(root.right, p, q);
        }
        if (p.val < root.val && q.val < root.val){
            root = lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }
}