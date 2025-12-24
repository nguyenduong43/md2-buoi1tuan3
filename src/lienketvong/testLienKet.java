package lienketvong;

public class testLienKet {
    public static void main(String[] args) {
        LienKetVong lk=new LienKetVong();
        lk.enqueue(9);
        lk.enqueue(8);
        lk.enqueue(7);
        lk.enqueue(6);int i=4;
        while (i>0) {
            System.out.print(lk.dequeue()+" ");
            i--;
        }
    }
}