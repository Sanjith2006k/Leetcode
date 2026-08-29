class Solution {
    public int[][] transpose(int[][] m) {
        int r = m.length;
        int c = m[0].length;
        int[][] rs = new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               rs[j][i]=m[i][j];
            }
        }
        return rs;
    }
}