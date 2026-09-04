class Solution {
    public int maximumWealth(int[][] accounts) {
        int r = accounts.length;
        int c = accounts[0].length;
        int m=0;
        int max=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m+=accounts[i][j];
            }
            max=Math.max(m,max);
            m=0;
        }
        return max;
    }
}