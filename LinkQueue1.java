/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор очереди в 2-стороннем списке
 * Конструктор для двустороннего списка
 * Обращается к основному Link2()
 *  Last modified:     October 05, 2021
 **************************************************************************** */
class LinkQueue1 {
    private FirstLastList theList;

    public LinkQueue1() {
        theList = new FirstLastList();  //создание 2-стороннего списка
    }

    public boolean isEmpty() {
        return theList.isEmpti();
    }

    //вставка в конец очереди
    public void insertLastQueue(long j) {
        theList.insertLast(j);
    }

    //удаление в нач очереди
    public void deleteFirstQueue() {
        theList.deleteFirst();
    }

    //вывод на экран
    public void displayLinkQueue() {
        System.out.print("Queue (front --> rear): ");
        theList.displayList();
    }


}
