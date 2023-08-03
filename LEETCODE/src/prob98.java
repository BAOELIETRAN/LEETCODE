import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class prob98 {
    
	List<Integer> list = new ArrayList<>();

	public boolean isValidBST(TreeNode root) {
        inOrder(root);
        return isSorted(list);
	}

    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

    public boolean isSorted(List<Integer> list){
        for (int i = 0; i < list.size() - 1; i ++){
            if (list.get(i) >= list.get(i + 1)){
                return false;
            }
        }
        return true;
    }
}