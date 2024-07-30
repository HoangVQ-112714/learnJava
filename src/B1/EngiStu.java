package B1;

public class EngiStu extends Student{
    private String skill;

    public EngiStu(int id, String name, int price, double tax, String skill) {
        super(id, name, price, tax);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    void tinhDiem() {

    }
}
