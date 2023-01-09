package test.day09_A_B_H.ogrenci;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    /*
     ============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 Q-ÇIKIŞ
		 ARAMA VE SİLME İŞLEMLERİ KİMLİK NO YA GÖRE YAPILMALIDIR.
     */
    static Scanner scan=new Scanner(System.in);

    int numara=1000;

    ArrayList<Ogrenci> ogrenciList=new ArrayList<>();
    void islemler(){
        System.out.print("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSECIMINIZ: ");

        try {
            int secim=scan.nextInt();
            switch (secim){
                case 1:{
                    ekleme();

                }
                case 2:{
                    System.out.println("Aramak istediginiz ogrencinin Kimlik No sunu giriniz");

                    arama(scan.next());
                }
                case 3:{
                    listeleme();

                }
                case 4:{
                    silme();
                }
                default:{
                    System.out.println("Hatali Deger Girdiniz!!!!");
                    islemler();
                }
            }

        }catch (InputMismatchException e){
            String islem=scan.next();

            if (islem.equalsIgnoreCase("q")){
                System.out.println("********Sistemden Cikiliyor********");
                System.exit(0);
            }else {
                System.out.println("HATALI GIRIS YAPILDI !!!");
                islemler();
            }

        }
    }

    private void silme() {
        System.out.println("Silinecek Ogrencinin Tc Nosunu Giriniz: ");
        String tcNo=scan.next();
        boolean kontrol=true;

        for (int i = 0; i < ogrenciList.size(); i++) {
            System.out.println(ogrenciList.get(i).getTcNo());

            if (ogrenciList.get(i).getTcNo().equals(tcNo)){

                ogrenciList.remove(i);
                kontrol=false;
                listeleme();
                islemler();
            }
        }
        if (kontrol){

                System.out.println("Bu TC no ya ait ogrenci yoktur !!!");
                islemler();
            }
        }



    private void listeleme() {
        for (Ogrenci each:ogrenciList){
            System.out.println(each);
            System.out.println("");
        }
        islemler();
    }

    private void arama(String arnOgrTcNo) {

       for (Ogrenci each:ogrenciList){
           if (each.getTcNo().equals(arnOgrTcNo)){
               System.out.println("Aranan Ogrenci = "+ each);
               islemler();
           }else {
               System.out.println(arnOgrTcNo+"Bu Tc no ya ait ogrenci yoktur. ");
               islemler();
           }
       }
    }

    private void ekleme() {
        scan.nextLine();
        System.out.println("Ogrenci Adi: ");
        String ad=scan.nextLine();
        System.out.println("Ogrenci Soyismi: ");
        String sAd=scan.nextLine();
        System.out.println("Ogrenci Kimlik No: ");
        String tcNo=tcNoKontrol(scan.nextLine());
        System.out.println("Ogrenci Yasi: ");
        int yas=scan.nextInt();
        System.out.println("Ogrenci Sinifi: ");
        String sinif=scan.next();


        Ogrenci ogrenci=new Ogrenci(ad,sAd,tcNo,yas,++numara,sinif);
        ogrenciList.add(ogrenci);
        listeleme();
        islemler();
    }

    private String tcNoKontrol(String tcNo) {
        String tcNoArr []= tcNo.split("");
        boolean kontrol=true;

        for (String each:tcNoArr){
            if (!Character.isDigit(each.charAt(0))){

                kontrol=false;

            }
        }
        if (!kontrol){
            System.out.println("Girilen Tc No hatali !!!");
            tcNoKontrol(scan.next());
            //menu();
        }

        return tcNo;
    }


}
