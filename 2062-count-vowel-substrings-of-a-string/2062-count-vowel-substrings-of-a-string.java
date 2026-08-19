class Solution {
    public int countVowelSubstrings(String word) {
        int n = word.length();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = i; j < n; j++) {
                char c = word.charAt(j);
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    break; 
                }
                seen.add(c);
                if (seen.size() == 5) {
                    count++;
                }
            }
        }
        
        return count;
    }
}