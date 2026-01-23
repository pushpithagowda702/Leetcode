class MyStack {
    Queue<Integer> queue;
    Queue<Integer> helperQueue;

    public MyStack() {
        this.queue = new LinkedList<>();
        this.helperQueue = new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        while(queue.size() != 1) {
            helperQueue.add(queue.remove());
        }
        int removed = queue.remove();
        while(!helperQueue.isEmpty()) {
            queue.add(helperQueue.remove());
        }
        return removed;
    }
    
    public int top() {
        while(queue.size() != 1) {
            helperQueue.add(queue.remove());
        }
        int removed = queue.element();
        helperQueue.add(queue.remove());
        while(!helperQueue.isEmpty()) {
            queue.add(helperQueue.remove());
        }
        return removed;
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}