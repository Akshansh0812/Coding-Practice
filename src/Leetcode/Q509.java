package Leetcode;

public class Q509 {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int p1 = 1,p2 = 0,sum = 1;
        for(int i = 2; i<=n; i++){
            sum = p1 + p2;
            p2 = p1;
            p1 = sum;
        }
        return sum;
    }
}
