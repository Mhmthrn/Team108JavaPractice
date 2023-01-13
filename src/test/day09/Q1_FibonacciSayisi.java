package test.day09;

import java.util.ArrayList;
import java.util.List;
public class Q1_FibonacciSayisi {
    static boolean fibo=false;
    static int x;
    static int y;
    /*
     * Write a method which accepts an integer as parameter
     * and returns “true” if it is a Fibonacci number
     *
     * Then check the result and print
     * “Fibonacci series contain your number” or
     * “Fibonacci series contain that numbers : X and Y”
     * (X and Y should be the closest Fibonacci numbers to given number X<num<Y)
     */
    public static void main(String[] args) {
        int input=250;


        fibonacciHesapla(input);

        if (fibo) System.out.println("Fibonacci series contain your number");
        else System.out.println("Fibonacci series contain that numbers : "+  x +" and "+y);

    }

    private static boolean fibonacciHesapla(int input) {
        //0 1 1 2 3 5 8 13 21 34


        if (input<0){
            System.out.println("Fibonacci sayisi 0 dan kucuk olamaz");
        }
        if (input==0) System.out.println("En kucuk Fibonacci sayisi 0 dir");

        List<Integer> fibonacciList=new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);

        for (int i = 2; i < input ; i++) {

            fibonacciList.add(fibonacciList.get(i-1)+fibonacciList.get(i-2));

            if (fibonacciList.get(i)>=input){
                break;
            }

        }
        System.out.println(fibonacciList);

        if (fibonacciList.get(fibonacciList.size()-1)==input)
            fibo=true;
        else fibo=false;

        y = fibonacciList.get(fibonacciList.size()-1);
        x = fibonacciList.get(fibonacciList.size()-2);
        return fibo;
    }

}
