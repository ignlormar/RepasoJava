import java.util.ArrayList;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer>numeros = new ArrayList<>();
        Random tamano = new Random();
        int array = tamano.nextInt(11) + 10;
        Random randomInterno = new Random();
        int i = 0;
        while (i < array) {
            int numeroMas = randomInterno.nextInt(100) + 1;
            numeros.add(numeroMas);
            i++;
        }

        System.out.println(numeros);

        int suma = 0;
        double media = 0;
        int max = 0;
        int min = 101;
        for (int numero : numeros){
            suma += numero;
            media = (double) suma / array;
            if (numero > max){
                max = numero;
            }
            if (numero < min){
                min = numero;
            }
        }

        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + media);
        System.out.println("El maximo es: " + max);
        System.out.println("El minimo es: " + min);
    }
}
