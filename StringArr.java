/*
из long=1234567
выводит моссив наоборот
7654321 моссив
 */

import java.util.*;

public class StringArr {
    public static int[] digitize(long n) {
        String[] build = new StringBuilder(String.valueOf(n)).reverse().toString().split("");

        int[] array = new int[build.length];
        for (int j = 0; j < build.length; j++) {
            array[j] = Integer.parseInt(build[j]);
            System.out.println(array[j]);
        }

        return array;
    }

    public static void main(String[] args) {
        StringArr a = new StringArr();
        a.digitize(543021);
    }

}
