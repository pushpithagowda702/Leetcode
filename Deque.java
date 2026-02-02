public class Deque {
    int size;
    int capacity;
    int[] deque;
    int rear;
    int front;

    public Deque(int capacity) {
        this.capacity = capacity;
        deque = new int[this.capacity];
        rear = front = size = 0;
    }

    public boolean isEmpty() {
        return (this.size == 0);
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public void addFirst(int val) {
        if(isFull()){
            System.out.println("Queue full");
            return;
        }

        front = (front - 1 + this.capacity) % capacity;
        deque[front] = val;
        size++;
    }

    public void addLast(int val) {
        if(isFull()){
            System.out.println("Queue full");
            return;
        }

        deque[rear] = val;
        rear = (rear + 1) % capacity;
        size++;
    }

    public int peekFirst() {
        if(isEmpty()) {
            return -1;
        }
        return deque[front];
    }

    public int peekLast() {
        if(isEmpty()) {
            return -1;
        }
        return deque[(rear - 1 + capacity) % capacity];
    }

    public int removeFirst() {
        if(isEmpty()) {
            return -1;
        }

        int val = deque[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

     public int removeLast() {
        if(isEmpty()) {
            return -1;
        }
        rear = (rear - 1 + capacity) % capacity;
        int val = deque[rear];
        size--;
        return val;
    }
    
}
