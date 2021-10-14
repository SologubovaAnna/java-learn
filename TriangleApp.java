/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Вычисление 3-угольных чисел
 *  рекурсивным методом
 * Класс main и метод тут же в одном файле
 *  Last modified:     October 14, 2021
 **************************************************************************** */

import java.io.*; // Для ввода/вывода

class TriangleApp {
    static int theNumber;

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number: ");
        //вводим цифру, номер 3-угольного числа
        theNumber = getInt();
        //вычисление
        int theAnswer = triangle(theNumber);
        System.out.println("Triangle: " + theAnswer);
    }

    //метод вычисление треугольного числа
    //  *
    //  **
    //  ***
    //  ****
    //  4321  (ряд справа на лево)
    public static int triangle(int n) {
        System.out.println("Entering: n=" + n);
        //если n =1 то вернуть 1
        if (n == 1) {
            System.out.println("Returning 1");
            return 1;
        } else {   //если больше 1
            //вернуть n + ( сам метод (n-1, т.е цикл уменьшается))
            int temp = n + triangle(n - 1);
            System.out.print("\nReturning" + temp);
            //return (n + triangle(n - 1));
            return temp;
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

}
