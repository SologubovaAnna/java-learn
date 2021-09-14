/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор Класс массива с высокоуровневым интерфейсом
 *  Last modified:     September 14, 2021
 **************************************************************************** */

class HighArray {
    private long[] a;   //ссылка на массив a
    private int nElems;  //кол-во элементов в массиве

    public HighArray(int max) {    //конструктор
        a = new long[max];    //создание моссива
        nElems = 0;         //пока нет ни одного элемента в моссиве
    }

    //поиск заданного значения
    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {    //для каждого элемента
            if (a[j] == searchKey) {     //значение найдено?
                break;                  //да выход из цыкла
            }
        }
        if (j == nElems) {  //достигнут последний элемент?
            return false;   //да
        } else {
            return true;    //нет
        }
    }

    //вставка эл-та в массив
    public void insert(long value) {
        a[nElems] = value;     //вставка элемента
        nElems++;   //увеличение размера массива
    }

    //удаление эл-та из массива
    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {   //для каждого элемента в массиве
            if (a[j] == value) {       //найден элемент value в моссиве?
                break;                // да выход из цыкла
            }
        }
        if (j == nElems) {           //цикл дошел до последнего элемента?
            System.out.println("Not value " + value);
            return false;            //найти не удалось искомый элемент
        } else {
            System.out.println("Delete value " + value);
            // если нашли то сдвигаем последующие элементы
            for (int k = j; k < nElems; k++) {
                a[k] = a[k + 1];
            }
            nElems--;               //уменшаем размер моссива
            return true;            //да нашли искомый элемент
        }
    }

    //вывод содержимого массива
    public void display() {
        for (int j = 0; j < nElems; j++) {   //для каждого эл-та
            System.out.print(a[j] + " ");  //вывод всех эл-тов
        }

    }
}
