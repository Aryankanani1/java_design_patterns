package reflextion;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
//    }
//    public void meow(){
//        System.out.println("meowwww");
//    }
    private void meow(){
        System.out.println("meowww but i am private how dare your are eto call this method");
    }

    public static void main(String[] args) throws Exception {

        Cat myCat = new Cat("goomy", 4);
        // for the field
        Field[] catField = myCat.getClass().getDeclaredFields();
        for(Field field : catField){
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(myCat,"aryan");
            }
            System.out.println(myCat.getName());
        }

        Method [] methodField = myCat.getClass().getDeclaredMethods();
        for(Method method : methodField){
            if(method.getName().equals("meow")){
                method.setAccessible(true);
                method.invoke(myCat);
            }
            }
        }
    }

