package B8.active;

public class Person implements IPerson {

    protected int id;
    protected String name;
    protected int age;

    public Person(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public void input() {

    }

    @Override
    public void display() {

    }
}
