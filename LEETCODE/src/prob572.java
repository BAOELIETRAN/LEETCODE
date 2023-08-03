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
class prob572 {
    private boolean isIdentical(TreeNode root, TreeNode subRoot){
        if (root == null && subRoot == null){
            return true;
        }
        else if (root == null || subRoot == null || root.val != subRoot.val){
            return false;
        }
        if (!isIdentical(root.right, subRoot.right)){
            return false;
        }
        if (!isIdentical(root.left, subRoot.left)){
            return false;
        }
        return true;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null){
            return false;
        }
        if (root.val == subRoot.val){
            if (isIdentical(root, subRoot)){
                return true;
            }
        }
        return isSubtree(root.right, subRoot) || isSubtree(root.left, subRoot);
    }
}