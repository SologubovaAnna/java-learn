/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор для преоритетной очереди Priority
 * PriorityApp - main
 * при поиске закрывающих скобок (){}[]
 *  Last modified:     September 23, 2021
 **************************************************************************** */
class PriorityApp {
    public static void main(String[] args) {
        Priority arr = new Priority(5);
        arr.insert(20);
        arr.insert(50);
        arr.insert(80);
        arr.insert(10);
        arr.insert(99);
        while (!arr.isEmpty()) {
            long item = arr.remove();
            System.out.print(item + " ");
        }
        System.out.println(" ");
    }
}
