package daonguoc;
import java.util.Scanner;
public class TestDaoNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang n=");
        int n = sc.nextInt();
        int a[]=new int[n];
        DaoNguoc dn = new DaoNguoc();
        for (int i=0;i<n;i++) {a[i]=sc.nextInt();dn.push(a[i]);}
        while (dn.isEmpty())
        {
            System.out.println(dn.pop()+" ");
        }

       // dn.x();
    }
}
