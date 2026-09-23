class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for(int i = 0; i<arr1.length; i++){
            count[arr1[i]]++;
        }
        int[] result = new int[arr1.length];
        int idx = 0;
        for(int i = 0; i<arr2.length; i++){
            int num = arr2[i];
            while(count[num]>0){
                result[idx++] = num;
                count[num]--;
            }
        }
        for(int i = 0; i<=1000; i++){
            while(count[i]>0){
                result[idx++] = i;
                count[i]--;
            }
        }
        return result;

    }
}