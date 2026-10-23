import java.util.Scanner;
class Main1 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        int[] dades = new int[5];

        for (int i = 0; i < 5; i++) {
            dades[i] = llegir.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(i + ": " + dades[i]);

            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("."); // Punto final

        // 3. Mostrar el resumen de los datos (¡Corregido!)
        System.out.println("longitud: " + dades.length);
        System.out.println("primer valor: " + dades[0]);
        System.out.println("ultim valor: " + dades[4]);
    }
}
