package test.day07;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Q02_TasKagitMakas {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random rndSecim=new Random();
        int kSecim=0;
        int randomSecim=0;
        int kullaniciKazanmaSaysi=0;
        int randomKazanmaSaysi=0;

        do {
            System.out.println("Tas icin 1'i , Kagit icin 2'i ,  Makas icin 3'i  seciniz");
             kSecim=scan.nextInt();

            randomSecim=rndSecim.nextInt(3)+1;
            switch (randomSecim) {
                case 1 -> System.out.println("Bilgisayarin secimi ==> Tas");
                case 2 -> System.out.println("Bilgisayarin secimi ==> Kagit");
                case 3 -> System.out.println("Bilgisayarin secimi ==> Makas");
            }
            switch (kSecim) {
                case 1 -> System.out.println("Oyuncu secimi ==> Tas");
                case 2 -> System.out.println("Oyuncu secimi ==> Kagit");
                case 3 -> System.out.println("Oyuncu secimi ==> Makas");
            }

             if (kSecim==1 && randomSecim==2){
                 System.out.println("Kagit tasi sarar !!! -=- Bilgisayar +1");
                 randomKazanmaSaysi++;
                 System.out.println("Oyuncu = "+ kullaniciKazanmaSaysi+ " Bilgisayar = "+ randomKazanmaSaysi);
             }
             else  if (kSecim==1 && randomSecim==3){
                 System.out.println("Tas makasi kirar !!! -=- Oyuncu +1");
                 kullaniciKazanmaSaysi++;
                 System.out.println("Oyuncu = "+ kullaniciKazanmaSaysi+ " Bilgisayar = "+ randomKazanmaSaysi);
             }
             else if (kSecim==2 && randomSecim==1){
                 System.out.println("Kagit tasi sarar !!! -=- Oyuncu +1");
                 kullaniciKazanmaSaysi++;
                 System.out.println("Oyuncu = "+ kullaniciKazanmaSaysi+ " Bilgisayar = "+ randomKazanmaSaysi);
             }
             else if (kSecim==2 && randomSecim==3){
                 System.out.println("Makas kagidi keser !!! -=- Bilgisayar +1");
                 randomKazanmaSaysi++;
                 System.out.println("Oyuncu = "+ kullaniciKazanmaSaysi+ " Bilgisayar = "+ randomKazanmaSaysi);
             }
             else if (kSecim==3 && randomSecim==1){
                 System.out.println("Tas makasi kirar !!! -=- Oyuncu +1");
                 kullaniciKazanmaSaysi++;
                 System.out.println("Oyuncu = "+ kullaniciKazanmaSaysi+ " Bilgisayar = "+ randomKazanmaSaysi);
             }
             else if (kSecim==3 && randomSecim==2){
                 System.out.println("makas kagidi keser !!! -=- Oyyuncu +1");
                 kullaniciKazanmaSaysi++;
                 System.out.println("Oyuncu = "+ kullaniciKazanmaSaysi+ " Bilgisayar = "+ randomKazanmaSaysi);
             }
             else{
                 System.out.println("Berabere :)");

                 System.out.println("Oyuncu = "+ kullaniciKazanmaSaysi+ " Bilgisayar = "+ randomKazanmaSaysi);
             }

        }while (kullaniciKazanmaSaysi!=5 && randomKazanmaSaysi!=5);


        if (kullaniciKazanmaSaysi>randomKazanmaSaysi){
            System.out.println("Sen kazandin !!!!");
        }else {
            System.out.println("Malesef kaybettin:(");
        }

        }
    }

