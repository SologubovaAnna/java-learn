/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор для перестановки букв в слове
 *  Last modified:     September 23, 2021
 **************************************************************************** */
class Stack {
    private int maxSize;
    private char[] array;
    private int top;

    public Stack(int size) {
        maxSize = size;
        array = new char[maxSize];
        top = -1;
    }

    public void push(char j) {   //вставка элемента буквы
        array[++top] = j;      //увеличение вершины и вставка эл.
    }

    public char pop() {   //извлечение эл. буквы
        return array[top--];
    }

    public char peer() {    // чтение буквы
        return array[top];
    }

    public boolean isEmpty() {   //true если пустой стек
        return (top == -1);
    }
}
