package MyLinkedList;

public class Test1 {
    public static void main(String[] args) {
       MyLinkedListQueue list = new MyLinkedListQueue();
       list.them(1);
       list.them(2);
       list.them(3);int i=3;
       while (i>0)
       {   System.out.printf(" %s", list.xoa().key);i--;}

    }
}
