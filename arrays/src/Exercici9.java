import java.util.Scanner;

class Main9 {
    public static void main(String[] args){
        Scanner llegir = new Scanner(System.in);
        System.out.println("introdueix 5 nombres");
        int[] dades = new int[5];
        for (int i=0;i<5;i++){
            dades[i] = llegir.nextInt();
        }
        int[] copia = dades.clone();
        for (int i=0;i<copia.length;i++){
            copia[i]=copia[i]*2;
        }
        System.out.println("Aquesta es la array original: ");
        for (int i=0;i<copia.length;i++){
            System.out.println(dades[i] + " ");
        }
        System.out.println();
        System.out.printf("Aquesta es la array multiplicada per 2: ");
        for (int i=0;i<copia.length;i++){
            System.out.printf(copia[i] + " ");
        }
    }
}