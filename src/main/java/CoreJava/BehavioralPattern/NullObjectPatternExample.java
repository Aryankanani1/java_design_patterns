package CoreJava.BehavioralPattern;

// Abstract Customer
abstract class AbstractCustomer {
    protected String name;

    public abstract String getName();
    public abstract boolean isNil();
}

// Real Customer
class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isNil() {
        return false;
    }
}

// Null Customer
class NullCustomer extends AbstractCustomer {
    public String getName() {
        return "Not Available in Customer Database";
    }

    public boolean isNil() {
        return true;
    }
}

// Customer Factory
class CustomerFactory {
    public static final String[] names = {"John", "Jane", "Jack"};

    public static AbstractCustomer getCustomer(String name) {
        for (String n : names) {
            if (n.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}

// Client
public class NullObjectPatternExample {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("John");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Jane");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Jack");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Julie");

        System.out.println("Customers:"); // Output: Customers:
        System.out.println(customer1.getName()); // Output: John
        System.out.println(customer2.getName()); // Output: Jane
        System.out.println(customer3.getName()); // Output: Jack
        System.out.println(customer4.getName()); // Output: Not Available in Customer Database
    }
}