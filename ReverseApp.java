/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Объект для перестановки букв в слове
 * Класс main
 * для ввода строки через консоль import java.io.*;
 * и input = getString();
 * и  public static String getString() throws IOException
 *  Last modified:     September 23, 2021
 **************************************************************************** */

import java.io.*;

class ReverseApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while (true) {
            System.out.print("Enter a string:");
            System.out.flush();
            input = getString();   //чтение строки из клавиатуры
            if (input.equals("")) {    //завершение если ENTER
                break;
            }

            Reverser array = new Reverser(input);   // Создание объекта Reverser
            output = array.doRev();              //использование переставнока букв в  Reverser
            System.out.print("Rever: " + output + " ");
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

}
