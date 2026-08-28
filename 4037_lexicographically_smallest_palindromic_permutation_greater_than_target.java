class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        
        int n = s.length();
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;

        int oddCount = 0, midIdx = -1;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1) {
                oddCount++;
                midIdx = i;
            }
        }
        if (n % 2 == 0 && oddCount != 0) return "";
        if (n % 2 == 1 && oddCount != 1) return "";

        int half = n / 2;
        int[] HC = new int[26];
        for (int i = 0; i < 26; i++) HC[i] = count[i] / 2;

        char[] targetArr = target.toCharArray();
        String midStr = (n % 2 == 1) ? String.valueOf((char) ('a' + midIdx)) : "";

        int[] targetPrefixFreq = new int[26];
        for (int i = 0; i < half; i++) targetPrefixFreq[targetArr[i] - 'a']++;

        if (Arrays.equals(targetPrefixFreq, HC)) {
            String firstHalf = target.substring(0, half);
            String candidate = firstHalf + midStr +
                    new StringBuilder(firstHalf).reverse().toString();
            if (candidate.compareTo(target) > 0) {
                return candidate;
            }
        }
        for (int i = half - 1; i >= 0; i--) {
            int[] temp = HC.clone();
            boolean ok = true;

            
            for (int j = 0; j < i; j++) {
                int c = targetArr[j] - 'a';
                if (temp[c] == 0) { ok = false; break; }
                temp[c]--;
            }
            if (!ok) continue;
            int need = targetArr[i] - 'a';
            int found = -1;
            for (int g = need + 1; g < 26; g++) {
                if (temp[g] > 0) { found = g; break; }
            }
            if (found == -1) continue;

            temp[found]--;
            StringBuilder sb = new StringBuilder();
            sb.append(targetArr, 0, i);        
            sb.append((char) ('a' + found));      
            for (int c = 0; c < 26; c++) {        
                for (int k = 0; k < temp[c]; k++) sb.append((char) ('a' + c));
            }

            String firstHalf = sb.toString();
            return firstHalf + midStr + new StringBuilder(firstHalf).reverse().toString();
        }

        return "";
    }
}