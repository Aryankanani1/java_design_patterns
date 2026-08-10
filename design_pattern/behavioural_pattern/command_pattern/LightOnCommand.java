package design_pattern.behavioural_pattern.command_pattern;
// concret command
public class LightOnCommand implements Action{
    private final Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
        @Override
        public void execute() {
            light.turnOn();
        }

}

