class Solution {
    public int reverse(int x) {
        int y;long z = 0L;
        
        
        while (x != 0) {
            y = x % 10;
           
            
            z = z * 10 + y;
             
            x = x / 10;

        }
       
         if (z > Integer.MAX_VALUE || z < Integer.MIN_VALUE) {return 0;}
       return (int)z;
      

    }
}