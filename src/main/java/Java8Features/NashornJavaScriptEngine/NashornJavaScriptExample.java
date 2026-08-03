package Java8Features.NashornJavaScriptEngine;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornJavaScriptExample {
    public static void main(String[] args) {
        // Create a ScriptEngineManager and get the Nashorn script engine
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("nashorn");

        // Evaluate a simple JavaScript expression
        try {
            engine.eval("print('Hello from Nashorn!');");
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        // Define a JavaScript function and invoke it from Java
        String script = "function greet(name) { return 'Hello, ' + name; }";

        try {
            // Evaluate the script
            engine.eval(script);

            // Cast the engine to Invocable to invoke the function
            Invocable invocable = (Invocable) engine;

            // Invoke the JavaScript function with a parameter
            Object result = invocable.invokeFunction("greet", "world");
            System.out.println(result); // Output: Hello, world
        } catch (ScriptException | NoSuchMethodException e) {
            e.printStackTrace();
        }

        // Interacting between Java and JavaScript objects
        try {
            // Define a JavaScript object
            String jsObjectScript = "var obj = { " +
                    "name: 'John', " +
                    "age: 30, " +
                    "greet: function() { return 'Hello, ' + this.name; } " +
                    "};";

            // Evaluate the script to create the object
            engine.eval(jsObjectScript);

            // Retrieve the JavaScript object
            Object jsObject = engine.get("obj");

            // Use the JavaScript object in Java
            Invocable invocable = (Invocable) engine;
            Object greeting = invocable.invokeMethod(jsObject, "greet");
            System.out.println(greeting); // Output: Hello, John
        } catch (ScriptException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}