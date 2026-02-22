class MyCircularQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int count;
    private int capacity;

    public MyCircularQueue(int k) {
        capacity = k;
        queue = new int[k];
        front = 0;
        rear = -1;
        count = 0;
    }

    // Insert element into the circular queue
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        count++;
        return true;
    }

    // Delete element from the circular queue
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        count--;
        return true;
    }

    // Get front item
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }

    // Get rear item
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return queue[rear];
    }

    // Check if empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Check if full
    public boolean isFull() {
        return count == capacity;
    }
}