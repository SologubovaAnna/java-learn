/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор для элементов связанного списка с итератором
 *  Last modified:     October 08, 2021
 **************************************************************************** */

class LinkListIterator {
    private Link2 first;

    public LinkListIterator() {
        first = null;   //пока список пуст
    }

    //получение 1-го эл из списка
    public Link2 getFirst() {
        return first;    //вернуть first
    }

    //присвоение нового значения для first
    public void setFirst(Link2 f) {
        first = f;    //first = знач.
    }

    //true если пустой список
    public boolean isEmpty() {
        return first == null;   //первый эл = 0
    }

    //получение итератора
    public ListIterator getIterator() {
        //инициализация списком (this)
        return new ListIterator(this);
    }

    //вывод
    public void displayList() {
        Link2 current = first;   //список текущ знач = 1 эл., т.е. начинаем с начала
        while (current != null) {  // пока текущее значен не = 0
            current.displayLink2();  //текущее значение выводится на дисплей при помощи метода в Link2
            current = current.next;   //текущее знач = старому от текущего next
        }
        System.out.println(" ");
    }

}
