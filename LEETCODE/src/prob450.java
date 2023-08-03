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
class prob450 {
    public TreeNode findLeftMostNode(TreeNode root){
        if (root == null){
            return null;
        }
        TreeNode leftMostNode = root;
        while (leftMostNode.left != null){
            leftMostNode = leftMostNode.left;
        }
        return leftMostNode;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null){
            return null;
        }
        if (key < root.val){
            root.left = deleteNode(root.left, key);
        }
        else if (key > root.val){
            root.right = deleteNode(root.right, key);
        }
        else{
            if (root.left == null && root.right == null){
                return null;
            }
            if (root.left == null && root.right != null){
                return root.right;
            }
            if (root.left != null && root.right == null){
                return root.left;
            }
            TreeNode value = findLeftMostNode(root.right);
            root.val = value.val;
            root.right = deleteNode(root.right, value.val);
        }
        return root;
    }
}