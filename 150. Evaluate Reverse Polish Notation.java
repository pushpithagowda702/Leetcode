class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<tokens.length; i++) {
            String c = tokens[i];
            switch(c) {
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "/":
                    int sec = stack.pop();
                    int fir = stack.pop();
                    stack.push(fir / sec);
                    break;
                case "-":
                    int sub = stack.pop();
                    stack.push(stack.pop() - sub);
                    break;
                default:
                    stack.push(Integer.parseInt(c));
                    break;
            }
        }
        return stack.peek();
    }
}