/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Класс main для поиска закрывающих скобок в стеке.
 * при поиске закрывающих скобок (){}[]
 *  Last modified:     September 23, 2021
 **************************************************************************** */

import java.io.*;

class BracketsApp {
    public static void main(String[] args) throws IOException {
        String input;
        while (true) {
            System.out.print("Enter string containing delimiters: ");
            System.out.flush();
            input = getString();   //чтение строки с клавиатуры
            if (input.equals("")) {  //закончить если нажат Enter
                break;
            }

            //создание обекта BracketChecker
            BracketChecker arr = new BracketChecker(input);
            arr.check();    //проверка парных скобок
        }

    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
