package design_pattern.creational_patterns.singleton;

enum Singleton {

    INSTANCE;

    public void showMessage(){
        System.out.println("hello from singleton!");
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        singleton1.showMessage();
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1==singleton2);

    }
}
