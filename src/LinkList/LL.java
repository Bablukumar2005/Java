package src.LinkList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    private class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
        Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }


    public void insertAtFirst(int val){
        if(head==null){
            Node node=new Node(val);
            node.next=head;
            head=node;
        }else {
            Node node = new Node(val);
            node.next = head;
            head = node;
        }
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insertAtLast(int val){
        if(tail==null){
            insertAtFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert(int val,int index){
        if(index==0){
            insertAtFirst(val);
            return;
        }
        if(index==size){
            insertAtLast(val);
            return;
        }
        Node temp=head;
      for(int i=1;i<index;i++){
            temp=temp.next;
        }
      Node node=new Node(val);
      node.next=temp.next;
      temp.next=node;

    }
    public int deleteFirst(){
        int val=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node SecondLast=get(size-2);
        int val=tail.val;
        tail=SecondLast;
        tail.next=null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.val;
        prev.next=prev.next.next;
        size--;
        return val;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
}
