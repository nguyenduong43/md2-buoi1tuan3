package MyLinkedList;

public class MyLinkedListQueue {
    class Node {
        public Object key;
        public Node next;
        public Node(Object key) {
            this.key = key;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }
    public void them(Object key)
    {
        Node temp=new Node(key);
        if(head==null) this.head=this.tail=temp;
        else{
        this.tail.next=temp;
        this.tail=temp;}
    }
    public Node xoa(){
        Node temp=this.head;
        this.head=this.head.next;
        return temp;
    }
}
