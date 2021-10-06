/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Класс main для сортировочного списка
 * Где создается не сорт массив типа Link
 * Данные массива копируются в сорт список и
 * Удаляются из списка и копируются уже отсортированные эл в массив
 * Основной конструктор для списка Link2
 *  Last modified:     October 05, 2021
 **************************************************************************** */
class ListInsertionSortApp {
    public static void main(String[] args) {
        int size = 10;
        Link2[] arr = new Link2[size];
        //заполнение массива
        for (int j = 0; j < size; j++) {
            //случайными числами
            int n = (int) (java.lang.Math.random() * 99);
            //создание эл
            Link2 newLink = new Link2(n);
            //сохранение в массиве
            arr[j] = newLink;
        }
        //вывод эл на экран
        System.out.print("Unsorted array: ");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j].dData + " ");
        }
        System.out.println("");
        SortedList theList = new SortedList(arr);
        for (int j = 0; j < size; j++) {
            arr[j] = theList.remove();  //в моссив
        }
        //вывод на экран
        System.out.print("Sorted Array: ");
        for (int j = 0; j < size; j++)
            System.out.print(arr[j].dData + " ");
        System.out.println("");


    }
}
