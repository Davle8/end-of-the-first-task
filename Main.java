package homework.lesson1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Bars", 200, 0), new Dog("Alpha", 500, 10)};
        for ( Animal o : animals ) {
            o.running();
            o.swimming();
        }
    }
}