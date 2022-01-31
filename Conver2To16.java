/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Перевод двоичного числа в 16-тиричную и обратно в 2-ичную
 * все переводы делаю вначале перевод в 10-ную систему а затем в 2-ую или 16-ную.
 *  Last modified:     October 22, 2021
 **************************************************************************** */

import java.util.regex.Pattern;
import java.util.Arrays;

class Conver2To16 {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String binary = "100111010000";
        System.out.println("2-e number " + binary + "= 16-nirichnomy number = " + to16num(binary));
        String num16 = "9d0";
        System.out.println("16-tirichnoe num " + num16 + "= 2-nomy num = " + to2num(num16));
    }

    public static String to16num(String binary) {
        String q = "";
        if (binary == null || binary.equals(" ")) {  //если =0 то ничего не делаю
            return q;
        }

        String reg = "[0-1]+";
        if (binary.matches(reg) == false) {  // проверка на наличие символов кроме 0 и 1
            return q;
        }
        //дополняем нулями впереди если длина строки входящей не кратно 4
        if (binary.length() % 4 != 0) {
            //высчитываем сколько нужно добавить нулей чтобы было кратно 4
            int a = 4 - binary.length() % 4;
            for (int j = 0; j < a; j++) {
                binary = "0" + binary;  //добавляем 0 в начало строки, кол-во 0 == a
            }
        }
        char[] chArray = binary.toCharArray();
        for (int j = 0; j < chArray.length / 4; j++) {   //берем по 4 бита
            char[] newArray = Arrays.copyOfRange(chArray, j + 3 * j, (j + 3 * j) + 4);
            String binStr = String.valueOf(newArray);

            int num10 = 0;
            for (int i = 0; i < binStr.length(); i++) {   // переводим каждые 4 бита в 10-чное число
                int index = binStr.length() - 1 - i;
                int value = Character.getNumericValue(binStr.charAt(index));
                num10 = (int) (num10 + value * Math.pow(2, j));

            }
            if (num10 == 0) {  // если 10-тичное число ==0 выводим 0
                char hex0 = HEX.charAt(0);
                q = q + hex0;
            }
            while (num10 != 0) {   // если 10-е число не 0 переводим в 16-тиричное
                char sum = HEX.charAt(num10 % 16);
                q = q + sum;
                num10 = num10 / 16;

            }

        }
        return q;
    }

    public static String to2num(String num16) {
        if (num16 == null || num16.equals("")) {
            return "";
        }
        String q = "[0-9a-f]+";
        if (num16.matches(q) == false) {  // проверка на наличие правильных символов
            return "";
        }
        int num10 = 0;
        for (int j = 0; j < num16.length(); j++) {  //переводим из 16-го в 10-е число
            char s = num16.charAt(j);
            int b = HEX.indexOf(s);
            num10 = (int) (16 * num10 + b);
        }
        String bin = "";
        if (num10 == 0) { // если 10-е число ==0
            //то выводим 0000: число =0 => 0000; число =00=>0000 0000; и т.д.
            for (int i = 0; i < num16.length(); i++) {
                bin = "0000" + bin;
            }
        }
        while (num10 != 0) {   // переводим из 10-го в 2-ное пока если не 0
            bin = (num10 % 2) + bin;
            num10 = num10 / 2;

        }
        //добавляем нули слева если длина строки не кратно 4
        if (bin.length() % 4 != 0) {
            int a = 4 - bin.length() % 4;
            for (int j = 0; j < a; j++) {
                bin = "0" + bin;
            }
        }
        return bin;
    }
}
