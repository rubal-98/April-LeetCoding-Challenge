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
class Solution {
    int index=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0){
            return null;
        }
        TreeNode root=null;
        return constructBst(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    TreeNode constructBst(int[] preorder,int min,int max){
        if(preorder.length<=index){
            return null;
        }
        TreeNode root=null;
        if(preorder[index]>min&&preorder[index]<max){
            root=new TreeNode(preorder[index++]);
            root.left=constructBst(preorder,min, root.val);
            root.right=constructBst(preorder,root.val,max);
        
        }
        return root;
    }
}