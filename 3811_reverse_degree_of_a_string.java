class Solution {
    public int reverseDegree(String s) {
        char[] ch = s.toCharArray();
        int sum=0;
        for(int i=0;i<ch.length;i++){
            
                int a = 'z'-ch[i]+1;
                sum = sum + a*(i+1);
            
        }
        
        return sum;
    }
}