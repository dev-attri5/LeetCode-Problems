class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     List<Integer> ans = new ArrayList<>();
     boolean feq[] = new boolean[nums.length+1];
     for(int i = 0; i < nums.length; i++){
        feq[nums[i]] = true;
     }
     for(int i = 1; i <= nums.length; i++){
        if(feq[i] == false){
            ans.add(i);
        }
     }
     return ans;

    }
}