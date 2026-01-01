package src.LinkList;

public class LLL {
        private Node head;
  private Node tail;
  private int size;
    class Node {
        private int val;
        private Node next;


        public Node(int val) {
            this.val = val;

        }
    }

    void insertAtFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    void insertAtLast(int val){

    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
