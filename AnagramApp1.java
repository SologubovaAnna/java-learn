/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * перстановка букв в слове, типа cat = atc = tca = tca
 *  рекурсивным методом
 * Класс main и метод тут же в одном файле
 *  Last modified:     October 14, 2021
 *****************************************************************************/

import java.io.*;

class AnagramApp1 {
    static int size;   //размер
    static int coun;   //кол-во
    static char[] arrChar = new char[100];  //моссив из 100 эл

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a word: ");
        String input = getString();
        size = input.length();   //определение размера
        coun = 0;
        //сохранение в массиве
        for (int j = 0; j < size; j++) {
            arrChar[j] = input.charAt(j);  //сохранение данных в моссив
            doAnagram(size);  //построение анаграмм
        }

    }

    public static void doAnagram(int newSize) {
        if (newSize == 1) {  //если слишком маленькое слово
            return;   //ничего не делать
        }
        //для каждого эл
        for (int j = 0; j < newSize; j++) {
            //построить анаграммы остальных слов
            doAnagram(newSize - 1);
            //если внутреннее состояние
            if (newSize == 2) {
                //вывод слова
                displayWord();
            }
            //циклический сдвиг всего слова
            rotate(newSize);

        }

    }

    public static void rotate(int newSize) {
        int j;
        int position = size - newSize;
        //сохранение 1-ой буквы
        char temp = arrChar[position];
        //сдвиг остальных букв в лево
        for (j = position + 1; j < size; j++) {
            arrChar[j - 1] = arrChar[j];
        }
        arrChar[j - 1] = temp;  //перемещение 1-ой буквы на правый край

    }

    public static void displayWord() {
        if (coun < 99) {
            System.out.print("");
        }
        if (coun < 9) {
            System.out.print("");
        }
        System.out.print(++coun + "");
        for (int j = 0; j < size; j++) {
            System.out.print(arrChar[j]);
        }
        System.out.print("    ");
        System.out.flush();
        if (coun % 6 == 0) {
            System.out.println("");
        }
    }


    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}


