import java.util.Scanner;

class Main5 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        System.out.println("introdueix 7 nombres");
        int[] dades = new int[7];
        for (int i = 0; i < 7; i++) {
            dades[i] = llegir.nextInt();
        }
        int maxim = dades[0];
        int minim = dades[0];

        for (int valor : dades) {
            if (valor > maxim) {
                maxim = valor;
            }
            if (valor < minim) {
                minim = valor;
            }
        }
        System.out.println("Valors introduits: ");
        for (int i = 0; i < dades.length; i++){
            System.out.println("["+(i+1)+"]"+dades[i]);
        }
        System.out.println("El valor maxim es: "+ maxim);
        System.out.println("El valor minim es: "+ minim);
        llegir.close();
    }
}