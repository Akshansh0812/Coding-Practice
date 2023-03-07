package Leetcode.String;

public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] temp = new int[26];
        for(char c : magazine.toCharArray()){
            temp[c-'a']++;
        }
        for(char ch : ransomNote.toCharArray()){
            if(temp[ch-'a']-- <= 0){
                return false;
            }
        }
        return true;
    }
}
