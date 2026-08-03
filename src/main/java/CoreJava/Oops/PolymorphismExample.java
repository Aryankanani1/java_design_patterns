package CoreJava.Oops;

//Runtime Polymorphism
class Car {
    void sound() {
        System.out.println("Car makes a sound");
    }
}

class Maruti extends Car {
    @Override
    void sound() {
        System.out.println("Maruti makes sound");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Car car = new Maruti();  // Upcasting
        car.sound();             // Calls Dog's overridden method
    }
}
