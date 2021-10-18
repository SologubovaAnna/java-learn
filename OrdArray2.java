/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Рекурсивный двоичный поиск. Конструктор массива.
 * Запуск программы: C>java OrderedApp
 * Работа с классом упорядоченного массива
 *  Last modified:     October 18, 2021
 **************************************************************************** */
class OrdArray2 {
    private long[] a;   //ссылка на моссив
    private int nElem;  //кол-во эл в моссиве

    public OrdArray2(int n) {
        a = new long[n];
        nElem = 0;
    }

    public int size() {
        return nElem;
    }

    public int find(long searchKey) {
        //возвращаем метод рекурсивного двоичного поиска(искомое значение,
        // 0 эл в мосиве, и последний эл в моссиве)
        return recFind(searchKey, 0, nElem - 1);
    }

    private int recFind(long key, int lowelBound, int upperBound) {
        int curIn;
        curIn = (lowelBound + upperBound) / 2;  //0 эл в моссиве+последний эл/2
        if (a[curIn] == key) {
            return curIn;   //найден эл
        } else if (lowelBound > upperBound) {
            return nElem;   //не найден вывести кол-во эл-тов
        } else {
            if (a[curIn] < key) {
                return recFind(key, curIn + 1, upperBound);  //поиск в верхней части массива
            } else {
                return recFind(key, lowelBound, curIn - 1);  //поиск в нижней части массива
            }

        }

    }

    public void insert(long value) {
        int j = 0;
        for (j = 0; j < nElem; j++) {
            if (a[j] > value) {
                break;   //найден
            }
        }
        for (int k = nElem; k > j; k--) {  //перемещение эл
            a[k] = a[k - 1];  //с большим значение ключа
        }
        a[j] = value;  //вставка
        nElem++;   //увел эл в массиве
    }

    public void display() {
        for (int j = 0; j < nElem; j++) {
            System.out.println(a[j] + " ");
        }
        System.out.print("");
    }
}
