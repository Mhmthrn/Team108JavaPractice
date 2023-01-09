package test.day09_A_B_H.geometrik_sekiller;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t 1-Kare\n" +
                "\t\t 2-Dikdortgen\n" +
                "\t\t 3-Daire\n" +

                "\n" +
                "\tSECIMINIZ: ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1: {
                Kare kare = new Kare();
                kare.alan();
                kare.cevre();

            }
            case 2: {
                Dikdortgen dikdortgen=new Dikdortgen();
                dikdortgen.alan();
                dikdortgen.cevre();
            }
            case 3: {
                Daire daire=new Daire();
                daire.alan();
                daire.cevre();
            }
        }
    }
}
