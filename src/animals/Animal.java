package animals;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Animal makes a sound");
    }

    public final void eat() {
        System.out.println(name + " is eating");
    }

    public static void info() {
        System.out.println("This is Animal class");
    }
}