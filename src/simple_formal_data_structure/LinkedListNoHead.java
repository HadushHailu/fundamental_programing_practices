package simple_formal_data_structure;

public class LinkedListNoHead {
    public int size;
    Node head;
    private class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    LinkedListNoHead(){
        size = 0;
        head = null;
    }

    public void insert(int value, int pos){
        if(pos > size) return;

        //If no head, create one
        if(head == null){
            System.out.println("Head is null");
            head = new Node(value);
            size++;
            return;
        }

        //If inserting position is 0
        Node toAdd = new Node(value);
        if(pos == 0){
            System.out.println("Inserting pos is 0");
            toAdd.next = head;
            head = toAdd;
        }else{
            System.out.println("Inserting pos is not zero");
            Node pred = head;
            System.out.println("[-] Head.next: " + head.next);
            for(int i=1; i < pos; i++){
                pred = pred.next;
            }
            toAdd.next = pred.next;
            pred.next = toAdd;
        }
        ++size;
    }

    public void delete(int pos){
        if(pos >= size) return;

        System.out.println("Deleting at Pos: " + pos);
        if(pos == 0){
            head = head.next;
        }else{
            Node pred = head;
            for(int i=1; i<pos; i++){
                pred = pred.next;
            }
            pred.next = pred.next.next;
        }
        --size;
    }
    @Override
    public String toString(){
        String str = "Linked List: (";
        Node curr = head;
        for(int i=0 ; i<size; i++){
            str += curr.value + "->";
            curr = curr.next;
        }
        str += "null)";
        return str;
    }

    public static void main(String[] args) {
        LinkedListNoHead linkedListNoHead = new LinkedListNoHead();
        linkedListNoHead.insert(1,0);
        linkedListNoHead.insert(2,0);
        linkedListNoHead.insert(3,0);
        linkedListNoHead.insert(4,0);
        linkedListNoHead.delete(1);
        System.out.println(linkedListNoHead);
        System.out.println(linkedListNoHead.size);
    }

}
