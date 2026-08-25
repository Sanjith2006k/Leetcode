class Solution {
    public int missingMultiple(int[] nums, int k) {
            Arrays.sort(nums);
             int m=k;
            for(int i=0;i<nums.length;i++){
               
                if(nums[i]==m){
                    m=m+k;
                }
            }
            return m;
    }
}