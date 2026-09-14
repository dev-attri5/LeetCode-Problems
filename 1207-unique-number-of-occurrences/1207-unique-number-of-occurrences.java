class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        int[] freq = new int[2001];
        for (int num : arr) {
            freq[num + 1000]++;
        }

        int[] freqCount = new int[arr.length + 1];

        for (int i = 0; i < 2001; i++) {
            if (freq[i] > 0) {

                if (freqCount[freq[i]] > 0) {
                    return false;
                }

                freqCount[freq[i]]++;
            }
        }

        return true;
    }
}