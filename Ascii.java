/*
Принимает int выводит значение char unicode таблица
 */

public class Ascii {
    public static char getChar(int c) {
        char x = (char) c;
        System.out.println(x);
        return x;
    }

    public static void main(String[] args) {
        Ascii a = new Ascii();
        a.getChar(42);
    }
}
