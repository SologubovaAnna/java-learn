/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор создание массива с высокоуровневым интерфейсом
 *  метод find() использует двоичный поиск
 *  size(),возвращает текущее количество элементов данных в массиве
 *  Last modified:     September 14, 2021
 **************************************************************************** */
class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;   //размер моссива
        OrdArray arr;        // ссылка на моссив OrdArray
        arr = new OrdArray(maxSize);   //создание массива
        //вставка 10 элементов
        arr.insert(11);
        arr.insert(22);
        arr.insert(33);
        arr.insert(44);
        arr.insert(55);
        arr.insert(66);
        arr.insert(77);
        arr.insert(88);
        arr.insert(99);
        //вывод элементов
        arr.display();
        //поиск элемента
        int searchKey = 55;    //значение искомого элемента
        if (arr.find(searchKey) != arr.size()) {
            System.out.print("\nFound find " + searchKey + " \n");
        } else {
            System.out.print("\nNot found find " + searchKey + " \n");
        }

        //вывод элементов
        arr.display();

        //удаление элементов
        arr.delete(55);
        arr.delete(11);
        arr.delete(100);

        //повторный вывод после удаления эл.
        arr.display();

    }
}
