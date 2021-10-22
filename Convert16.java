/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Перевод десятичных чисел в 16-ричную систему и обратно в десятичную
 *  Last modified:     October 22, 2021
 **************************************************************************** */

import java.util.regex.Pattern;

class Convert16 {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int des = 1256;
        System.out.println("10-ichnoe number " + des + " = 16-irichnomy number = " + to16(des));
        String num16 = "4e8";
        System.out.println("16-irichnoe number " + num16 + " = 10-irichnomy number = " + to10(num16));
    }

    public static String to16(int des) {
        String num16 = "";
        if (des <= 0) {   //если 0 или меньше то ничего не делаем
            return num16;
        }
        while (des != 0) {
            //символ из строки HEX с индексом равным остатку от деления
            //десятичного числа на 16
            //charAt покажет эл из строки
            num16 = HEX.charAt(des % 16) + num16;
            des = des / 16;
        }
        return num16;
    }

    public static int to10(String num16) {
        int des = 0;
        if (num16 == null || num16.equals("")) {
            return des;
        }
        for (int j = 0; j < num16.length(); j++) {
            //индекс символа из строки HEX == символу из входящей строки с индексом j
            //indexOf выдает индекс эл, а не сам эл
            des = 16 * des + HEX.indexOf(num16.charAt(j));
        }
        return des;
    }
}
