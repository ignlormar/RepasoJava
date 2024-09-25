import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> lenguajes = new ArrayList<>();
        lenguajes.add("php");
        lenguajes.add("java");
        lenguajes.add("c");
        lenguajes.add("c++");
        lenguajes.add("c#");
        lenguajes.add("javascript");
        lenguajes.add("python");
        lenguajes.add("pascal");
        lenguajes.add("SQL");
        lenguajes.add("Ruby");

        Collections.sort(lenguajes);

        System.out.println(lenguajes);
    }
}
