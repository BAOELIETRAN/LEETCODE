/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class prob199 {
public:
    vector<int> rightSideView(TreeNode* root) {
        vector<int> res;
        if (root == NULL){
            return res;
        }
        queue<TreeNode*> myQueue;
        myQueue.push({root});
        while (myQueue.size()){
            TreeNode* newNode = myQueue.back();
            int val = newNode->val;
            res.push_back(val);
            int len = myQueue.size();
            for (int i = 0; i < len; i ++){
                TreeNode* node = myQueue.front();
                if (node->left != NULL){
                    myQueue.push(node->left);
                }
                if (node->right != NULL){
                    myQueue.push(node->right);
                }
                myQueue.pop();
            }
        }
        return res;
    }
};