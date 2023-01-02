package test.day08A_B_H;

import javax.print.attribute.standard.PageRanges;
import java.util.Scanner;

public class ATM {
    /*
    ATM
        Kullanicidan giriş için kart numarasi ve şifresini isteyin,
        eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

        Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme,
        sifre değiştirme ve cikis islemleri olacaktır.

        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
        eger değilse menü ekraninageri donsun.

        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
     */
    static Scanner scan = new Scanner(System.in);
    static String kartNo = "1234123412341234";
    static String sifre = "1234";

    static double bakiye = 50000;

    public static void main(String[] args) {
        giris();
    }

    private static void giris() {
        System.out.println("Kart numaranizi giriniz:");
        String kKartNo = scan.nextLine().replaceAll(" ", "");
        System.out.println("Sifre giriniz:");
        String kSifre = scan.next();

        if (kSifre.equalsIgnoreCase(sifre) && kKartNo.equalsIgnoreCase(kartNo)) {
            menu();

        } else {
            System.out.println("Kart No veya Sifre hatali !!!");
            scan.nextLine();// Dummy =====> ard arda kullanilan scanner objelerinde olusan hatayi onlemek icin kullanilir
            giris();
        }

    }

    private static void menu() {

        System.out.println("******WISE QERTER BANK*****\n" +
                "1.BAKIYE SORGULAMA\n" +
                "2.PARA YATIRMA\n" +
                "3.PARA CEKME\n" +
                "4.PARA GONDERME\n" +
                "5.SIFRE DEGISTIRME\n" +
                "6.CIKIS\n" +
                "SECIMINIZ :");
        int secim = scan.nextInt();
        switch (secim) {
            case 1: {
                bakiyeSorgula();

            }
            case 2: {
                System.out.println("YATIRMAK ISTEDIGINIZ TUTARI GIRINIZ");
                double miktar = scan.nextDouble();
                paraYatirma(miktar);
            }
            case 3: {
                paraCekme();
            }
            case 4: {
                paraGonderme();

            }
            case 5: {
                sifreDegistir();
            }
            case 6: {
                cikis();
            }
            default:{
                System.out.println("YANLIS DEGER GIRDINIZ !!!");
                menu();
            }

        }
    }

    private static void cikis() {
        System.out.println("*****GULE GULE*****");
        System.exit(0);

    }

    private static void sifreDegistir() {
        System.out.println("ESKI SIFREYI GIRINIZ :");
        String esifre=scan.next();
        if (esifre.equalsIgnoreCase(sifre)){
            System.out.println("YENI SIFRE GIRINIZ");
            sifre=scan.next();
            scan.nextLine();
            giris();

        }else{
            System.out.println("ESKI SIFREYI YANLIS GIRDINIZ");
            sifreDegistir();

        }
    }

    private static void paraGonderme() {
        scan.nextLine();
        System.out.println("IBAN NO GIRINIZ (IBAN NO TR ILE BASLAMALIDIR):");
        String iban = scan.nextLine().toUpperCase().replaceAll("\\s", "");

        if (iban.length() == 26 && iban.startsWith("TR")) {
            System.out.println("GONDERILECEK MIKTARI GIRINIZ: ");
            double miktar = scan.nextDouble();
            if (miktar<=bakiye){
                bakiye-=miktar;
                bakiyeSorgula();
            }else {
                System.out.println("GONDERMEK ISTEDIGINIZ MIKTAR BAKIYEDEN BUYUK !!!");
                paraGonderme();
            }

        }
    }

    private static void paraCekme() {
        System.out.print("CEKMEK  ISTEDIGINIZ TUTARI GIRINIZ");
        double miktar = scan.nextDouble();
        if (miktar <= bakiye) {
            bakiye -= miktar;
            bakiyeSorgula();
        } else {
            System.out.println("CEKMEK ISTEDIGINIZ MIKTAR BAKIYEDEN BUYUK !!!");
            paraCekme();
        }
    }





    private static void paraYatirma(double miktar) {
        bakiye+=miktar;
        bakiyeSorgula();

    }

    private static void bakiyeSorgula() {
        System.out.println("Bakiyeniz : "+ bakiye+" TL");
        menu();
    }

}
