package homework.lesson1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bars");
        cat1.run(200);
        cat1.swamBy(0);

        System.out.println();

        Dog dog1 = new Dog("Alpha");
        dog1.run(500);
        dog1.swamBy(10);

        
//        Animal[] animals = {new Cat("AkBars"), new Dog("AkTush")};
//        for (Animal o : animals) {
//        }
    }
}
