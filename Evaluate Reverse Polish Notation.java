public class Solution {
    /*
     * @param tokens: The Reverse Polish Notation
     * @return: the value
     */
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        String operators = "+-*/";
        for (String s : tokens) {
            if (!operators.contains(s)) {
                stack.push(Integer.parseInt(s));
                continue;
            }
            int a = stack.pop();//the second number
            int b = stack.pop();// the first number
            if (s.equals("+")) {
                int result = b + a;
                stack.push(result);
            }
            if (s.equals("-")) {
                int result = b - a;
                stack.push(result);
            }
            if (s.equals("*")) {
                int result = b * a;
                stack.push(result);
            }
            if (s.equals("/")) {
                int result;
                if (a == 0){
                    result = 0;
                } else {
                    result = b / a;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }
}