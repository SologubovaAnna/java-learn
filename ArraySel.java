/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор обекта с сортировкой мотодом Выбора
 *  Last modified:     September 21, 2021
 **************************************************************************** */
class ArraySel {
    private long a[];
    private int nElemes;

    public ArraySel(int maxSize) {
        a = new long[maxSize];
        nElemes = 0;
    }

    public void insert(long valume) {
        a[nElemes] = valume;
        nElemes++;
    }

    public void display() {
        for (int j = 0; j < nElemes; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println(" ");
    }

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < nElemes - 1; out++) {
            min = out;
            for (in = out + 1; in < nElemes; in++) {
                if (a[in] < a[min]) {
                    min = in;
                }
            }
            swap(out, min);
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

}
