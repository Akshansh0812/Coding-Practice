package Leetcode.DynamicProgramming;

public class BestTimetoBuyandSellStock121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i : prices){
            if(min > i){
                min = i;
            }
            else {
                ans = Math.max(ans, i-min);
            }
        }
        return ans;
    }
}
