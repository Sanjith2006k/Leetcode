class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] cnt = new int[3];

        for (int x : stones) {
            cnt[x % 3]++;
        }

        int c0 = cnt[0];
        int c1 = cnt[1];
        int c2 = cnt[2];

        if (Math.min(c1, c2) == 0) {
            return Math.max(c1, c2) > 2 && c0 % 2 == 1;
        }

        return Math.abs(c1 - c2) > 2 || c0 % 2 == 0;
    }
}