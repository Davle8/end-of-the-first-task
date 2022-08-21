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
    public abstract void swimming();
}
