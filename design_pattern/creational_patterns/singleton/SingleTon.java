package design_pattern.creational_patterns.singleton;

public class SingleTon {

    // prevent visibility problem
    private static volatile SingleTon INSTANCE;

private SingleTon(){
    if(INSTANCE != null){
        throw new RuntimeException("Use getInstance() method to initiate the object");
    }
    System.out.println("singleton instance is created");
}

public static SingleTon getInstance(){
    if(INSTANCE == null){
        synchronized (SingleTon.class){
            if(INSTANCE == null){
                 INSTANCE = new SingleTon();
            }
        }
    }
    System.out.println("Fetching instance");
        return INSTANCE;
}
@Override
public Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException("singleton can't be cloned");
}
    // Method to maintain singleton property during deserialization
    protected Object readResolve() {
        return getInstance();
    }

    public static void main(String[] args) {

        SingleTon singleTon1 = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();

        System.out.println(singleTon1 == singleTon2);
    }
}

