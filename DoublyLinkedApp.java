/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Класс main для двусвязного списка
 * Основной конструктор Link2Svaz и конструктор DoublyLinkedList
 *  Last modified:     October 07, 2021
 ****************************************************************************/
class DoublyLinkedApp {
    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();
        theList.insertFirst(22);
        theList.insertFirst(11);
        theList.insertFirst(55);
        theList.insertFirst(88);

        theList.inswertLast(99);
        theList.inswertLast(100);
        theList.inswertLast(200);
        theList.inswertLast(7);

        theList.displayForward();   //показать в прямом порядке

        theList.displayBackward();   //показать в обратном порядке

        theList.deleteFirst();     //удаление из прямого порядка

        theList.displayForward();

        theList.deleteLast();

        theList.displayForward();

        theList.insertAfter(999, 200);

        theList.displayForward();

        theList.insertAfter(9, 11);

        theList.displayForward();

        theList.deleteKey(99);

        theList.displayForward();


    }
}
