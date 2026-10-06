class Solution {
    public int minBitFlips(int start, int goal) {
        int a = start^goal;
        int b=0;
        String s = Integer.toBinaryString(a);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
            b++;
        }
        return b;
    }
}