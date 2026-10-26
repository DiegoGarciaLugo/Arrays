import java.util.Scanner;

class Main3 {

    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        int[] dades = new int[5];
        double suma = 0.0;
        for (int i = 0; i < 5; i++) {
            dades[i] = llegir.nextInt();

        }
        for (int i = 0; i < dades.length; i++){
            suma += dades[i];
        }
        double media = suma / dades.length;
        System.out.println(" La mitjana aritmetica es: " + media);
    }
}