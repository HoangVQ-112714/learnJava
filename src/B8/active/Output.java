package B8.active;

public class Output {
    public static void main(String[] args) {
        Student st1 = new Student(9, 1, "sth1", 9);
        System.out.println(st1);
        st1.setGrade();
        System.out.println(st1);

        Person p1 = new Person(9, 1, "kaka");
        System.out.println(p1);
    }
}
