class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        return solve(nums, 0);
    }

    public int solve(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }

        return nums[index] + solve(nums, index + 2);
    }
}