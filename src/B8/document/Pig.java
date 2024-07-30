package B8.document;

public class Pig implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Pig sound...");
    }

    @Override
    public void run() {
        System.out.println("Pig run...");
    }
}
