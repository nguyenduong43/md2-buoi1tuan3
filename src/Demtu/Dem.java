package Demtu;

public class Dem {
    public class Node {
        public Node next;
        public Object key;
        public int value = 0;

        public Node(Object key) {
            this.key = key;
            this.next = null;
        }
    }
        private Node head;
        private Node tail;
        public Dem(){
            this.head = null;
            this.tail = null;
        }
        public void add(Object key){
            Node temp =head ;
             head = new Node(key);
            head.next = temp;
        }

        public int map(Object key){
            Node temp=head;
            int a=0;
            while(temp!=null){
                if (temp.key.equals(key))   a++;
                temp=temp.next;
            }
//            if (temp.value==0) {
//                head = new Node(key);
//                head.next=temp;
//            }
//            else return
            return a;
        }
    }
