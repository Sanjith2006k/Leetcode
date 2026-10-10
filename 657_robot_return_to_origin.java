class Solution {
    public boolean judgeCircle(String moves) {
        char[] ch = moves.toCharArray();
        int x=0;
        int y=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='R')x++;
            if(ch[i]=='L')x--;
            if(ch[i]=='U')y++;
            if(ch[i]=='D')y--;

        }
        return x==y;
    }
}