class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int ldia=diameterOfBinaryTree(root.left);
        int rdia=diameterOfBinaryTree(root.right);
        return Math.max(leftHeight+rightHeight,Math.max(ldia,rdia));
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
}