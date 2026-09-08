class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int length = s.length();
        int window = p.length();
       
        ArrayList<Integer> result = new ArrayList<>();
        int[] sArray = new int[26];
        int[] pArray = new int[26];

 
        if(length < window){
            return result;
        }

        for(int i = 0; i < window; i++){
            int si = s.charAt(i) - 'a';
            int pi = p.charAt(i) - 'a';
            sArray[si]++;
            pArray[pi]++;
        }
        if(Arrays.equals(sArray,pArray)){
            result.add(0);
        }
        for(int i = 1; i<=length-window; i++){
            int prev = s.charAt(i-1) - 'a';
            int next = s.charAt(i + window - 1) - 'a';
            sArray[next]++;
            sArray[prev]--;

            if(Arrays.equals(sArray,pArray)){
                result.add(i);
            }
        }
        return result;

    }
}