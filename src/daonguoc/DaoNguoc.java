package daonguoc;
import java.util.LinkedList;
import java.util.Stack;
public class DaoNguoc<T> {
     private LinkedList<T> stack;
     public void push(T data){
         stack.addFirst(data);
    }
    public T pop(){
         return stack.removeFirst();
    }
    public boolean isEmpty(){
         if (stack.size()==0) return false;else return true;
    }
     public DaoNguoc() {stack = new LinkedList<>();}
    public void x() {
         DaoNguoc<Integer> stack=new DaoNguoc();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        while(stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

}
