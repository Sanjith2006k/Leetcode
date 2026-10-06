class Solution {
    public int firstUniqChar(String s) {
      int[] freq = new  int[26];
      char[] sa = s.toCharArray();
        for(int i=0;i<sa.length;i++){
            freq[sa[i] - 'a']++;
        }
         for(int i =0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
            return i;
        
            }
        }
    return -1;
    }
}