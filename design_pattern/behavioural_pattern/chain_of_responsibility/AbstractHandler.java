package design_pattern.behavioural_pattern.chain_of_responsibility;

abstract class AbstractHandler implements Handler{
protected Handler handler;

public void setSuccessor(Handler handler){
    this.handler = handler;
}
}
