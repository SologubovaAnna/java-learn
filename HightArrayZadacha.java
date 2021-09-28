/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор Класс массива с высокоуровневым интерфейсом
 * getMax(), который возвращает наибольшее значение ключа в массиве или –1, если
массив пуст
 *  Last modified:     September 14, 2021
 **************************************************************************** */
class HightArrayZadacha {
    private long[] arr;
    private int maxSize;

    public HightArrayZadacha(int max) {
        maxSize = 0;
        arr = new long[max];
    }

    public boolean find(long value) {
        for (int j = 0; j < maxSize; j++) {
            if (a[j] == value) {    //найдено
                break;
            }
        }
        if (j == maxSize) {       //достигнут последний эл?
            return false;
        } else {
            return true;
        }
    }

    public void insert(long value) {
        arr[maxSize] = value;
        maxSize++;
    }

    public boolean delete(long value) {
        for (int j = 0; j < maxSize; j++) {
            if (arr[j] == value) {
                break;
            }
        }
        if (j == maxSize) {
            System.out.print("Not found for delete. ");
            return false;
        } else {
            System.out.print("Delete: " + value);
            for (int k = j; k < maxSize; k++) {   //сдвигаем если удаляем
                arr[k] = arr[k + 1];
            }
            maxSize--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < maxSize; j++) {
            System.out.print("a[j] " + a[j]);
        }
    }

    public void getMax() {
        for (int j = 0; j < maxSize; j++) {
            if (arr[j] == 0) {
                System.out.print("-1 " + " ");
            }
        }
    }


}
