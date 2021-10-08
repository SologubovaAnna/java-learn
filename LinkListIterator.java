/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор для элементов связанного списка с итератором
 *  Last modified:     October 05, 2021
 **************************************************************************** */
class LinkListIterator {
    private Link2 first;

    public LinkListIterator() {
        first = null;   //пока список пуст
    }

    //получение 1-го эл из списка
    public Link2 getFirst() {
        return first;
    }

    //присвоение нового значения для first
    public void setFirst(Link2 f) {
        first = f;
    }

    //true если пустой список
    public boolean isEmpty() {
        return first == null;
    }

    //получение итератора
    public ListIterator getIterator() {
        //ИНИЦИАЛИЗАЦИЯ СПИСКОМ THIS
        return new ListIterator(this);
    }

    //вывод
    public void displayList() {
        Link2 current = first;
        while (current != null) {
            current.displayLink2();
            current.next;
        }
        System.out.println(" ");
    }

}
