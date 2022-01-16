/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 * Нужно считать название файла с консоли
 * в том файле 1.txt такое : pot top tort lol lol lol lolt
o o
* нужно вывести пары слов которые являются обращением друг друга (слова перевертыши)
* типа рот - тор
* Если в файле 3 слова, то нужно вывести только пару, т.е. из 3 слов 1 пара из 4 слов 2 пары.
 **************************************************************************** */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WordsBuilder {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        // BufferedReader
        reader = new BufferedReader(new FileReader(file));
        String line = "";
        ArrayList<String> list = new ArrayList<>();


        while ((line = reader.readLine()) != null) {
            if (line != null) {
                //list.add(line);
                list.addAll(Arrays.asList(line.split(" ")));

            }
        }
/*

        for (String j : list) {

            System.out.print(j + " " );

        }
        System.out.println("_________________________________________________");


 */

        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) != null) {

                for (int i = j + 1; i < list.size(); i++) {
                    StringBuilder build = new StringBuilder();
                    build.append(list.get(i)).reverse();

                    //  System.out.println(build);

                    if (list.get(j).equals(build.toString())) {
                        Pair pair = new Pair();
                        pair.first = list.get(j);
                        pair.second = list.get(i);

                        result.add(pair);
                        //если не обнулить то при одинаковых 3 словах будет выводить как 2 пары одинаковых
                        list.set(i, null);
                        list.set(j, null);

                        break;
                    }
                }
            }
        }
        for (Pair j : result) {
            System.out.println(j.first + " " + j.second);
        }


    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Pair pair = (Pair) obj;
            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;

            return second != null ? second.equals(pair.second) : pair.second == null;
        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : null;
            result = 31 * result + (second != null ? second.hashCode() : null);

            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                   first == null ? second :
                   second == null ? first :
                   first.compareTo(second) < 0 ? first + " " + second :
                   second + " " + first;
        }

    }
}
