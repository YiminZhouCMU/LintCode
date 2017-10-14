public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    /*
    * @param a: An integer
    */
    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    /*
     * @param number: An integer
     * @return: nothing
     */
    public void push(int number) {
        stack.push(number);
        if(minStack.empty()) {
            minStack.push(number);
        } else {
            minStack.push(Math.min(number, minStack.peek()));
        }
    }

    /*
     * @param a: An integer
     * @return: An integer
     */
    public int pop() {
        minStack.pop();
        return stack.pop();
    }

    /*
     * @param a: An integer
     * @return: An integer
     */
    public int min() {
        return minStack.peek();
    }
}