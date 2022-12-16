package test.day03;

import java.util.Scanner;

public class Q1_DikUcgen {
    /*
   Kullanicidan uc adet sayi alarak bu sayilarin
   bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
   NOT:
   Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
   denkleminden yararlanabilirsiniz.
   -----Ornek Ekran Ciktisi-----
   ilk kenari giriniz: 2
   ikinci kenari giriniz 15
   üçüncü kenari giriniz: 7
   Bu bir dik ucgen degildir.
   Bu bir dik ucgendir.
*/
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Dik ucgen olup olmadgini anlamak icin  3 kenar olculerini sirasiyla giriniz");
        System.out.println("Birinci kenar uzunlugunu giriniz");
        double k1=scan.nextDouble();
        System.out.println("Ikinci kenar uzunlugunu giriniz");
        double k2=scan.nextDouble();
        System.out.println("Ucuncu kenar uzunlugunu giriniz");
        double k3=scan.nextDouble();

        double k1K= Math.pow(k1,2);
        double k2K= Math.pow(k2,2);
        double k3K= Math.pow(k3,2);


       if ((k1K+k2K==k3K) || (k3K+k1K==k2K) || (k2K+k3K==k1K)){
            System.out.println("Dik ucgendir");
        }else {
            System.out.println("Dik ucgen degildir");
        }




    }
}
