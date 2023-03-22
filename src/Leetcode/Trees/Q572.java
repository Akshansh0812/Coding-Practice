package Leetcode.Trees;

public class Q572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        if(isSame(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSame(TreeNode root, TreeNode sub){
        if(root == null && sub == null) return true;
        if(root == null || sub == null) return false;

        if(root.val != sub.val) return false;

        return isSame(root.left,sub.left) && isSame(root.right, sub.right);
    }
}
