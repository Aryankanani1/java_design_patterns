package Generics;

// Demonstrates type inference with the diamond operator in Java

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceExample {
    public static void main(String[] args) {
        // Use the diamond operator to create a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Generics");
        stringList.add("Type Inference");

        // Print the elements of the list
        for (String s : stringList) {
            System.out.println(s);
        }
       // Output:
//        Java
//        Generics
//        Type Inference
    }
}