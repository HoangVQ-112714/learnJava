package B9;

public class SinhVien {
    protected String ma;
    protected String ten;
    protected double diem;
    protected int age;

    SinhVien(String ma, String ten, double diem, int age) {
        this.ma = ma;
        this.ten = ten;
        this.diem = diem;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "age=" + age +
                ", ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", diem=" + diem +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
