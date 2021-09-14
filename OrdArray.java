/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор создание массива с высокоуровневым интерфейсом
 *  метод find() использует двоичный поиск
 *  size(),возвращает текущее количество элементов данных в массиве
 * Запуск программы: C>java OrderedApp
 * Работа с классом упорядоченного массива
 *  Last modified:     September 14, 2021
 **************************************************************************** */
class OrdArray {
    private long[] a;   //ссылка на массив a
    private int nElems;   //кол-во элементов в моссиве

    //конструктор
    public OrdArray(int max) {
        a = new long[max];   //создание массива
        nElems = 0;    //пока в моссиве нет элементов
    }

    /*
    метод size(), который возвращает текущее количество элементов данных
    в массиве. Эта информация важна для пользователя
класса main() при вызове find(). Если If find() вернет значение nElems,
 которое main() идентифицирует при помощи size(), значит, поиск был безуспешным
     */
    public int size() {
        return nElems;
    }

    //двоичный поиск
    public int find(long searchKey) {
        int lowelBound = 0;      //начальная ячейка
        int upperBound = nElems - 1;  //последняя ячейка
        int curIn;                  // указатель поиска

        while (true) {
            curIn = (lowelBound + upperBound) / 2;  //указатель ставим по середине моссива
            if (a[curIn] == searchKey) {    //элемента найден?
                return curIn;               // да найден
            } else if (lowelBound > upperBound) {
                return nElems;              //эл не найден
            } else {
                if (a[curIn] < searchKey) {
                    lowelBound = curIn + 1;   //верхняя половина для поиска
                } else {
                    lowelBound = curIn - 1;   //нижняя половина для поиска
                }
            }
        }
    }

    //вставка элемента в массив
    public void insert(long value) {
        int j;    //переменная цикла
        for (j = 0; j < nElems; j++) {   // для всех эл-тов
            if (a[j] > value) {      //найден элемент? Линейный поиск
                break;              // да. Выход из цикла
            }
        }
        for (int k = nElems; k > j; k--) {    //перемещение последующих
            a[k] = a[k - 1];                  // элементов
            a[j] = value;                  //вставка элемента
        }
        nElems++;                         //увеличение элементов моссива
    }

    //удаление эл в массиве
    public boolean delete(long value) {
        int j = find(value);    //j = найденому уже через метод find значению
        if (j == nElems) {      //цикл дошел до последнего элемента?
            System.out.print("Not found " + value);
            return false;       //не найдено знач.
        } else {                 //найдено значение
            System.out.print("Delete " + value);
            for (int k = j; k < nElems; k++) {  //для каждого элемента
                a[k] = a[k + 1];       //смещение последующих элементов
            }
            nElems--;                // уменьшение размера массива
            return true;
        }

    }

    // вывод элементов массива
    public void display() {
        for (int j = 0; j < nElems; j++) {     //перебор всех элементов
            System.out.print(a[j] + " ");   //вывод текущего элемента
        }
    }
}
