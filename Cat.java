package homework.lesson1;

public class Cat extends Animal{
    public Cat(String name) {
    this.name = name;
    }

    public void run(int ran) {
        if (ran <= 200) {
            System.out.println("Кот по кличке: " + name + " пробежал: " + ran + " метров");
        } else {
            System.out.println("Кот по кличке: " + name + " не может бегать больше 200 метров");
        }
    }
    public void swamBy(int swamBy) {
        System.out.println("Кот - не умеет плавать");
    }
}

/*
    public void run(int ran) {
        if (ran <= 200) {
            System.out.println(name + " пробежал: " + ran + " метров");
        } else {
            System.out.println(name + " не может бегать больше 200 метров");
        }
    }
    */
