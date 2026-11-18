class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int op = 0; op < operations.length; op++) {
            String number = operations[op];
            if (number.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                int c = a+b;
                stack.push(b);
                stack.push(a);
                stack.push(c);
            } 
            else if (number.equals("D")) {
              stack.push( 2 * stack.peek());
            } 
            else if (number.equals("C")) {
                stack.pop();
            } 
            else {
                stack.push(Integer.parseInt(number));
            }
        }

        int sum = 0;
       while(!stack.isEmpty()){
        sum += stack.pop();
       }

        return sum;
    }
}