import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> clase = new ArrayList<>();
        clase.add("Alejandro");
        clase.add("Emilia");
        clase.add("Enrique");
        clase.add("Prudencio");
        clase.add("Nacho");

        for (String nombre : clase){
            System.out.println(nombre);
        }

    }
}
