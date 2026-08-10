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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index=postorder.length-1;
        return build(inorder,postorder,0,inorder.length-1);
    }
    TreeNode build(int[]in,int[]post,int start,int end){
        if(start>end) return null;
        TreeNode root=new TreeNode(post[index--]);
        int i=start;
        while(in[i]!=root.val)
        i++;
        root.right=build(in,post,i+1,end);
        root.left=build(in,post,start,i-1);
        return root;
    }
}