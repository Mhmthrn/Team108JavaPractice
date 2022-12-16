package test.day02;

import java.util.Scanner;

public class Q2_SwitchCase_HesapMakinasi {
    /*
     * Kullanicidan iki tamsayi sayi ve islem cinsini alin
     * ve sayilari kullanicinin belirledigi isleme tabii tutup sonucu yazdirin.
     *
     * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
     *
     * Ornek : Inputs : sayilar : 18 , 10  islem : 3
     *         Output : 18 X 10 = 180
     *
     *
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen islem yapmak istediginiz iki sayiyi sirasiyla giriniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println("Lutfen yapmak istediginiz islemi seciniz\n" +
                "Toplama icin : +\n" +
                "Cikarma icin : -\n" +
                "Carpma icin  : *\n" +
                "Bolme icin   : /");

        String islem =scan.next();

        switch (islem){
            case "+" :
                System.out.println("Sayilarin Toplami :"+(sayi1 + sayi2));
                break;
            case "-" :
                System.out.println("Sayilarin Farki :" +(sayi1-sayi2));
                break;
            case "*" :
                System.out.println("Sayilarin Carpimi :"+(sayi1*sayi2));
                break;
            case "/" :
                if (sayi2==0) System.out.println("Sayinin 0 a bolumu Tanimsizdir");
                System.out.println("Sayilarin Bolumu :"+ (sayi1/sayi2));
                break;
            default:
                System.out.println("Hatali islem secimi ");
        }
    }

}
