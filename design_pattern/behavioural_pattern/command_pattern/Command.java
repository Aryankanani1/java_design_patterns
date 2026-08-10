package design_pattern.behavioural_pattern.command_pattern;
// client
public class Command {
    public static void main(String[] args) {

        Light light = new Light();
        Action lightOnCommand = new LightOnCommand(light);
        Action lightOffCommand = new LightOffCommand(light);
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setAction(lightOnCommand);
        remoteControl.pressOn();

        remoteControl.setAction(lightOffCommand);
        remoteControl.pressOff();
    }
}
