package homework.lesson1;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    public void run(int ran) {
        if (ran <= 500) {
            System.out.println(name + " пробежал: " + ran + " метров");
        } else {
            System.out.println(name + " не может бегать больше 200 метров");
        }
    }
    public void swamBy(int swamBy) {
        if (swamBy <= 10) {
            System.out.println("Собака по кличке: " + name + " проплыл: " + swamBy + " метров");
        } else {
            System.out.println("Собака по кличке: " + name + " не может проплыть больше 10 метров");
        }
    }
}
