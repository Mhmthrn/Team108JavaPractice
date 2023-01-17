package test.day10_A_B_H;

import test.day09_A_B_H.ogrenci.Ogrenci;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OgrenciIslemler implements IIslemler {
    static Scanner scan=new Scanner(System.in);
    static int numara = 1000;
    static ArrayList<Ogrenci> ogrenciList = new ArrayList<>();

    void ogrenciMenu(){
        System.out.println("============= İŞLEMLER =============\n" +
                " \t\t  1-EKLEME\n" +
                " \t\t  2-ARAMA\n" +
                " \t\t  3-LİSTELEME\n" +
                " \t\t  4-SİLME\n" +
                " \t\t  Q-ÇIKIŞ\n" +
                "\n" +
                " \t  SEÇİMİNİZ:");
        int secim=0;
        try {
             secim=scan.nextInt();

            switch (secim){
                case 1:{
                    ekleme();
                }
                case 2:{
                    arama();
                }
                case 3:{
                    listeleme();
                }
                case 4:{
                    silme();
                }

            }
        } catch (InputMismatchException e) {
            String secimm=scan.next();
            if (secimm.equalsIgnoreCase("Q")){
                System.out.println("SISTEMDEN CIKILIYOR");
                System.exit(0);

            }else {
                System.out.println("HATALI GIRIS YAPILDI");
                ogrenciMenu();
            }
        }
    }
    @Override
    public void ekleme() {
        System.out.print("OGRENCININ ADINI GİRİNİZ: ");
        scan.nextLine();
        String ad = scan.nextLine();
        System.out.print("OGRENCININ SOYADINI GİRİNİZ: ");
        String sAd = scan.nextLine();
        System.out.print("OGRENCININ TC NO SUNU GİRİNİZ: ");
        String tcNo = scan.next();
        System.out.print("OGRENCININ YAŞINI GİRİNİZ: ");
        int yas = scan.nextInt();
        scan.nextLine();

        System.out.print("OGRENCININ SINIFINI GİRİNİZ: ");
        String sinif = scan.next();

        Ogrenci ogrenci = new Ogrenci(ad, sAd, tcNo, yas, numara++,sinif);
        ogrenciList.add(ogrenci);
        ogrenciMenu();

    }

    @Override
    public void arama() {
        System.out.println("ARANACAK KISININ TC NO SUNU GIRINIZ");
        String tcNo=scan.next();
        int kontrol=0;
        for (Ogrenci each: ogrenciList){
            if (each.getTcNo().equals(tcNo)){
                System.out.println(each);
                kontrol=1;
            }
        }
        if (kontrol==0){
            System.out.println(tcNo+" NUMARALI KISI BULUNMAMAKTADIR.");
        }
        ogrenciMenu();

    }

    @Override
    public void listeleme() {
        for (Ogrenci each:ogrenciList){
            System.out.println(each);
        }
        ogrenciMenu();

    }

    @Override
    public void silme() {
        System.out.println("SILINECEK KAYIDIN TC NOSUNU GIRINIZ");
        String tcNo=scan.next();
        boolean kontrol=false;
        for (int i = 0; i < ogrenciList.size(); i++) {
            if (ogrenciList.get(i).getTcNo().equals(tcNo)){
                System.out.println("Silinen Kisi : "+ ogrenciList.get(i));
                ogrenciList.remove(i);
                kontrol=true;
            }

        }
        if (!kontrol){
            System.out.println(tcNo+" TC Nolu  KISI BULUNMAMAKTADIR.");
            ogrenciMenu();
        }

    }
}
