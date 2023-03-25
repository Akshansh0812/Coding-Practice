package Leetcode.Trees;

public class Q108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    private TreeNode helper(int[] nums, int left, int right){
        if(left > right) {
            return null;
        }
        if(left == right){
            return new TreeNode(nums[left]);
        }
        int mid = (left+right)/2;
        TreeNode temp = new TreeNode(nums[mid]);
        temp.left = helper(nums, left, mid-1);
        temp.right = helper(nums, mid+1, right);
        return temp;
    }
}
