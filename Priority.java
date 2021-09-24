/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор для преоритетной очереди
 * PriorityApp - main
 * при поиске закрывающих скобок (){}[]
 *  Last modified:     September 23, 2021
 **************************************************************************** */
class Priority {
    // Элементы массива сортируются по значению ключа,
    // от максимумa (0) до минимума (maxSize-1)
    private int maxSize;
    private long[] arr;
    private int nItems;

    public Priority(int s) {
        maxSize = s;
        arr = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {   //вставка
        int j;

        if (nItems == 0) {   //если очередь пустая
            arr[nItems++] = item;    //вставляем в ячейку 0
        } else {
            for (j = nItems - 1; j >= 0; j--) {    //перебор в обратном порядке
                if (item > arr[j]) {     //если новый эл больше сущ
                    arr[j + 1] = arr[j];  //сдвинуть вверх
                } else {                  //если меньшше сдвиг прекращается
                    break;
                }
            }
            arr[j + 1] = item;              //вставка эл
            nItems++;                     // увел кол-во эл в очереди

        }


    }

    public long remove() {  //извлечение минимального эл
        return arr[--nItems];
    }

    public boolean isEmpty() {    //true если пусто
        return (nItems == 0);
    }

    public boolean isFull() {  //true если полн
        return (nItems == maxSize);

    }
}
