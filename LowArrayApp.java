/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Класс массива с низкоуровневым интерфейсом
 *  Last modified:     September 14, 2021
 **************************************************************************** */
public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr;  //ссылка на LowArray
        arr = new LowArray(100);   //создание объекта LowArray
        int nElem = 0;  //количество элементов в моссиве
        int j;    //переменная цикла

        //вставка элементов
        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElem = 10;      //моссив содержит 10 эл-тов

        //выводим элементы
        for (j = 0; j < nElem; j++) {
            System.out.print(arr.getElem(j) + " ");
        }

        //поиск эл-тов
        int searchKey = 66;  //искомое значение
        for (j = 0; j < nElem; j++) {   //для каждого элемента
            if (arr.getElem(j) == searchKey) {    //Значение найдено?
                break;
            }
        }
        if (j == nElem) {  //нет не найдено, т.е. j == последнему элементу
            System.out.println("Can`t find " + searchKey);
        } else {
            System.out.println("Found" + searchKey);
        }

        //удаление элемента с ключем 55
        for (j = 0; j < nElem; j++) {    //поиск элемента 55
            if (arr.getElem(j) == 55) {   //значение найдено?
                break;
            }
        }
        for (int k = j; k < nElem; k++) {   //сдвиг последующих элементов
            arr.setElem(k, arr.getElem(k + 1));
        }
        nElem--;

        //вывод элементов
        for (j = 0; j < nElem; j++) {
            System.out.print(arr.getElem(j) + " ");
        }

    }
}
