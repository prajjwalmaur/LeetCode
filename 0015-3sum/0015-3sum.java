class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        Map< Integer, Integer> s = new HashMap<>();
        for(int i = 0 ; i < l ; i++){
            s.put(nums[i],i);
        }
        System.out.println(s);
        for (int i = 0; i < nums.length; i++){
            int fix = nums[i];
            for (int j = i+1 ; j < nums.length;j++){
                if( s.containsKey( (fix + nums[j])*-1 ) == true && i != s.get( (fix + nums[j])*-1 ) && j != s.get( (fix + nums[j])*-1 ) ){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(fix);
                    temp.add(nums[j]);
                    temp.add( (fix+nums[j]) *-1 );
                    Collections.sort(temp);
                    ans.add(temp);
                }
            }
            s.remove(fix);
        }
        return new ArrayList<>(ans);
    }
}