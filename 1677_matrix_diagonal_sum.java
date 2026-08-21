class Solution {
    public int diagonalSum(int[][] mat) {
        int r = mat.length;
     
        int s=0;
        for(int i =0;i<r;i++){
            for(int j=0;j<r;j++){
            if(i==j)
            s+=mat[i][j];
            
            else if(i+j==r-1)
            s+=mat[i][j];
        }
   
    }
    return s;
    }
}