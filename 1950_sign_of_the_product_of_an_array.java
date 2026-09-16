class Solution {
    public int arraySign(int[] nums) {
        int s=1;
        for(int num:nums){
            s*=num;
        }
if(s>0)
return 1;
else if(s<0)
return -1;

return 0;

        
    }
}