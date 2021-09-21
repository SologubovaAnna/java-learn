/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Обект с сортировкой мотодом Выбора
 *  Last modified:     September 21, 2021
 **************************************************************************** */
class SelectSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArraySel arr;
        arr = new ArraySel(maxSize);
        arr.insert(22);
        arr.insert(55);
        arr.insert(44);
        arr.insert(33);
        arr.insert(88);
        arr.insert(99);
        arr.insert(77);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        System.out.println("Before sort: ");
        arr.display();
        arr.selectionSort();
        System.out.println("After sort: ");
        arr.display();
    }
}
