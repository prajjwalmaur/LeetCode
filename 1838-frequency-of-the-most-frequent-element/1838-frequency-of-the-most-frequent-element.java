class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0 ;
        long cur = 0 ;
        int ans = 0;

        for ( int i = 0 ; i < nums.length ; i++ ){
            cur += nums[i];
            long tar = nums[i];

            while( ( i - left +1 )*tar - cur > k ){
                cur -= nums[left];
                left++;
            }
            if ( ans < ( i - left +1) ){
                ans = i - left +1;
            }

        }
        return ans;
    }
}