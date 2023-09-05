package ro.fasttrackit.Exercise3;

public class Dog implements Behaviour{
    public String walk() {
        return "Dog running";
    }

    @Override
    public String talk() {
        return "Dog barking";
    }

    @Override
    public String eat() {
        return "Dog eating";
    }
}
