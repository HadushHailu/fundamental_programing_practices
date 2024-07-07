package simple_formal_data_structure;

public class MyLinkedList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    int size;
    ListNode head;
    public MyLinkedList(){
        size = 0;
        head = new ListNode(0);
    }

    public void addAtIndex(int index, int val){
        if(index > size) return;
        if(index < 0) index = 0;

        ListNode pred = head;
        for(int i=0; i < index; i++){
            pred = pred.next;
        }

        ListNode toAdd = new ListNode(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
        ++size;
    }

    public int get(int index){
        if(index <= 0 || index >= size) return -1;

        ListNode curr = head;
        for(int i=0; i < index +1; i++){
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val){
        addAtIndex(0, val);
    }

    public void addAtTail(int val){
        addAtIndex(size, val);
    }

    public void deleteAtIndex(int index){
        if(index < 0 || index >= size) return;

        ListNode pred = head;
        for(int i=0; i < index; i++){
            pred = pred.next;
        }

        pred.next = pred.next.next;
        size--;
    }

    @Override
    public String toString(){
        String str="LinkedList: (head->";
        ListNode curr = head;
        for(int i=0; i < size; ++i){
            curr = curr.next;
            str += curr.val + "->";
        }

        str += "null)";
        return str;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(800);
        myLinkedList.addAtHead(300);
        myLinkedList.addAtTail(900);
        myLinkedList.addAtIndex(1, 200);
        myLinkedList.get(1);
        //myLinkedList.deleteAtIndex(2);
        //myLinkedList.deleteAtIndex(1);
        System.out.println(myLinkedList);
    }
}
