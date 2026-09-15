class Solution {
    public int lengthOfLongestSubstring(String s) {

       int max = 0;
       int start = 0;
       int end = 0;
       ArrayList<Character> list = new ArrayList<>();
       
       while(end < s.length()){
        if(!list.contains(s.charAt(end))){
            list.add(s.charAt(end));
            max = Math.max(max, end-start+1);
                        end++;

        }
        else{
            list.remove(Character.valueOf(s.charAt(start)));
            start++;
        }
       }
       return max;
    }
}