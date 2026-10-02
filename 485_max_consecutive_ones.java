class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int s=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]==1 ){

                s++;
            
            if(s>j)
            j=s;
            }
            else
            s=0;
           
            
    }
     return j;
}
}