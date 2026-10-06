class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     List<Integer> res = new ArrayList<>();
     for(int num:nums){
        int ind= Math.abs(num)-1;
        if(nums[ind]<0){
            res.add(ind+1);
        }
        else{
            nums[ind]=-nums[ind];
        }
     }
     return res;
      
    }
}