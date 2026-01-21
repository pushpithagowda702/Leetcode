class MyQueue {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> helperStack = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        while(!stack.isEmpty()) {
            helperStack.push(stack.pop());
        }
        int removed = helperStack.pop();
        while(!helperStack.isEmpty()) {
            stack.push(helperStack.pop());
        }
        return removed;
    }
    
    public int peek() {
        while(!stack.isEmpty()) {
            helperStack.push(stack.pop());
        }
        int firstEle = helperStack.peek();
        while(!helperStack.isEmpty()) {
            stack.push(helperStack.pop());
        }
        return firstEle;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}