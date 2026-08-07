package design_pattern.behavioural_pattern.command_pattern;
// Invoker
public class RemoteControl {

    private Action action;

        public void setAction(Action action){
            this.action = action;
        }

    public void pressOn(){
        action.execute();
    }

    public void pressOff(){
            action.execute();
    }
}
