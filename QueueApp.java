/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор для очереди с циклическим переносом Queue
 * QueueApp - main
 * при поиске закрывающих скобок (){}[]
 *  Last modified:     September 23, 2021
 **************************************************************************** */
class QueueApp {
    public static void main(String[] args) {
        Queue array = new Queue(5);
        //вставка 4 эл в очередь
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        //удаление 3 эл
        array.remove();
        array.remove();
        array.remove();
        //вставка 4 эл
        array.insert(60);
        array.insert(70);
        array.insert(80);
        array.insert(90);
        //вывод и извлечение эл из очереди
        while (!array.isEmpty()) {
            long n = array.remove();  //извлечение (удаление из очереди)
            System.out.print(n + " ");  //вывод
        }
        System.out.println(" ");
    }
}
