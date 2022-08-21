package homework.lesson1;

public class Dog extends Animal{
    public Dog(String name, int ran, int swamBy) {
        super(name, ran, swamBy);
    }
    @Override
    public void running() {
        if (ran <= 500) {
            System.out.println(name + " пробежал " + ran + " метров!");
        } else {
            System.out.println(name + " не может бегать больше 500 метров!");
        }
    }
    @Override
    public void swimming() {
        if (swamBy <= 10) {
            System.out.println(name + " проплыл " + swamBy + " метров!");
        } else {
            System.out.println(name + " не может плавать больше 10 метров!");
        }
    }
}
