package B7;

public abstract class SinhVien {
    protected String name;

    SinhVien(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract double tinhDiem();
}
