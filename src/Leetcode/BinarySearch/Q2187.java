package Leetcode.BinarySearch;

public class Q2187 {
    public long minimumTime(int[] time, int totalTrips) {
        long low = 0, high = Long.MAX_VALUE;
        while(low < high){
            long mid = low + (high-low)/2;
            long trips = 0;
            for(int t : time){
                if(trips >= totalTrips) break;
                trips += mid/t;
            }
            if(trips < totalTrips){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
    }
