package CoreJava.Oops;

class Person {
    // Private data members
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public method to access private data
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {

        //Think of a capsule as a person.
        // The person's name and age are private information,
        // and they have methods to get or update this information safely.
        Person person = new Person("John", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setAge(35); // updating age
        System.out.println("Updated Age: " + person.getAge());
    }
}
