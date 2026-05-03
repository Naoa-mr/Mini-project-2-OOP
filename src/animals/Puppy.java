package animals;

public class Puppy extends Dog {

    public Puppy(String name) {
        super(name);
    }

    public void weep() {
        System.out.println(name + " is weeping");
    }
}