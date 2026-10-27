import java.util.Scanner;

class Main10 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] resultat = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = llegir.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            b[i] = llegir.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            resultat[i] = a[i] + b[i];
        }
        System.out.print("a: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("].");
        System.out.print("b: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(b[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("].");
        System.out.print("resultat: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(resultat[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("].");
        llegir.close();
    }
}