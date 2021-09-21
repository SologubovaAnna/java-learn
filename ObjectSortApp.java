/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Класс, используемый для хранения данных
 * сортировка имен от А до Я
 * сортировка вставкой
 *  Last modified:     September 20, 2021
 * Запуск программы: java ObjectSortApp
 **************************************************************************** */
class ObjectSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayInOb arr;
        arr = new ArrayInOb(maxSize);

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);

        System.out.println("Before sort:");
        arr.display();

        arr.insertionSort();
        System.out.println("After sort:");
        arr.display();
    }
}
