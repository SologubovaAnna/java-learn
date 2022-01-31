/*
удалить последовотельное повтор слова из строки
 */

import java.util.*;
import java.util.regex.*;

public class WordDouble {
    public static String removeConsecutiveDuplicates(String s) {
        String x = s.replaceAll("(\\b\\S+)( \\1\\b)+", "$1");
        System.out.println(x);
        return x;


    }


    public static void main(String[] args) {
        WordDouble x = new WordDouble();
        x.removeConsecutiveDuplicates("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta");
        System.out.println("----------------------");
        x.removeConsecutiveDuplicates("cyqje cyqje cyqje a a a");
        System.out.println("----------------------");
        x.removeConsecutiveDuplicates("fd fd fd");
    }

}
