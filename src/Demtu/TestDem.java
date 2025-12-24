package Demtu;

public class TestDem {
    public static void main(String[] args) {
        Dem dem = new Dem();
        String s="abcdaaba";
        for (int i=0;i<s.length();i++){
            dem.add(s.charAt(i));
        }
        System.out.println("so lan xuat hien cua key="+dem.map('b'));

    }
}
