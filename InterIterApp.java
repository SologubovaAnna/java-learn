/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Класс main для итератор связного списка
 *  Last modified:     October 05, 2021
 * s — вывод содержимого списка.
 * r — возвращение итератора в начало списка.
 * n — переход к следующему элементу.
 * g — вывод содержимого текущего элемента.
 * b — вставка перед текущим элементом.
 * a — вставка нового элемента после текущего.
 * d — удаление текущего элемента
 **************************************************************************** */

import java.io.*;    //для ввода данных с клавиатуры

class InterIterApp {
    public static void main(String[] args) throws IOException {
        LinkListIterator theList = new LinkListIterator();  //создание списка
        ListIterator iter1 = theList.getIterator();    //создание итератора
        long value;

        iter1.insertAfter(22);
        iter1.insertAfter(55);
        iter1.insertAfter(88);
        iter1.insertAfter(11);

        iter1.insertBefore(60);

        while (true) {
            System.out.print("Enter first letter of show, reset,");
            System.out.print("next, get, before, after, delete:");
            System.out.flush();
            int choice = getChar();   //ввод каманды
            switch (choice) {
                case 's':      //если ввести s то выведется список на экран
                    if (!theList.isEmpty()) {  //если список не пуст
                        theList.displayList();
                    } else {   //если пустой
                        System.out.print("\nList is empty!");
                        break;
                    }
                case 'r':     //возврат к first эл
                    iter1.reset();
                    break;
                case 'n':     //переход к следующему элементу
                    if (!theList.isEmpty() && !iter1.atEnd()) {    //список не пуст и итератор текущего эл не явл последним эл в списке
                        iter1.nextLink();
                    } else {
                        System.out.print("\nCan`t go to next link!");
                    }
                    break;
                case 'g':     //получение текущего элемента
                    if (!theList.isEmpty()) {
                        value = iter1.getCurrent().dData;   //получение текущего эл
                        System.out.print("\nReturned" + value);
                    } else {
                        System.out.print("\nList empty!!!");
                    }
                    break;
                case 'b':   //вставка перед текущ эл
                    System.out.print("\nEnter value to insertBefore:");
                    System.out.flush();
                    value = getInt();     //ввод команды
                    iter1.insertBefore(value);   //вставка эл перед текущим
                    break;
                case 'a':   //вставка после итератора текущего
                    System.out.print("\nEnter value to insertAfter:");
                    System.out.flush();
                    value = getInt();     //ввод команды
                    iter1.insertAfter(value);   //вставка эл после текущего эл
                    break;
                case 'd':    //удаление текущ эл
                    if (!theList.isEmpty()) {   //список не пустой?
                        value = iter1.deleteCurrent();   //удаление текущего эл в списке по итератору
                        System.out.print("\nDeleted" + value);
                    } else {
                        System.out.print("\nCan`t delete!!!");
                    }
                    break;
                default:
                    System.out.print("\nInvalid entry");
            }
        }
    }

    //методы вспомагательные для чтения и ввода данных с экрана
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
