package Leetcode.SlidingWindow;

public class LongestRepeatingCharacterReplacement432 {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int end = 0;
        int max = 0, maxLength = 0;
        int[] map = new int[26];
        while(end < s.length()){
            max = Math.max(max, ++map[s.charAt(end)-'A']);

            while(end - start + 1 - max > k){
                map[s.charAt(start) - 'A']--;
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        return maxLength;
    }
}
