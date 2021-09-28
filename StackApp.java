/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Объект Стека испол конструктор StackX
 * Заносим в стек 4 элемента и выводим их пока стек не опустеет
 * Последний эл стоит первым  - это главное в стеках
 *  Last modified:     September 23, 2021
 **************************************************************************** */
class StackApp {
    public static void main(String[] args) {
        StackX arr = new StackX(10);    //создание нового стека
        arr.push(20);
        arr.push(40);
        arr.push(50);
        arr.push(11);
        while (!arr.isEmpty()) {  //пока стек не станет пустым
            long value = arr.pop();   //удалить эл из стека
            System.out.print(value + " ");  //вывод эл.
        }
        System.out.println(" ");
    }
}
