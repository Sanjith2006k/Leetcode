class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jew=jewels.toCharArray();
        char[] sto=stones.toCharArray();
        int c=0;
        for(int i=0;i<jew.length;i++){
            for(int j=0;j<sto.length;j++){
                if(jew[i]==sto[j])
                c++;
            }
        }
        return c;
    }
}