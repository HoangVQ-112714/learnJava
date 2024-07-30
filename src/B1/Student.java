package B1;

public abstract class Student {
    protected int id;
    protected String name;
    protected int price;
    protected double tax;

    abstract void tinhDiem();

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }

    public Student(int id, String name, int price, double tax) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double chiPhi(int price, double tax) {
        return price * tax;
    }

    public void info() {
        System.out.println("stu info");
    }
}
