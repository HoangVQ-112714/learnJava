package B7;

public class Output2 {
    public static void main(String[] args) {
        SinhVien st1 = new SinhVienIT("st1", 6,7);
        SinhVien st2 = new SinhVienCoKhi("st2", 2,10);
        System.out.println(st1.getName() + st1.tinhDiem());
        System.out.println("---------");
        System.out.println(st2.getName() + st2.tinhDiem());
    }
}
