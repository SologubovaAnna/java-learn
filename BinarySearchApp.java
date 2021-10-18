/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Рекурсивный двоичный поиск. Main класс
 * OrdArray2 Конструктор
 * Запуск программы: C>java BinarySearchApp
 * Работа с классом упорядоченного массива
 *  Last modified:     October 18, 2021
 **************************************************************************** */
class BinarySearchApp {
    public static void main(String[] args) {
        int max = 100;
        OrdArray2 arr;
        arr = new OrdArray2(max);
        arr.insert(10);
        arr.insert(100);
        arr.insert(8);
        arr.insert(200);
        arr.display();
        int value = 8;
        if (arr.find(value) != arr.size()) {  //искомое знач != кол-ву эл в массиве
            System.out.print("Faund " + value + " ");
        } else {
            System.out.println("Not faund value." + value);
        }
    }
}
