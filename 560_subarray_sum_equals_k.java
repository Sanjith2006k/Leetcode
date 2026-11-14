class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0;
        int s=0;
        for (int i = 0; i < nums.length; i++) {
            s=0;
            for (int j = i ; j < nums.length; j++) {
               s=s+nums[j];
               if(s==k)
                    c++;
                }}
                return c;
    }
}