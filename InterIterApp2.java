/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Удаляет элементы кратные 3 в списке с помощью итератора
 * Класс  main итератор в связанном списке
 * Использует LinkListIterator для создание списка
 * и ListIterator для создания итератора
 *  Last modified:     October 05, 2021
 **************************************************************************** */
class InterIterApp2 {
    public static void main(String[] args) {
        LinkListIterator theList = new LinkListIterator();  //создание списка
        ListIterator iter1 = theList.getIterator();  //создание итератора
        //вставка эл в список
        iter1.insertAfter(10);
        iter1.insertAfter(30);
        iter1.insertAfter(40);
        iter1.insertAfter(45);
        //вывод
        theList.displayList();
        //итератор начнем с 1-го эл
        iter1.reset();
        //получ текущ эл
        Link2 aLink = iter1.getCurrent();
        //если эл кратен 3
        if (aLink.dData % 3 == 0) {
            //эл удаляется
            iter1.deleteCurrent();
        }
        //пока есть эл-ты т.е. пока последний эл не ссылается на 0 след.эл
        while (!iter1.atEnd()) {
            iter1.nextLink();  //переход на сл эл-т
            aLink = iter1.getCurrent(); //получ текущ эл
            if (aLink.dData % 3 == 0) {   //если эл кратен 3
                iter1.deleteCurrent();  //удаляем текущий
            }
        }
        theList.displayList();  //вывод списка


    }
}
