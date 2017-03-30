/*
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
*/


public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        return helper(root, new StringBuilder(), new ArrayList<String>());
    }

//This is basically DFS
    private ArrayList<String> helper(TreeNode root, StringBuilder sb, ArrayList<String> list){
        if(root == null) return list;
        
        sb.append(root.val);
        
        if(root.left == null && root.right == null) list.add(sb.toString());
        sb.append("->");
        helper(root.left, new StringBuilder(sb), list);
        helper(root.right, new StringBuilder(sb),list);
        
        return list;
    }
}
