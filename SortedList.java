/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор для сортировочного списка
 * Где создается не сорт массив типа Link
 * Данные массива копируются в сорт список и
 * Удаляются из списка и копируются уже отсортированные эл в массив
 * Основной конструктор для списка Link2
 *  Last modified:     October 05, 2021
 **************************************************************************** */
class SortedList {
    private Link2 first;

    public SortedList() {  //конструктор без аргументов
        first = null;    //список пока пуст
    }

    //конструктор массив
    public SortedList(Link2[] linkArr) {   //аргумент массив типа Link2
        first = null;     //инициализ-я списка
        for (int j = 0; j < linkArr.length; j++) {  //копирование массива
            insertLinkSort(linkArr[j]);                       //в список
        }

    }

    //вставка в порядке сортировки
    public void insertLinkSort(Link2 k) {
        //от начала
        Link2 previous = null;
        Link2 current = first;
        //до конца
        while (current != null && k.dData > current.dData) {
            previous = current;
            current = current.next;
        }
        //если в нач списка
        if (previous == null) {
            first = k;
        } else {
            previous.next = k;
        }
        k.next = current;
    }

    public Link2 remove() {
        Link2 temp = first;
        first = first.next;
        return temp;
    }

}
