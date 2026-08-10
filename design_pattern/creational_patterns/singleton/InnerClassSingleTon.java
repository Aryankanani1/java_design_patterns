package design_pattern.creational_patterns.singleton;

public class InnerClassSingleTon {
private InnerClassSingleTon (){
}
        // inner class
    private static class SingleTonHelper{
        private static final InnerClassSingleTon singleTon = new InnerClassSingleTon();

        public static InnerClassSingleTon  getInstance(){
          return  SingleTonHelper.singleTon;
        }
    }

}
