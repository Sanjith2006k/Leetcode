class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int original=n;
    
      
        while(n!=0){
            int x=n%10;
            sum+=x;
            product*=x;
            n/=10;
        }
        int sums= sum+product;
        if(original%sums==0){
            return true;
        }
        return false;
        
    }
}