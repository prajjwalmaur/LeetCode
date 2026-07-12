class Solution {
    public int[] productExceptSelf(int[] nums) {
        long mul  = 1;
        int found = 0;
        for ( int i : nums){
            if( found > 1){
                return( new int[nums.length] ) ;
            }
            else if( i != 0){
                mul *= i;
            }
            else{
                found ++;
            }
        }
        if( found > 1 || (nums.length == 1 && nums[0] == 0 ) ){
                return( new int[nums.length] ) ;
        }
        int [] ans = new int[nums.length];
        for( int i = 0 ; i < nums.length ; i ++ ){
            if ( found == 1 && nums[i] != 0){
                ans[i] = 0;
            }
            else if( nums[i] == 0 ){
                ans[i] = (int) mul;
            }
            else {
                ans[i] = (int) ( mul / nums[i] );
            }
        }
        return ans;
    }
}