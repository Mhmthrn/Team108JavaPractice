package test.day5;

import java.util.Arrays;

public class Q1_Arrays2D {
    public static void main(String[] args) {

        char[] [] harfler=new char[3][4];

        harfler[0][0]='A';
        harfler[0][1]='B';
        harfler[0][2]='C';
        harfler[0][3]='D';
        System.out.println(Arrays.deepToString(harfler));//[[A, B, C, D], [0 ,0  , 0 , 0 ], [ 0, 0 , 0 ,0  ]]

        System.out.println(Arrays.toString(harfler[0]));//[A, B, C, D]
        System.out.println(harfler[0]);//ABCD

        System.out.println(harfler[0][2]);//C

        harfler[1][0]='E';
        harfler[1][1]='F';
        harfler[1][2]='G';
        harfler[1][3]='H';

        harfler[2][0]='J';
        harfler[2][1]='K';
        harfler[2][2]='L';
        harfler[2][3]='M';

        System.out.println(Arrays.deepToString(harfler));//[[A, B, C, D], [E, F, G, H], [J, K, L, M]]

        // tum atmalari indexler uzerinden gerceklestirebildigimiz gibi tek seferde de yapabiliriz

        int [][] sayilar={{10,20,30},{1,2,3},{100,200,300}};

        System.out.println(sayilar[2][1]);//200
        System.out.println(Arrays.deepToString(sayilar));//[[10, 20, 30], [1, 2, 3], [100, 200, 300]]


    }
}
