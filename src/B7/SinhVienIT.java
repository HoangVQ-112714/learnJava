package B7;

public class SinhVienIT extends SinhVien {
    private int scorceJava;
    private int scorceHTML;

    public SinhVienIT(String name, int scorceHTML, int scorceJava) {
        super(name);
        this.scorceHTML = scorceHTML;
        this.scorceJava = scorceJava;
    }

    public int getScorceHTML() {
        return scorceHTML;
    }

    public void setScorceHTML(int scorceHTML) {
        this.scorceHTML = scorceHTML;
    }

    public int getScorceJava() {
        return scorceJava;
    }

    public void setScorceJava(int scorceJava) {
        this.scorceJava = scorceJava;
    }

    @Override
    double tinhDiem() {
        return (double) (this.scorceHTML + this.scorceJava) /2;
    }
}
