/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор для стека которвый будет рассчитывать 23+ и т.п.
 *  Last modified:     September 23, 2021
 * **************************************************************************** */
class StackResult {
    private int maxSize;
    private int[] arr;
    private int top;

    public StackResult(int max) {
        maxSize = max;
        arr = new int[maxSize];
        top = -1;
    }

    public void push(int value) {   //вставка эл
        arr[++top] = value;
    }


    public int pop() {      // возвращение эл-та
        return arr[top--];
    }

    // чтение эл-та
    public int peek() {
        return arr[top];
    }

    public boolean isEmpty() {   //true если пустой стек
        return (top == -1);
    }

    public boolean isFull() {   //true если полный стек
        return (top == maxSize - 1);
    }

    public int size() {  //текущий размер стека
        return top + 1;
    }

    public int peekN(int n) {   //значение элемента с индеком N
        return arr[n];
    }

    public void display(String s) {   //вывод стека
        System.out.print(s);
        System.out.print("Stack top: " + " ");
        for (int j = 0; j < size(); j++) {
            System.out.print(peekN(j));
            System.out.print(" ");
        }
        System.out.println("");
    }

}
