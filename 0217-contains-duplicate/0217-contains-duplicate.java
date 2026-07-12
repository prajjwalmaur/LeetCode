class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> se = new HashSet<>();
        for ( int i : nums){
            if( se.contains(i)){
                return true; 
            }
            se.add(i);
        }
        return false ;
    }
}