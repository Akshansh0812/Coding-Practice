package Leetcode.DynamicProgramming;

public class Q120 {
    int n = triangle.size();

    int[][] dp = new int[n][n];
        for(int[] row : dp){
        Arrays.fill(row,0);
    }
        for(int j = 0; j < n; j++){
        dp[n-1][j] = triangle.get(n-1).get(j);
    }
        for(int i = n-2; i>= 0;i--){
        for(int j = 0; j<=i; j++){
            int down = triangle.get(i).get(j) + dp[i+1][j];
            int right = triangle.get(i).get(j) + dp[i+1][j+1];
            dp[i][j] = Math.min(down,right);
        }
    }
        return dp[0][0];
}
