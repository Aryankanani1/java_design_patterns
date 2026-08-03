package CoreJava.Oops;

//Think of an animal family.
// Dogs and cats both inherit general
// animal characteristics but also
// have their own unique behaviors.
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // inherited method
        dog.bark(); // specific to Dog class
    }
}
