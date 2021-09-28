/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Класс main для расчета 23+ из стека
 * ввод 23+ или 257*+ или др
 *  Last modified:     September 23, 2021
 **************************************************************************** */

import java.io.*;

class PostfixApp {
    public static void main(String[] args) throws IOException {
        String input;
        int output;
        while (true) {
            System.out.println("\nEnter postfix input: ");
            System.out.flush();
            input = getString();    //введ строки к славиатуры
            if (input.equals(" ")) {  //если нажат Enter - выход
                break;
            }
            //Создание объекта для разбора выражения
            ParsePost arr = new ParsePost(input);
            output = arr.doParse();    //Обработка выражения
            System.out.println("output: " + output);
        }

    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }


}
