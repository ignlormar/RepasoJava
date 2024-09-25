import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;

        while (seguir){
            System.out.print("Introduce un numero entero: ");
            try {
                int numero = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Debes introducir numeros enteros.");
            }
        }
    }
}
