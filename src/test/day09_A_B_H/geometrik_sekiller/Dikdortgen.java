package test.day09_A_B_H.geometrik_sekiller;

import java.util.Scanner;

public class Dikdortgen implements IIslemler{
    Scanner scan=new Scanner(System.in);
    int kenar1=0;
    int kenar2=0;
    @Override
    public void alan() {
        System.out.println("1. Kenar uzunlugunu giriniz.");
        kenar1=scan.nextInt();
        System.out.println("2. Kenar uzunlugunu giriniz.");
        kenar2=scan.nextInt();
        System.out.println("Alan: "+(kenar1*kenar2));


    }

    @Override
    public void cevre() {
        System.out.println("Cevre: "+ (2*(kenar1+kenar2)));

    }
}
