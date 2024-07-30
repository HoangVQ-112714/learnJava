package B7;

public class SinhVienCoKhi extends SinhVien {
    private int scoreCNC;
    private int scorePLC;

    public SinhVienCoKhi(String name, int scoreCNC, int scorePLC) {
        super(name);
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
    }

    public int getScoreCNC() {
        return scoreCNC;
    }

    public void setScoreCNC(int scoreCNC) {
        this.scoreCNC = scoreCNC;
    }

    public int getScorePLC() {
        return scorePLC;
    }

    public void setScorePLC(int scorePLC) {
        this.scorePLC = scorePLC;
    }

    @Override
    double tinhDiem() {
        return (double) (this.scoreCNC + this.scorePLC) / 3;
    }
}
