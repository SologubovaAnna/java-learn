/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор для очереди с циклическим переносом\
 * QueueApp - main
 * при поиске закрывающих скобок (){}[]
 *  Last modified:     September 23, 2021
 **************************************************************************** */
class Queue {
    private int maxSize;
    private long[] array;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int max) {
        maxSize = max;
        array = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) {  //вставка
        if (rear == maxSize - 1) {   //циклический перенос
            rear = -1;             //rear задаем -1
        }
        array[++rear] = j;    // rear увеличиваем до 0 и вставляем элемент
        nItems++;             //увелич эл-тов
    }

    public long remove() {    //извоечение эл в начале очереди
        long temp = array[front++];  //выборка и увелич front
        if (front == maxSize) {     //циклич перенос
            front = 0;
        }
        nItems--;    //кол-во эл уменьшается
        return temp;
    }

    public long peekFront() {   //чтение элемента
        return array[front];
    }

    public boolean isEmpty() {    //true если очередь пуста
        return (nItems == 0);
    }

    public boolean isFull() {     //true если очередь полная
        return (nItems == maxSize);
    }

    public int size() {    //кол-во элементов в очереди
        return nItems;
    }
}
