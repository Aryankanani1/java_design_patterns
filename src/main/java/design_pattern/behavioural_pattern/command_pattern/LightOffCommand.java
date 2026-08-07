package design_pattern.behavioural_pattern.command_pattern;
// concret command
public class LightOffCommand implements Action{
    private final Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
