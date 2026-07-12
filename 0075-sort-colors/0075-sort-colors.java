class Solution {
    public void sortColors(int[] nums) {
        int front = 0 ;
        int last = nums.length - 1;
        while ( front != last){
            if ( nums[front] == 0 ){
                front ++ ;
            }
            else if( nums[last] != 0  ){
                last--;
            }
            else{
                int temp = nums[front];
                nums[front] = nums[last];
                nums[last] = temp;
            }
        }
        last = nums.length -1;
        while ( front != last){
            if ( nums[front] == 1 ){
                front ++ ;
            }
            else if( nums[last] != 1  ){
                last--;
            }
            else{
                int temp = nums[front];
                nums[front] = nums[last];
                nums[last] = temp;
            }
        }
        // return nums;
    }
}