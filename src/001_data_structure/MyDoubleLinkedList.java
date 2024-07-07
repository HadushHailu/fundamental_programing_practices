package simple_formal_data_structure;

public class MyDoubleLinkedList {

    private int numOfNodes;
    ListNode head;
    ListNode tail;

    public class ListNode{
        int val;
        ListNode next;
        ListNode prev;
        ListNode(int val){
            this.val = val;
        }
    }

    public MyDoubleLinkedList(){
        numOfNodes = 0;
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
    }

    public void addAtHead(int val){
        ListNode pred = head;
        ListNode succ = head.next;
        ListNode toAdd = new ListNode(val);
        toAdd.next = succ;
        toAdd.prev = pred;
        succ.prev = toAdd;
        pred.next = toAdd;
        ++numOfNodes;
    }

    public void addAtTail(int val){
        ListNode succ = tail;
        ListNode pred = tail.prev;
        ListNode toAdd = new ListNode(val);
        toAdd.prev = pred;
        toAdd.next = succ;
        succ.prev = toAdd;
        pred.next = toAdd;
        ++numOfNodes;
    }

    public void addAtIndex(int index, int val){
        if(index > numOfNodes) return;
        if(index < 0) index = 0;

        ListNode pred;
        ListNode succ;

        if(index < numOfNodes - index){
            pred = head;
            for(int i=0; i< index; ++i){
                pred = pred.next;
            }
            succ = pred.next;
        }else{
            succ = tail;
            for(int i=0; i< numOfNodes-index; ++i){
                succ = succ.prev;
            }
            pred = succ.prev;
        }

        ListNode toAdd = new ListNode(val);
        toAdd.next = succ;
        toAdd.prev = pred;
        succ.prev = toAdd;
        pred.next = toAdd;
        ++numOfNodes;
    }

    public void deleteAtIndex(int index){
        if(index >= numOfNodes) return;
        ListNode pred = head;

        for(int i=0; i<index; i++){
            pred = pred.next;
        }
        ListNode succ = pred.next.next;
        pred.next = succ;
        succ.prev = pred;
        --numOfNodes;
    }

    @Override
    public String toString(){
        ListNode curr = head;
        String str = "Double Linked List: (head<->";

        for(int i=0; i<numOfNodes; ++i){
            curr = curr.next;
            str += curr.val + "<->";
        }

        str += "tail)";
        return str;
    }

    public int get(int index){
        if(index < 0 || index >= numOfNodes) return -1;

        ListNode curr = head;
        if(index + 1 < numOfNodes - index){
            curr = head;
            for(int i=0; i< index + 1; ++i){
                curr = curr.next;
            }
        }else{
            curr = tail;
            for(int i=0; i< numOfNodes-index; ++i){
                curr = curr.prev;
            }
        }
        return curr.val;

    }

    public static void main(String[] args) {
        MyDoubleLinkedList myDoubleLinkedList = new MyDoubleLinkedList();
        myDoubleLinkedList.addAtHead(9);
        myDoubleLinkedList.deleteAtIndex(0);
        myDoubleLinkedList.addAtTail(4);
        myDoubleLinkedList.addAtIndex(0,400);
        System.out.println("At index 0: " + myDoubleLinkedList.get(0));

        System.out.println(myDoubleLinkedList);

        //System.out.println(myDoubleLinkedList.head.next.next.next.val);
    }
}
