/*
Заменить цифры в строке
если от 0-5 заменить на 0
если с 5-9 заменить на 1
 */

import java.util.regex.*;

public class FakeBinary {
    public static String fakeBin(String numberString) {

        String newLine = "";
        if (numberString.length() > 0) {
            newLine = numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
        }
        System.out.println(newLine);
        return newLine;
    }

    public static void main(String[] args) {
        FakeBinary b = new FakeBinary();
        b.fakeBin("0123456789");
    }
}
