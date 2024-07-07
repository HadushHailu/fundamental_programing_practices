package simple_formal_data_structure;

public class LinkedQueue {

    Node front;
    Node rear;
    int count;
    class Node{
        Object data;
        Node next;
        Node(Object item){
            data = item;
        }
    }

    public void enqueue(Object item){
        Node p = new Node(item);
        if(front == null){
            front = rear = p;
            rear.next = null;
        }else if(front == rear){
            rear = p;
            front.next = rear;
            rear.next = null;
        }else{
            rear.next = p;
            rear = p;
            rear.next = null;
        }
        ++count;
    }

    public Object dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        Object item = front.data;
        front = front.next;
        --count;
        return item;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public Object peek(){
        return front.data;
    }

    public int size(){
        return count;
    }

    public void display(){
        Node p = front;
        System.out.println("Linked Queue: ");
        if(p == null){
            System.out.println("Empty");
        }
        while(p != null){
            System.out.println(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(34);
        linkedQueue.enqueue(44);
        linkedQueue.enqueue(54);
        linkedQueue.enqueue(64);
        linkedQueue.enqueue(74);
        linkedQueue.dequeue();
        linkedQueue.display();

    }

}
