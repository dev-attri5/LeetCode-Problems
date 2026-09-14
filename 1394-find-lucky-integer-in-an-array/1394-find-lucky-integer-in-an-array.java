class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        int[] feq = new int[501];

        for(int i = 0; i<n; i++){
            feq[arr[i]]++;
        }
        int ans = -1;
        for(int i = 1; i<=500; i++){
            if(feq[i] == i){
               ans = i;
            }
        }
        return ans;
    }
}