package design_pattern.creational_patterns.singleton;

public class EgarSingleTon {

    // Egar initialization
        private static final EgarSingleTon INSTANCE = new EgarSingleTon();

        private EgarSingleTon(){

        }

        public static EgarSingleTon getInstance(){
        return INSTANCE;
        }
}

