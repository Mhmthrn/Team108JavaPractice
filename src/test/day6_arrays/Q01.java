package test.day6_arrays;

import java.util.Scanner;

public class Q01 {

    //Kullanıcı tarafından girilen string ifadenin içindeki sayısal değerleri toplayan metodu yazınız

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cümle giriniz: ");
        String cumle=scan.nextLine();

        System.out.println("Sayisal degerler toplami : "+sayisalIfadeleriTopla(cumle));

    }

    private static int sayisalIfadeleriTopla(String cumle) {

        int toplam=0;

        String [] cumleArr=cumle.split("");
        for (String each:cumleArr) {
            if (Character.isDigit(each.charAt(0))){
                toplam+=Integer.valueOf(each);
            }

        }




        return toplam;
    }
}
