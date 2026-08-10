package design_pattern.creational_patterns.singleton;

public class  LazySingleTon{
    private static volatile LazySingleTon lazySingleTon;

    private LazySingleTon(){}

    public static LazySingleTon getInstance(){
        if(lazySingleTon == null){
            synchronized(LazySingleTon.class){
                lazySingleTon = new LazySingleTon();
            }
        }
        return lazySingleTon;
    }

    public static void main(String[] args) {
        LazySingleTon singleTon = LazySingleTon.getInstance();
        LazySingleTon singleTon1 = LazySingleTon.getInstance();

        if(singleTon == singleTon1){
            System.out.println(singleTon == singleTon1);
        }

    }
}
