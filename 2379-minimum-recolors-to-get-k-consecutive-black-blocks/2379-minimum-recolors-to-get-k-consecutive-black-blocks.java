class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whites = 0;

        for(int i = 0; i<k; i++){
            if(blocks.charAt(i) == 'W'){
                whites++;
            }
        }
        int ans = whites;

        for(int i = k; i<blocks.length(); i++){
            if(blocks.charAt(i) == 'W'){
                whites++;
            }

            if(blocks.charAt(i - k) == 'W'){
                whites--;
            }
            ans = Math.min(ans, whites);
        }
        return ans;
    }
}