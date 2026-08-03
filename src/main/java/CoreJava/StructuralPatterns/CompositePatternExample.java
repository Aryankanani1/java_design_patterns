package CoreJava.StructuralPatterns;

// CompositePatternExample.java

import java.util.ArrayList;
import java.util.List;

// Component class
interface Employee {
    void showEmployeeDetails();
}

// Leaf class
class Developer implements Employee {
    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }
}

// Leaf class
class Manager implements Employee {
    private String name;
    private long empId;
    private String position;

    public Manager(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }
}

// Composite class
class CompanyDirectory implements Employee {
    private List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails() {
        for (Employee emp : employeeList) {
            emp.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }
}

// Main class to test the Composite pattern
public class CompositePatternExample {
    public static void main(String[] args) {
        Developer dev1 = new Developer(100, "John Doe", "Pro Developer");
        Developer dev2 = new Developer(101, "Jane Doe", "Entry Level Developer");

        CompanyDirectory engineeringDirectory = new CompanyDirectory();
        engineeringDirectory.addEmployee(dev1);
        engineeringDirectory.addEmployee(dev2);

        Manager man1 = new Manager(200, "Mike Smith", "SEO Manager");
        Manager man2 = new Manager(201, "Mary Williams", "CFO Manager");

        CompanyDirectory managementDirectory = new CompanyDirectory();
        managementDirectory.addEmployee(man1);
        managementDirectory.addEmployee(man2);

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(engineeringDirectory);
        companyDirectory.addEmployee(managementDirectory);

        companyDirectory.showEmployeeDetails();

        // Output
//        100 John Doe Pro Developer
//        101 Jane Doe Entry Level Developer
//        200 Mike Smith SEO Manager
//        201 Mary Williams CFO Manager
    }
}
