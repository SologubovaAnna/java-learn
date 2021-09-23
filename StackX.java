/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор. Стек
 *  Last modified:     September 23, 2021
 **************************************************************************** */
class StackX {
    private int maxSize;   //размер массива
    private long[] stack;
    private int top;     //вершина стека

    public StackX(int s) {      //конструктор
        maxSize = s;                     //кол-во элементов
        stack = new long[maxSize];    //создание массива
        top = -1;    //Пока нет ни одного элемента на вершине
    }

    public void push(long j) {    //добавление элемента на вершине стека
        stack[++top] = j;   // Увеличение топ, вставка элемента
    }

    public long pop() {    //извлечение и удаление элемента с вершины стека
        return stack[top--];   //извлечение элемента и уменьшение топ, делая недоступным ячейку
    }

    public long peek() {   // чтение элемента с вершины стека
        return stack[top];
    }

    public boolean isEmpty() {   //true если стек пустой
        return (top == -1);
    }

    public boolean isFull() {   // true если стек полный
        return (top == maxSize - 1);

    }
}
