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
 class Pair {
    TreeNode node;
    int index;

    Pair(TreeNode node, int index) {
        this.node = node;
        this.index = index;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0));
        int maxwidth=0;
        while(!q.isEmpty()){
            int size=q.size();
            int first=q.peek().index;
            int start=0;
            int end=0;
            for(int i=0;i<size;i++){
                Pair p=q.poll();
                int curr=p.index-first;
                if(i==0) start=curr;
                if(i==size-1)
                end=curr;
                if(p.node.left!=null)
                q.add(new Pair(p.node.left,2*curr+1));
                if(p.node.right!=null)
                q.add(new Pair(p.node.right,2*curr+2));
            }
            maxwidth=Math.max(maxwidth,end-start+1);
        }
        return maxwidth;
    }
}