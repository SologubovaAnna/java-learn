/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Объект моссива где есть пузырьковая сортировка. Класс main
 *  Last modified:     September 21, 2021
 **************************************************************************** */

class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arr;
        arr = new ArrayBub(maxSize);
        arr.insert(22);
        arr.insert(33);
        arr.insert(88);
        arr.insert(99);
        arr.insert(44);
        arr.insert(66);
        arr.insert(55);
        arr.insert(77);
        arr.insert(00);
        arr.insert(11);
        System.out.println("Before sort: ");
        arr.display();
        arr.bubbleSort();
        System.out.println("After sort:");
        arr.display();
    }
}
