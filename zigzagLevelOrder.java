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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
        traversal(root,lst,1);
        return lst;
    }
    public void traversal(TreeNode root, List<List<Integer>> lst, int n) {
        if (root==null) return;
        if (lst.size()<n) lst.add(new ArrayList<Integer>());
        if (n%2!=0) lst.get(n-1).add(root.val);
        else lst.get(n-1).add(0,root.val);
        traversal(root.left,lst,n+1);
        traversal(root.right,lst,n+1);
    }
}
