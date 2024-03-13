package simple_formal_project_9;

class ArrayQueueImpl{
    private int[] arrQueue = new int[5];
    private int front = 0;
    private int rear = -1;

    public void resize(){
        int oldLen = arrQueue.length;
        int newLen = 2 * oldLen;

        int[] newArrQueue = new int[newLen];
        System.arraycopy(arrQueue, 0,
                newArrQueue, 0, oldLen);
        arrQueue = newArrQueue;
    }

    public void enqueue(int val){
        //Check if Array is full
        if(rear == (arrQueue.length - 1)){
            resize();
        }

        ++rear;
        arrQueue[rear] = val;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }

        int val = arrQueue[front];
        ++front;
        return val;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arrQueue[front];
    }

    public boolean isEmpty(){
        return (front > rear);
    }

    public int size(){
        return (rear - front) + 1;
    }

    @Override
    public String toString(){
        String str = "[";
        for(int i=front; i<= rear; ++i){
            str += arrQueue[i] + " - ";
        }
        str += "]\n";
        return str;
    }

    public int getFront(){
        return front;
    }

    public int getRear(){
        return rear;
    }

}
public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueueImpl arrayQueue = new ArrayQueueImpl();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);
        System.out.println(arrayQueue);
        System.out.println("[+]Queue size: " + arrayQueue.size() + "\n  front index: " + arrayQueue.getFront() + "\n  rear index: " + arrayQueue.getRear());

        System.out.println("Dequeue: " + arrayQueue.dequeue());
        arrayQueue.enqueue(6);
        arrayQueue.enqueue(7);
        arrayQueue.enqueue(8);
        System.out.println("Dequeue: " + arrayQueue.dequeue());
        arrayQueue.enqueue(9);
        System.out.println(arrayQueue);
        System.out.println("[+]Queue size: " + arrayQueue.size() + "\n  front index: " + arrayQueue.getFront() + "\n  rear index: " + arrayQueue.getRear());
    }
}
