class Solution {
    public boolean canAliceWin(int[] nums) {
        int one=0;
        int two=0;
 
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10)
            one+=nums[i];
            else
            two+=nums[i];
        }
   if(one==two)
   return false;
   return true;

    }
}