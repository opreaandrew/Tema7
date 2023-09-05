package ro.fasttrackit.Exercise3;

public class FarmMain {
    public static void main(String[] args){
        Behaviour cat = new Cat();
        Behaviour dog = new Dog();
        Behaviour mouse = new Mouse();
        Behaviour chicken = new Chicken();
        Behaviour duck = new Duck();

        System.out.println(cat.eat() + ", " + cat.talk() + ", " + cat.walk());
        System.out.println(dog.eat() + ", " + dog.talk() + ", " + dog.walk());
        System.out.println(mouse.eat() + ", " + mouse.talk() + ", " + mouse.walk());
        System.out.println(chicken.eat() + ", " + chicken.talk() + ", " + chicken.walk());
        System.out.println(duck.eat() + ", " + duck.talk() + ", " + duck.walk());
    }
}
