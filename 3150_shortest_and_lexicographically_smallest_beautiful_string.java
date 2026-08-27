class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int bestLeft = -1;
        int minLength = s.length() + 1;
        int ones = 0;
        
        for (int l = 0, r = 0; r < s.length(); ++r) {
            if (s.charAt(r) == '1') {
                ++ones;
            }
            
            while (ones == k) {
                int currentLen = r - l + 1;
                
                if (currentLen < minLength) {
                    bestLeft = l;
                    minLength = currentLen;
                } else if (currentLen == minLength) {
                  
                    String currentSub = s.substring(l, l + currentLen);
                    String bestSub = s.substring(bestLeft, bestLeft + minLength);
                    if (currentSub.compareTo(bestSub) < 0) {
                        bestLeft = l;
                    }
                }
                
                if (s.charAt(l++) == '1') {
                    --ones;
                }
            }
        }
        
        return bestLeft == -1 ? "" : s.substring(bestLeft, bestLeft + minLength);
    }
}