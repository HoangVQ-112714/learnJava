package B7;

class Animal {
    public void eat() {
        System.out.println("animal eat...");
    }
}

class Dog extends Animal {
//    @Override
//    public void eat() {
//        System.out.println("dog eat...");
//    }
}

class BabyDog1 extends Dog {
    @Override
    public void eat() {
        System.out.println("babydog eat...");
    }
}

class BabyCat1 extends Dog {
    @Override
    public void eat() {
        System.out.println("babycat eat...");
    }
}


public class Output {
    public static void main(String[] args) {
        System.out.println("halo");
        Animal a = new BabyDog1();
        a.eat();
        Animal b = new BabyCat1();
        b.eat();
    }
}