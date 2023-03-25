package Leetcode.String;

public class Q14 {
    public String longestCommonPrefix(String[] strs) {

        // sort the Array
        //then chk the first and last element only

        StringBuilder sb = new StringBuilder();

        if(strs == null || strs.length == 0) return "";

        Arrays.sort(strs);

        String str1 = strs[0];
        String str2 = strs[strs.length - 1];

        for(int i = 0; i < str1.length() && i < str2.length(); i++){
            if(str1.charAt(i) == str2.charAt(i)){
                sb.append(str1.charAt(i));
            }else{
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
