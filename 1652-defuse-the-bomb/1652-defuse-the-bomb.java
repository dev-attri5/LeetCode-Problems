class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n]; 
       if(k == 0){
        return result;
       }
       int windowsum = 0;
       int start = 0;
       int end = 0 ;

       if(k>0){
        start = 1;
        end = k;
        for(int i = start; i <= end; i++){
            windowsum  = windowsum + code[i%n];
        }
        for(int i = 0; i < n; i++){
            result[i] = windowsum;
            windowsum = windowsum-code[start%n];
            start++;
            end++;
            windowsum += code[end%n];
        }

       }
       else{
        k = -k;
        start = n-k;
        end = n-1;
        for(int i = start; i<=end; i++){
            windowsum = windowsum + code[i];
        }
        for(int i = 0; i < n; i++){
            result[i] = windowsum;
            windowsum = windowsum - code[start%n];
            start++;
            end++;
            windowsum = windowsum + code[end%n];
        }
       }
       return result;
    }
}