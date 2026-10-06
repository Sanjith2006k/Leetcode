class Solution {
    public int singleNumber(int[] nums) {

    int xn=0;
    for(int num:nums)
        xn ^= num;
        
    return xn;
    }
}