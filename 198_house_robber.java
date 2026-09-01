class Solution {
    public int rob(int[] nums) {
        if(nums.length==2){
            if(nums[0]>nums[1])
            return nums[0];
            else
                return nums[1];
        }
        int s=0;
        for(int i=0;i<nums.length;i=i+2)
            s+=nums[i];
        return s;
    }
}