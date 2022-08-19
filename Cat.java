package homework.lesson1;

public class Cat extends Animal {

    public Cat(String name, int ran, int swamBy) {
        super(name, ran, swamBy);
    }

    @Override
    public void running() {
        if (ran <= 200) {
            System.out.println(name + " пробежал " + ran + " метров!");
        } else {
            System.out.println(name + " не может бегать больше 200 метров!");
        }
    }

    @Override
    public void swimming() {
        if (swamBy >= 0) {
            System.out.println(name + " не умеет плавать, он же кот!");
        }
    }
}
