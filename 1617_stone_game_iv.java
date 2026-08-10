class Solution {
    boolean a[]=new boolean[100001];
    public boolean winnerSquareGame(int n) {
        if(n==0) return false;
        if(a[n]) return a[n];
        for(int i=1;i*i<=n;i++){
            if(winnerSquareGame(n-i*i)==false){
                return a[n]=true;
            }
        }
        return a[n]=false;
        
    }
}