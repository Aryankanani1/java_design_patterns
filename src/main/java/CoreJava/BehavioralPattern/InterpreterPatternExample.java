package CoreJava.BehavioralPattern;

// Expression interface
interface Expression {
    boolean interpret(String context);
}

// Terminal Expression
class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}

// Or Expression
class OrExpression implements Expression {
    private Expression expr1;
    private Expression expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}

// And Expression
class AndExpression implements Expression {
    private Expression expr1;
    private Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}

// Client
public class InterpreterPatternExample {
    public static void main(String[] args) {
        // Create expressions
        Expression isMale = new TerminalExpression("John");
        Expression isMarried = new TerminalExpression("Married");

        // Or and And expressions
        Expression isMarriedMale = new AndExpression(isMale, isMarried);
        Expression isSingleMale = new OrExpression(isMale, new TerminalExpression("Single"));

        // Interpret contexts
        System.out.println("John is a married male? " + isMarriedMale.interpret("John Married")); // Output: John is a married male? true
        System.out.println("John is a single male? " + isSingleMale.interpret("John Single")); // Output: John is a single male? true
    }
}
