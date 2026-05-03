package animals;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says Woof");
    }

    public void showSuperName() {
        System.out.println("Using super: " + super.name);
    }

    public static void info() {
        System.out.println("This is Dog class");
    }
}