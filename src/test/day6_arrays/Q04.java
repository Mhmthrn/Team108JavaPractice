package test.day6_arrays;

public class Q04 {
    public static void main(String[] args) {
          /*
     String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa,
     o öğelerin baş harflerini ekrana yazdıran metodu yazınız.
     Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JMJ
     */

        String [] isimler={ "Kemal", "Jonathan", "Mark", "Jackson", "Ali" };
        System.out.println(harfKontrol(isimler));


    }
    public static String harfKontrol(String [] strarr){
        String ilkHarf="";

        for (int i = 0; i < strarr.length; i++) {

            if (strarr[i].endsWith("n") || strarr[i].endsWith("k")){
               ilkHarf+= strarr[i].substring(0,1);

            }

        }
        return ilkHarf;
    }
}
