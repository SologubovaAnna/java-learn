/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор2 для простого связанного списка
 * ссылается на основной конструктор Link
 *  Last modified:     October 05, 2021
 **************************************************************************** */
class LinkList {
    //ссылка на первый эл в списке
    private Link first;

    public LinkList() { //конструктор
        first = null;   //список пока не содержит эл-тов
    }

    public boolean isEmpty() {    //если пустой список вернуть true
        return (first == null);
    }

    //вставка эл в начало списка
    public void insertFirst(int id, double dd) {
        //создание нового эл
        Link newLink = new Link(id, dd);
        //newLink --> старое значение
        newLink.next = first;
        //first --> newLink
        first = newLink;
    }

    //поиск эл по ключу
    public Link find(int key) {
        Link current = first;  //начиная с первого эл
        while (current.iData != key) {   //пока ключ не найден
            if (current.next == null) {   //если дошел цикл до последнего эл
                return null;              //то вернуть 0
            } else {
                current = current.next;  //если не дошел до последнего эл
                // перейти к следующему
            }
        }
        return current;         //совпадение найдено

    }

    //удаление эл из списка пол ключу
    public Link delete(int key) {
        //поиск эл
        Link current = first;  //текущ эл
        Link previous = first;  //предыдущий эл
        while (current.iData != key) {  //пока эл не равен ключу
            if (current.next == null) {  //если цикл дошел до последнего эл
                return null;            //эл не найден
            } else {
                // previous ссылается на предшествующий current
                previous = current;     //перейти к следующ. эл
                //current ссылается на следующий current
                current = current.next;
            }

        }        //совпадение найдено
        if (current == first) {
            first = first.next;  //то заменить первый эл на следующий
        } else {
            //предыдущий эл связать со следующими удаляя\обходя текущий
            previous.next = current.next;   //обойти его в списке
        }
        return current;         //вернуть удал эл


    }

    //удаление первого эл из списка
    public Link deleteFirst() {
        //сохраним ссылку на удал эл
        Link temp = first;
        //удаление
        first = first.next;
        //вернем ссылку на удал эл
        return temp;
    }

    public void displayList() {
        System.out.print("List (first --> last): ");
        //от начала списка:
        Link current = first;
        while (current != null) {
            //вывод эл
            current.displayLink();
            //переход к новому эл в списке
            current = current.next;
        }
        System.out.println("");

    }
}
