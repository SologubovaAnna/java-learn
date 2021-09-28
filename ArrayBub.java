/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор моссива где есть пузырьковая сортировка
 *  Last modified:     September 21, 2021
 **************************************************************************** */

class ArrayBub {
    private long[] a;
    private int nElems;

    public ArrayBub(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println(" ");
    }

    public void bubbleSort() {
        int in, out;
        for (out = nElems - 1; out > 1; out--) {    //внешний цикл, обратный
            for (in = 0; in < out; in++) {      //внутренний цикл, прямой
                if (a[in] > a[in + 1]) {        //если первый эл больше второго
                    swap(in, in + 1);           //менять местами
                }

            }
        }
    }

    public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;

    }
}
