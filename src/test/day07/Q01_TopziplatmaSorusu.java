package test.day07;

import java.util.Scanner;

public class Q01_TopziplatmaSorusu {
    /*
    //Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do
    // while code blogu create ediniz.

     */
    public static void main(String[] args) {

        double topYukseklik=2.00;

        double toplamYol=0;
        int vurmaSaysi=0;

        do {
            toplamYol+=topYukseklik;
            vurmaSaysi++;
            topYukseklik=topYukseklik*3/4;
            toplamYol+=topYukseklik;



        }while (topYukseklik>=1.00);

        System.out.println(" Girilen yukseklikten birakilan top " +toplamYol+" m kadar yol katetmis olup ,"+" topumuz bu esnada  "+ vurmaSaysi +" kere yere vurmustur.");
    }
}
