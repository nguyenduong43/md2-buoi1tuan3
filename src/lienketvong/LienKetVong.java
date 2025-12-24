package lienketvong;

public class LienKetVong {
    public class Node {
        public int data;
        private Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    private Node head;
    private Node tail;
    public LienKetVong() {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int data) {
        Node temp=head;
        this.head=new Node(data);
        this.head.next=temp;
    }
    public int dequeue() {
        Node temp=head;
        if(this.head!=null)
            this.head=this.head.next;
        else this.head=this.tail=null;
        return temp.data;
    }
}
