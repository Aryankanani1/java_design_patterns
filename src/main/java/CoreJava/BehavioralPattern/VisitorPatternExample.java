package CoreJava.BehavioralPattern;

// Element interface
interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}

// Concrete Elements
class Keyboard implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

class Monitor implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

class Mouse implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}

// Visitor interface
interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}

// Concrete Visitor
class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}

// Client
public class VisitorPatternExample {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
//         Output:
//         Displaying Mouse
//         Displaying Keyboard.
//         Displaying Monitor.
//         Displaying Computer.

    }
}