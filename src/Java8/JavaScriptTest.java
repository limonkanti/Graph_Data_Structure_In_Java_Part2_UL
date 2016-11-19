package Java8;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class JavaScriptTest {

    public static void main(String args[]) {
        LocalDate ld=LocalDate.now();
        LocalTime time=LocalTime.now();
        System.out.println(ld);
        System.out.println(time);
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine nashorn = sem.getEngineByName("nashorn");
        String name = "I am learning java 8 javaScript........";
        try {
            nashorn.eval("print('" + name + "')");
           
        } catch (Exception e) {
            System.out.println("Error is:\t" + e.getMessage());
        }
    }
}
