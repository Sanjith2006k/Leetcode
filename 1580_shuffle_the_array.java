class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a = new int[2*n];
        for(int i=0;i<n;i++){
            a[i*2]=nums[i];
            a[2*i+1]=nums[n+i];
        }
        return a;
    }
}