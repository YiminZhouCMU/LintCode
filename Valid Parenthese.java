public class Solution {
    /*
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        if ((s == null) || (s.length() == 0)) {
            return true;
        }
        char[] input = s.toCharArray();
        if (input.length % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack();
        String check = "(){}[]";
        int inStack = 0;
        int outStack = 0;
        for (char c : input) {
            if (!check.contains(String.valueOf(c))) {
                return false;
            }
            if ((c == '(') || (c == '[') || (c == '{')) {
                stack.push(c);
                inStack++;
            }
            if (c == ')') {
                if (stack.isEmpty() || (stack.pop() != '(')) {
                    return false;
                }
                outStack++;
            }
            if (c == ']') {
                if (stack.isEmpty() || (stack.pop() != '[')) {
                    return false;
                }
                outStack++;
            }
            if (c == '}') {
                if (stack.isEmpty() || (stack.pop() != '{')) {
                    return false;
                }
                outStack++;
            }
        }
        if (inStack != outStack) {
            return false;
        }
        return true;
    }
}