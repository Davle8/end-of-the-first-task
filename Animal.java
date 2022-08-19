package homework.lesson1;

public abstract class Animal {
    public String name;
    public int ran;
    public int swamBy;


    public Animal(String name, int ran, int swamBy) {
        this.name = name;
        this.ran = ran;
        this.swamBy = swamBy;
    }


    public abstract void running();
    public void running(int ran) {
        System.out.println(name + " пробежал " + ran + " метров!");
    }


    public abstract void swimming();
    public void swimming(int swamBy) {
        System.out.println(name + " проплыл " + swamBy + " метров!");
    }
}
