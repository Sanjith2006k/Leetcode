class Solution {
    public int majorityElement(int[] num) {
        HashMap<Integer,Integer> bucket = new HashMap<>();
        for(int i=0;i<num.length;i++){
            bucket.put(num[i],bucket.getOrDefault(num[i],0)+1);

            if(bucket.get(num[i])>num.length/2)
            return num[i];
        }
        return -1;
    }
}