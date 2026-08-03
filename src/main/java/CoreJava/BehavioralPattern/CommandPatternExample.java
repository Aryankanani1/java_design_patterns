package CoreJava.BehavioralPattern;

// Command interface
interface Command {
    void execute();
}

// Receiver
class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

// Concrete Command for turning on the light
class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

// Concrete Command for turning off the light
class TurnOffLightCommand implements Command {
    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

// Invoker
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

// Client
public class CommandPatternExample {
    public static void main(String[] args) {
        // Receiver
        Light light = new Light();

        // Commands
        Command turnOn = new TurnOnLightCommand(light);
        Command turnOff = new TurnOffLightCommand(light);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Execute command to turn on the light
        remote.setCommand(turnOn);
        remote.pressButton(); // Output: Light is ON

        // Execute command to turn off the light
        remote.setCommand(turnOff);
        remote.pressButton(); // Output: Light is OFF
    }
}
