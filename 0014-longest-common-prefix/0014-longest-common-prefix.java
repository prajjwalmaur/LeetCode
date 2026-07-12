class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for ( String s : strs){
            if ( ans.length() == 0 ){
                return ans;
            }
            String temp = "";
            for ( int i = 0 ; i < Math.min(ans.length(), s.length() ) ; i++ ){
                if( ans.charAt(i) == s.charAt(i) ){
                    temp += ans.charAt(i);
                }
                else {
                    break;
                }
            }
            ans = temp;
        }
        return ans;
    }
}