package simple_formal_data_structure;

import java.util.Stack;

public class ArrayStack {
    private Object a[];
    private int top;

    public ArrayStack(int n){
        a = new Object[n];
        top = -1;
    }

    public void push(Object item){
        if(top == a.length - 1){
            System.out.println("Stack is full");
            return;
        }

        top++;
        a[top] = item;
    }

    public boolean isEmpty(){
        return top == -1;
    }
    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        Object item = a[top];
        top--;
        return item;
    }

    public int size(){
        return top + 1;
    }

    public Object peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }

        return a[top];
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(4);
        arrayStack.push(12);
        arrayStack.push("Hadush");
        arrayStack.push(new int[]{1,2,3,4,5});
        arrayStack.push(45);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());

        System.out.println("[+] ");
        Stack<Integer> s = new Stack<>();
        s.push(42);
        s.push(-3);
        System.out.println(s.peek());
        System.out.println(s.pop());
    }
}
