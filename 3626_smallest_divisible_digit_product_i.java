class Solution {
       public int product(int n){
          int pro=1;
        while(n!=0){
            int x = n%10;
            pro*=x;
            n=n/10;

        }
        return pro;
        }
    public int smallestNumber(int n, int t) {
      
        int org = n;
     

        if(product(n)%t==0){
            return org;
        }
        
            while(product(org)%t!=0){
                org++;
            }
           
            
        return org;

        }
        
    }