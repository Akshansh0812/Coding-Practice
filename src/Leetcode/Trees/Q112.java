package Leetcode.Trees;

public class Q112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return helper(root, 0, targetSum);
    }
    private boolean helper(TreeNode root, int sum, int target){
        if(root == null) return false;
        sum = sum + root.val;
        if(sum == target && root.left == null && root.right == null) return true;
        // if(sum > target) return false;
        return helper(root.left, sum, target) || helper(root.right, sum, target);
    }
}
