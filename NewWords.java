/*
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
 */

import java.util.*;

public class NewWords {

    public static String accum(String s) {
        s = s.toLowerCase();
        StringBuilder build = new StringBuilder();
        char x;
        for (int j = 0; j < s.length(); j++) {
            x = s.charAt(j);
            for (int i = 0; i < j + 1; i++) {
                if (i == 0) {
                    build.append(Character.toUpperCase(x));
                } else {
                    build.append(x);
                }
            }
            if (j != s.length() - 1) {
                build.append("-");
            }

        }
        String res = build.toString();
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        NewWords x = new NewWords();
        x.accum("RqaEzty");
    }
}
