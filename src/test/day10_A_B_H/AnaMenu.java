package test.day10_A_B_H;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnaMenu {
    Scanner scan=new Scanner(System.in);
    void menu(){
        System.out.println("\t====================================\n" +
                           "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                           "\t====================================\n" +
                           "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                           "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                           "\t Q- ÇIKIŞ");

        try {
            int secim=scan.nextInt();
            switch (secim){
                case 1:{
                    OgrenciIslemler ogrenciMenu=new OgrenciIslemler();
                }
                case 2:{
                    OgretmenIsllemler ogretmenMenu=new OgretmenIsllemler();
                    ogretmenMenu.ogrtMenu();
                }

            }
        }catch (InputMismatchException e){
            String secim=scan.next();
            if (secim.equalsIgnoreCase("q")){
                System.out.println("SİSTEMDEN ÇIKIYOR");
                System.exit(0);
            }else {
                System.out.println("HATALI GİRİŞ YAPTINIZ");
                menu();
            }

        }

    }
}
