class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            if (first[c] == -1) first[c] = i;
            last[c] = i;
        }

        int[] intervalEnd = new int[n];
        Arrays.fill(intervalEnd, -1);

        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            if (first[c] != i) continue; 
            int end = last[c];
            int j = i + 1;
            boolean valid = true;
            while (j <= end) {
                int cc = s.charAt(j) - 'a';
                if (first[cc] < i) {
                    valid = false;
                    break;
                }
                if (last[cc] > end) {
                    end = last[cc];
                }
                j++;
            }
            if (valid) intervalEnd[i] = end;
        }

        int[] dpCount = new int[n + 1];
        int[] dpLen = new int[n + 1];
        boolean[] taken = new boolean[n];

        for (int i = n - 1; i >= 0; i--) {
            int bestCount = dpCount[i + 1];
            int bestLen = dpLen[i + 1];
            boolean take = false;

            if (intervalEnd[i] != -1) {
                int e = intervalEnd[i];
                int tCount = 1 + dpCount[e + 1];
                int tLen = (e - i + 1) + dpLen[e + 1];
                if (tCount > bestCount || (tCount == bestCount && tLen < bestLen)) {
                    bestCount = tCount;
                    bestLen = tLen;
                    take = true;
                }
            }
            dpCount[i] = bestCount;
            dpLen[i] = bestLen;
            taken[i] = take;
        }

        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < n) {
            if (intervalEnd[i] != -1 && taken[i]) {
                result.add(s.substring(i, intervalEnd[i] + 1));
                i = intervalEnd[i] + 1;
            } else {
                i++;
            }
        }
        return result;
    }
}