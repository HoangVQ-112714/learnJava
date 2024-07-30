package B1;

public class ItStu extends Student {
    private String language;

    public ItStu(String language, int id, String name, int price, double tax) {
        super(id, name, price, tax);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void getMoney() {
        System.out.println("IT pro");
        super.info();
//        this.info();
    }

    public void info() {
        System.out.println("IT pro2111");
    }

    @Override
    void tinhDiem() {

    }
}
