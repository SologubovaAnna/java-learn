/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Array {
    public static void main(String[] args) {
        long[] arr;  // ссылка на массив
        arr = new long[100];   //создание мосива
        int nElem;   //кол-во элементов
        int j;    //счетчик цикла
        long searchKey;   //ключи искомого элемента
        //вставка элемента
        arr[0] = 77;
        arr[1] = 66;
        arr[2] = 10;
        arr[3] = 50;
        arr[4] = 55;
        arr[5] = 88;
        arr[6] = 58;
        arr[7] = 68;
        arr[8] = 70;
        arr[9] = 100;
        //вставка элемента в массив закончена

        nElem = 10;    //моссив содержит 10 элементов

        //вывод элемента
        for (j = 0; j < nElem; j++) {
            System.out.print(arr[j] + " ");
            // System.out.println(" ");

        }
        //поиск элемента с ключем
        searchKey = 66;
        for (j = 0; j < nElem; j++) {   //для каждого элемента
            if (arr[j] == searchKey) {  //найден ключ?
                break;    //выйти из цикла
            }
            if (j == nElem) {   //если достигнут последний элемент?
                System.out.println("No key " + searchKey);  //да
            } else {
                System.out.println("Yes key " + searchKey);   //нет
            }


        }
        //закончен поиск элемента

        //удаление элемента
        searchKey = 77;
        for (j = 0; j < nElem; j++) {     //для каждого элемента
            if (arr[j] == searchKey) {    //найден ключ?
                break;
            }
        }
        for (int k = j; k < nElem - 1; k++) {   //сдвиг последних элементов
            arr[k] = arr[k + 1];
        }
        nElem--;  //уменшение размера


        //закончено удаление

        //вывод элемента
        for (j = 0; j < nElem; j++) {  //для всех элементов
            System.out.print(arr[j] + " ");  //показать массив
            // System.out.println(" ");

        }

    }
}
