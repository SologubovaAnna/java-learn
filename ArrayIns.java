/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Сортировка методом вставки insertSort
 *  Last modified:     September 14, 2021
 **************************************************************************** */
class ArrayIns {
    private long[] a;  //ссылка на моссив a
    private int nElemens;  // кол-во элементов

    public ArrayIns(int max) {
        a = new long[max];   //создание массива
        nElemens = 0;    //пока нет элементов
    }

    public void insert(long value) {   //вставка элементов
        a[nElemens] = value;   //собственно вставка
        nElemens++;     //увеличение массива
    }

    public void display() {  //вывод элементов
        for (int j = 0; j < nElemens; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");

    }

    public void insertionSort() {
        int in, out;
        for (out = 1; out < nElemens; out++) {  //out - разделительный маркер
            long temp = a[out];      //скопировать помеченный элемент
            in = out;               //начать перемещеннмие с out
            while (in > 0 && a[in - 1] >= temp) {  //пока не найден меньший элемент
                a[in] = a[in - 1];   //сдвинуть элемент право
                --in;               // перейти на позицию влево
            }
            a[in] = temp;           //вставить помеченный элемент
        }
        System.out.println("Sort yes!");
    }
}
