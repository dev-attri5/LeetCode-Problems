class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String result = "";

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(!st.isEmpty()){
                    result +=ch;
                }
                st.push(ch);
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    result += ch;
                }
            }
        }
        return result;
    }
}