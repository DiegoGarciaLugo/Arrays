import java.util.Scanner;

class Main4 {

    public static void main(String[] args){
        Scanner llegir = new Scanner (System.in);
        int[] dades = new int[8];
        int positius = 0;
        int negatius = 0;
        int zeros = 0;
        for (int i = 0; i< 8; i++){
            dades[i] = llegir.nextInt();
        }
        for (int i = 0; i < dades.length; i++){
            if (dades[i] > 0){
                positius++;
            } else if (dades[i] < 0){
                negatius++;
            }else {
                zeros++;
            }
        }
        System.out.println("Valors introduits: ");
        for (int i = 0; i < dades.length; i++) {
            System.out.println("[" + (i + 1) + "]" + dades[i]);
        }
        System.out.println("Positius: " + positius);
        System.out.println("Negatius: " + negatius);
        System.out.println("Zeros: " + zeros);
    }
}
