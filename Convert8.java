/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Перевод чисел в 8-ми ричную систему и обратно в десятичную
 *  Last modified:     October 22, 2021
 **************************************************************************** */

import java.util.regex.Pattern;

class Convert8 {
    public static void main(String[] args) {
        int des = 21;
        System.out.println("10tichnoe number " + des + "= 8richnomy number = " + to8Rich(des));
        int num8Rich = 25;
        System.out.println("8richnoe number " + num8Rich + " = 10tichnoe number = " + to10Tich(num8Rich));

    }

    public static int to8Rich(int des) {
        int num8r = 0;
        if (des <= 0) {   //если 0 или отрицательное то не вычисляем
            return des;
        }
        int i = 0;
        while (des != 0) {
            // des % 8 это остаток от деления des на 8
            num8r = (int) (num8r + (des % 8) * Math.pow(10, i++));
            des = des / 8;
        }
        return num8r;
    }

    public static int to10Tich(int num8R) {
        int des = 0;
        if (num8R <= 0) {  //если 8-миричное = 0 или отрицательное то не переводим в десятичные
            return num8R;
        }
        int j = 0;
        while (num8R != 0) {
            des = (int) (des + (num8R % 10) * Math.pow(8, j++));
            num8R = num8R / 10;
        }
        return des;
    }
}
