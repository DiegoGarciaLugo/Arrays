import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        int[] dades = new int[6];
        for (int i = 0; i < 6; i++) {
            dades[i] = llegir.nextInt();
        }
        System.out.print("eecorregut invers: [");
        for (int i = 5; i >= 0; i--) {
            System.out.print(dades[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("].");
        System.out.print("recorregut original posterior: [");
        for (int i = 0; i < 6; i++) {
            System.out.print(dades[i]);
            if (i < 5) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
