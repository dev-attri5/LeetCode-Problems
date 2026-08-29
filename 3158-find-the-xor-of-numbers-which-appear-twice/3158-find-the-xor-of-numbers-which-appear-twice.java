class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] count = new int[51];
        int ans = 0;

        for(int i = 0; i < nums.length; i++){
            count[nums[i]]++;

            if(count[nums[i]] == 2){
                ans ^= nums[i];
            }
        }
        return ans;
    }
}