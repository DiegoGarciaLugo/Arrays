import java.util.Scanner;

class Main8 {
    public static void main(String[] args){
        Scanner llegir = new Scanner(System.in);
        System.out.println("introdueix 5 nombres");
        int[] dades = new int[5];
        for (int i=0;i<5;i++) {
            dades[i] = llegir.nextInt();
        }
        System.out.println("introdueix un index");
        int index = llegir.nextInt();
        while (index <0 || index >= dades.length){
            if (index<0){
                System.out.println("index no valid, torna a intentar");
            } else if (index >=dades.length){
                System.out.println("index no valid, torna a intentar");
            }
            index = llegir.nextInt();
        }
        int nouvalor = llegir.nextInt();
        dades[index] = nouvalor;
        for (int i=0;i<5;i++){
            System.out.printf(dades[i] + " ");
        }
        System.out.println();
    }
}
