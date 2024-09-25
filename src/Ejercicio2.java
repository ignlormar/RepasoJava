public class Ejercicio2 {
    public static void main(String[] args) {
        int[][] num = {
                {0, 30, 2, 0, 0, 5},
                {75, 0, 0, 0, 0, 0},
                {0, 0, -2, 9, 0, 11}
        };
        for (int[] col : num) {
            for (int fila : col) {
                System.out.print(fila + "\t|\t");
            }
            System.out.println();
        }
    }
}
