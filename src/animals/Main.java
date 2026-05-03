package animals;

public class Main {
    public static void main(String[] args) {

        Animal a = new Animal("Generic Animal");
        Dog d = new Dog("Buddy");
        Puppy p = new Puppy("Max");
        Cat c = new Cat("Kitty");

        a.speak();
        d.speak();
        c.speak();

        p.weep();

        d.showSuperName();

        a.eat();

        Animal.info();
        Dog.info();
    }
}