package simple_formal_project_9;

class DoubleLinkedListStack {

    int size;
    Node head;
    Node tail;
    public class Node{
        Object value;
        Node next;
        Node prev;
        Node(Object value){
            this.value = value;
        }
    }

    DoubleLinkedListStack(){
        head = null;
        tail = null;
        size = 0;
    }

    public void push(Object object){
        Node toPush = new Node(object);
        //stack is empty
        if(head == null){
            head = tail = toPush;
            ++size;
        }else{
            toPush.prev = tail;
            tail.next = toPush;
            tail = toPush;
            ++size;
        }
    }

    public int size(){
        return size;
    }
    public Object peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
        return tail.value;
    }

    public boolean isEmpty(){
        return  (tail == null);
    }
    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }

        Object item = tail.value;
        if(tail.prev == null){
            tail = null;
            head = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
        --size;

        return item;
    }

    @Override
    public String toString(){
        String str = "[";
        Node curr = head;
        while(curr != null){
            str += curr.value.toString() + "<->";
            curr = curr.next;
        }
        str += "]";
        return str;
    }
}

public class DoubleLinkedListStackTest{
    public static void main(String[] args) {
        DoubleLinkedListStack doubleLinkedListStack = new DoubleLinkedListStack();
        doubleLinkedListStack.push(1);
        doubleLinkedListStack.push("Hadush");
        doubleLinkedListStack.push(2);
        doubleLinkedListStack.push(6);
        System.out.println(doubleLinkedListStack);
        System.out.println("size: " + doubleLinkedListStack.size());

        System.out.println("pop: " + doubleLinkedListStack.pop());
        System.out.println("pop: " + doubleLinkedListStack.pop());
        System.out.println("pop: " + doubleLinkedListStack.pop());
        System.out.println(doubleLinkedListStack);
        System.out.println("size: " + doubleLinkedListStack.size());

        System.out.println("peek: " + doubleLinkedListStack.peek());
        System.out.println("pop: " + doubleLinkedListStack.pop());
        System.out.println(doubleLinkedListStack);
        System.out.println("size: " + doubleLinkedListStack.size());

    }
}