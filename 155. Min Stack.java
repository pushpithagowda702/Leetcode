class MinStack {

    Node stack;

    public MinStack() {
    }
    
    public void push(int val) {
        int min = Math.min(val, (stack != null ? stack.min : val));
        Node node = new Node(val, min, stack);
        stack = node;
    }
    
    public void pop() {
        stack = stack.next;
    }
    
    public int top() {
        return stack.val;
    }
    
    public int getMin() {
        return stack.min;
    }

    private class Node {
        int val;
        int min;
        Node next;
        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}