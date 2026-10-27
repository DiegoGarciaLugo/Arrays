import java.util.Scanner;

class Main6 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        System.out.println("introdueix 7 nombres");
        int[] dades = new int[7];
        for (int i = 0; i < 7; i++) {
            dades[i] = llegir.nextInt();
        }
        System.out.printf("Introdueix la teva adivinança");
        int enter = llegir.nextInt();
        int posicio = -1;
        for (int i=0; i<7; i++){
            if (dades [i] == enter){
                posicio = i;
                break;
            }
        }
        if (posicio != -1){
            System.out.println("Resultat: index "+ posicio);
        } else {
            System.out.println("No trobat");
        }
        llegir.close();
    }
}
