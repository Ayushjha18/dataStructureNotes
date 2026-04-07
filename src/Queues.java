public class Queues {

    private int front;
    private int rear;
    private int size;
    private final int[] queue = new int[10];


    public void enqueue(int data) {

        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 10;
            size++;
        } else {
            System.out.println("Queue is full");
        }

    }


    public int dequeue() {

        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int temp = queue[front];
        front = (front + 1) % 10;
        front++;
        size--;

        return temp;
    }

    public int peek() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        return queue[front];
    }

    public void showQueue() {
        for (int i = front; i < size; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size != 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }
}
