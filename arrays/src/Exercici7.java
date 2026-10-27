import java.util.Scanner;

class Main7 {
    public static void main(String[] args){
        Scanner llegir = new Scanner(System.in);
        int mida = 8;
        int[] nombres = new int[mida];
        int aparicions = 0;
        System.out.println("introdueix 8 nombres:");
        for (int i=0;i<mida;i++){
            System.out.println("posicio: "+i);
            nombres[i] = llegir.nextInt();
        }
        System.out.printf("introdueix el valor que vols comptar:");
        int valor = llegir.nextInt();

        for (int i=0;i<mida;i++){
            if (nombres[i] == valor){
                aparicions++;
            }
        }

        if (aparicions>0){
            System.out.println("nombre total d'aparicions: "+aparicions);
        } else {
            System.out.printf("cap coincidencia");
        }
        llegir.close();
    }
}