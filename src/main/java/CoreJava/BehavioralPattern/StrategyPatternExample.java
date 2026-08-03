package CoreJava.BehavioralPattern;

// Strategy interface
interface Strategy {
    int doOperation(int num1, int num2);
}

// Concrete Strategy 1
class OperationAdd implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

// Concrete Strategy 2
class OperationSubtract implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

// Concrete Strategy 3
class OperationMultiply implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

// Context
class Context1 {
    private Strategy strategy;

    public Context1(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}

// Client
public class StrategyPatternExample {
    public static void main(String[] args) {
        Context1 context = new Context1(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5)); // Output: 10 + 5 = 15

        context = new Context1(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5)); // Output: 10 - 5 = 5

        context = new Context1(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5)); // Output: 10 * 5 = 50
    }
}
