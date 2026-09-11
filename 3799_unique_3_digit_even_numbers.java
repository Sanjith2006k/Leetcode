class Solution {
    public int totalNumbers(int[] digits) {
        boolean[] used = new boolean[1000];
        int count = 0;

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {

            if (i == j || j == k || i == k)
                        continue;

                    if (digits[i] == 0)
                        continue;

                    int n = digits[i] * 100
                          + digits[j] * 10
                          + digits[k];

                    if (n % 2 == 0 && !used[n]) {
                        used[n] = true;
                        count++;
                    }
                }
            }
        }

        return count;
    }
}