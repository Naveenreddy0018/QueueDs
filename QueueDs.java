public class QueueDs {
    private Object[] queue;
    private static int size;
    private static int front;
    private static int rear;
    public QueueDs(int size) {
        this.size = size;
        this.front = 0;
        this.rear = -1;
        queue = new Object[size];
    }

    public void enqueue(int val) {
        if(rear == size) {
            System.out.println("Queue is full");
        } 
        rear++;
        queue[rear] = val;
        
        // System.out.println("The value is inserted in the queue");
    }

    public void dequeue() {
        if(front == rear) {
            System.out.println("Queue is empty");
        }
        else {  
            for(int i = 0; i < rear; i++) {
                queue[i] = queue[i+1];
            }
            if (rear < size) {
                queue[rear] = 0;
            }
            rear-=1;

        }
    
        // System.out.println("\nThe value is deleted " + val);
    }

    public void dispaly() {
        for(int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " -> ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        QueueDs q = new QueueDs(5);
        q.enqueue(23);
        q.enqueue(45);
        q.enqueue(98);
        q.enqueue(32);
        q.enqueue(95);
        q.dispaly();
        q.dequeue();
        q.dispaly();
        q.enqueue(6);
        q.dispaly();
        q.dequeue();
        q.dequeue();
        q.dispaly();
        q.enqueue(987);
        q.dispaly();
        q.enqueue(749);
        q.dispaly();
    }
}

