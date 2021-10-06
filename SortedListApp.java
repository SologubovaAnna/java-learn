/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Класс main для сортировочного списка
 * Конструктор для сортировочного списка SortedList1
 * Основной конструктор для списка Link2
 *  Last modified:     October 05, 2021
 *****************************************************************************/
class SortedListApp {
    public static void main(String[] args) {
        SortedList1 theList = new SortedList1();
        theList.insertSort(20);
        theList.insertSort(10);
        theList.insertSort(5);
        theList.displayLink();
        theList.insertSort(200);
        theList.insertSort(2);
        theList.displayLink();
        theList.deleteFirst();
        theList.deleteFirst();
        theList.displayLink();
    }
}
