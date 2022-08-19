package homework.lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Bars", 200, 0),
                new Cat("Kotyara", 300, 2),
                new Cat("Many", 150, 0),
                new Dog("Alpha", 500, 10),
                new Dog("Beta", 400, 11),
                new Dog("Gamma", 600, 8),
        };
//        for (Animal o : animals) {
//            o.running();
//        }
//        for (Animal o : animals) {
//            o.swimming();
//        }

//        Arrays.stream(animals).count();
        for (Animal o : animals) {
            String name = o.name;
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println(Arrays.stream(animals).count() + " животных приняли участие!");
    }
}