package CoreJava.BehavioralPattern;

// State interface
interface State {
    void doAction(Context context);
}

// Concrete State 1
class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}

// Concrete State 2
class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}

// Context
class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}

// Client
public class StatePatternExample {
    public static void main(String[] args) {
        Context context = new Context();

        State startState = new StartState();
        startState.doAction(context); // Output: Player is in start state
        System.out.println(context.getState().toString()); // Output: Start state

        State stopState = new StopState();
        stopState.doAction(context); // Output: Player is in stop state
        System.out.println(context.getState().toString()); // Output: Stop State
    }
}
