public class QueueDs {
    private static Object[] queue;
    private static int size;
    private static int front;
    private static int rear;
    public QueueDs(int size) {
        this.size = size;
        this.front = -1;
        this.rear = -1;
        queue = new Object[size];
    }

    public void enqueue(int val) {
        if(rear == size-1) {
            System.out.println("Queue is full");
        } 
        front = 0;
        rear += 1;
        queue[rear] = val;
        System.out.println("The value is inserted in the queue");
    }

    public void dequeue() {
        if(front == rear) {
            System.out.println("Queue is empty");
        }
        if (front >= rear) {
            front = -1;
            rear = -1;
          }
        Object val = queue[front];
        front += 1;
        System.out.println("\nThe value is deleted " + val);
    }

    public void dispaly() {
        for(int i = front; i <= rear; i++) {
            System.out.print(" " + queue[i]);
        }
    }

    public static void main(String[] args) {
        QueueDs q = new QueueDs(5);
        q.enqueue(23);
        q.enqueue(45);
        q.enqueue(98);
        q.dispaly();
        q.dequeue();
        q.dispaly();
    }
}
