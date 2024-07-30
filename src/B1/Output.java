package B1;

public class Output {
    public static void main(String[] args) {
        ItStu st1 = new ItStu("java", 123, "haha", 10, 0.1);
        System.out.println(st1.getLanguage());

        EngiStu st2 = new EngiStu(1233, "huhu", 123, 0.1, "machine");
        System.out.println(st2.id);
    }
}
