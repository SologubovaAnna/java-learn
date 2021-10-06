/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор для сортировочного списка
 * Основной конструктор для списка Link2
 *  Last modified:     October 05, 2021
 **************************************************************************** */
class SortedList1 {
    private Link2 first;

    public SortedList1() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    //вставка в порядке сортировки
    public void insertSort(long key) {
        Link2 newLink = new Link2(key);
        Link2 privios = null;   //от начала списка
        Link2 current = first;
        //до конца списка или key > current.dData
        while (current != null && key > current.dData) {
            privios = current;
            current = current.next;   //перейти к сл эл
        }
        //в нач списка?
        if (privios == null) {
            first = newLink;        //первый эл = новому
        } else {
            privios.next = newLink;   //старое знач = новому
        }
        newLink.next = current;     //а новому в поле next задаем старое знач 1-го эл
    }

    public Link2 deleteFirst() {
        Link2 temp = first;
        first = first.next;    //first = ссылка на второй эл списка
        return temp;          //ссылка на удаленный эл
    }

    public void displayLink() {
        System.out.print("List (first-->last):");
        //с 1-го эл.!
        Link2 current = first;
        //пока не дойдет цикл до конца
        while (current != null) {
            current.displayLink2();   //вывод эл
            current = current.next;            //переход на сл эл
        }
        System.out.println("");
    }
}
