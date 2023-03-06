package Leetcode.DynamicProgramming;

// https://leetcode.com/problems/maximum-product-subarray/
public class Q152 {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, product = 1;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            max = Math.max(product *= nums[i], max);
            if (nums[i] == 0) product = 1;
        }

        product = 1;
        for (int i = len - 1; i >= 0; i--) {
            max = Math.max(product *= nums[i], max);
            if (nums[i] == 0) product = 1;
        }
        return max;
    }
    private void run() {
        int[] nums = new int[]{2,3,-2,4};
        maxProduct(nums);
    }
    public static void main(String[] args) {
        new Q152().run();
    }
}
