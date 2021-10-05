/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Класс Main для двустороннего списка
 * Обращается к основному Link2()
 *  Last modified:     October 05, 2021
 **************************************************************************** */
class FirstLastApp {
    public static void main(String[] args) {
        //создание нового списка
        FirstLastList theList = new FirstLastList();

        //вставка в начало списка
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(11);
        theList.insertFirst(88);

        theList.displayList();

        //вставка в конец списка
        theList.insertLast(555);
        theList.insertLast(444);
        theList.insertLast(999);
        theList.insertLast(333);

        theList.displayList();

        //удалим 2 эл
        theList.deleteFirst();
        theList.deleteFirst();

        theList.displayList();


    }
}
