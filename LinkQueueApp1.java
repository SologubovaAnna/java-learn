/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Класс main для очереди в 2-стороннем списке
 * Конструктор для двустороннего списка
 * Обращается к основному Link2()
 *  Last modified:     October 05, 2021
 **************************************************************************** */
class LinkQueueApp1 {
    public static void main(String[] args) {
        LinkQueue1 theList = new LinkQueue1();
        theList.insertLastQueue(20);
        theList.insertLastQueue(50);

        theList.displayLinkQueue();
        theList.insertLastQueue(200);
        theList.insertLastQueue(500);
        theList.displayLinkQueue();

        theList.deleteFirstQueue();
        theList.deleteFirstQueue();

        theList.displayLinkQueue();
    }
}
