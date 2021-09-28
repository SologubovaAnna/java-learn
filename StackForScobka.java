/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор для поиска закрывающих скобок.
 * На самом деле это просто конструктор стека который мы будем использовать в дальнейшем
 * при поиске закрывающих скобок (){}[]
 *  Last modified:     September 23, 2021
 **************************************************************************** */
class StackForScobka {
    private int maxSize;
    private char[] arr;
    private int top;

    public StackForScobka(int max) {
        maxSize = max;
        arr = new char[maxSize];
        top = -1;    //top пустой
    }

    public void push(char value) {
        arr[++top] = value;     //Увеличение top и внесение данных
    }

    public char pop() {
        return arr[top--];
    }
    
    public char peek() {   // чтение эл без удаления из стека
        return arr[top];
    }

    public boolean isEmpty() {   // true если пустой стек
        return (top == -1);
    }
}
