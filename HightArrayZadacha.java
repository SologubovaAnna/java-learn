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
        int j;
        for (j = 0; j < maxSize; j++) {
            if (arr[j] == value) {    //найдено
                System.out.println("Find" + arr[j]);
                break;
            }
        }

        if (j == maxSize) {       //достигнут последний эл?
            System.out.println("Not faund. ");
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
        int j;
        for (j = 0; j < maxSize; j++) {
            if (arr[j] == value) {
                break;
            }
        }

        if (j == maxSize) {
            System.out.println("Not found for delete. ");
            return false;
        } else {
            System.out.println("Delete: " + value);
            for (int k = j; k < maxSize; k++) {   //сдвигаем если удаляем
                arr[k] = arr[k + 1];
            }
            maxSize--;
            return true;
        }
    }


    public void display() {
        for (int j = 0; j < maxSize; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public void getMax() {    //максимальный эл
        long max = 0;

        for (int j = 0; j < maxSize; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        if (maxSize == 0) {    //если моссив пуст то выводим -1
            max = -1;
        }
        System.out.println("\nMax: " + max);
    }
}

