package Leetcode;

public class Q278 {
    public int firstBadVersion(int n) {
        int i = 1, j = n;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(isBadVersion(mid) == true){
                j=mid-1;

            }else if(isBadVersion(mid) == false){
                i = mid+1;
            }
        }
        return i;
    }
}
