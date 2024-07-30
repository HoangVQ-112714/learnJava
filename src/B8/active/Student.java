package B8.active;

public class Student extends Person {
    private int mark;
    private String grade;

    @Override
    public String toString() {
        return "Student{" +
                "grade='" + grade + '\'' +
                ", mark=" + mark +
                ", age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int age, int id, String name, int mark) {
        super(age, id, name);
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade() {
        if(this.mark >= 8) {
            this.grade = "A";
        } else {
            this.grade = "B";
        }
    }
}
