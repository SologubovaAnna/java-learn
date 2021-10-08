/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор элементов для двусвязного списка
 * Основной конструктор Link2Svaz
 *  Last modified:     October 07, 2021
 ****************************************************************************/

class DoublyLinkedList {
    private Link2Svaz first;   //1-й эл
    private Link2Svaz last;    //последний эл

    //конструктор списка
    public DoublyLinkedList() {
        //пока список пуст
        first = null;
        last = null;
    }

    //если пустой список то true
    public boolean isEmpty() {
        return (first == null);
    }

    // вставка эл вперед
    public void insertFirst(long dd) {
        //создаем новый эл
        Link2Svaz newLink = new Link2Svaz(dd);
        if (isEmpty()) {  //если список не содержит элементов
            last = newLink;  //прошлый эл == новому эл
        } else {
            first.previos = newLink;   //старое значение firts = новому эл
        }
        newLink.next = first; //новый эл next=старому 1 эл-ту
        first = newLink;      //1 эл = новому эл
    }

    //вставка эл в конец
    public void inswertLast(long dd) {
        //создаем новый обЪект в списке
        Link2Svaz newLink = new Link2Svaz(dd);
        //если список пуст
        if (isEmpty()) {
            //1-й эл = новому объекту
            first = newLink;
        } else {   //если не пустой
            last.next = newLink;   //старый next = новому объекту
            newLink.previos = last; // новый объек для ссылки предыдушего = старая ссылка на последний объект
        }
        last = newLink;   //меняем ссылку в последнем объекте на новый объект
    }

    //удаление 1-го эл
    public Link2Svaz deleteFirst() {
        Link2Svaz temp = first;
        //если только 1 эл
        if (first.next == null) {
            //последний эл = null
            last = null;    //последний эл == null
        } else { //если ни 1 эл а много
            //1 предыдущий эл в поле next = null
            first.next.previos = null;
        }
        //первый эл = 1 эл поле next
        first = first.next;
        return temp;
    }

    //удалить эл в конце списка
    public Link2Svaz deleteLast() {
        Link2Svaz temp = last;
        //если в 1 эл поле next = 0 в списке, т.е. 1 эл в списке
        if (first.next == null) {
            //1 эл == 0
            first = null;
        } else {  //если больше чем 1 эл в списке
            //в последним эл в ссылке previos на эл next = 0
            last.previos.next = null;
        }
        //сейчас последний эл = старому значению эл предыдущего
        last = last.previos;
        return temp;
    }

    //вставка dd в позицию после key
    public boolean insertAfter(long dd, long key) {
        //предполагается что список не пуст
        //начинаем с начала с 1-го эл
        Link2Svaz current = first;
        //пока не будет найдено совпадение
        while (current.dData != key) {
            current = current.next;  //переход на новый эл
            if (current == null) {   //дошел цикл до конца?
                return false;     //эл не найден
            }
        }
        //создаем новый эл
        Link2Svaz newLink = new Link2Svaz(dd);
        //если последний эл в списке
        if (current == last) {
            newLink.next = null;    //объект newLink ссылка next =0
            last = newLink;       //старый последний эл = новому объекту
        } else {
            newLink.next = current.next;   //новый объект в ссылке next = старое значение next
            current.next.previos = newLink; //1-й эл в ссылке previos на next = новый эл
        }
        newLink.previos = current;   //новый объект в ссылке previos = старый 1-й эл.
        current.next = newLink;    //старое значение в 1 эл  = новый эл
        return true;              //ключ найден и вставка выполнена
    }

    //удаление с заданным ключом
    public Link2Svaz deleteKey(long key) {
        //от начала списка
        Link2Svaz current = first;
        //поиск по ключу в списке
        while (current.dData != key) {
            current = current.next;
            if (current == null) {
                return null;  //не найден key цикл прошел все эл
            }
        }  //ключ найден
        //это 1-й эл?
        if (current == first) {
            first = current.next; //1-й эл = следующему старому
        } else {   //не 1-й эл?
            current.previos.next = current.next;
        }
        //последний эл?
        if (current == last) {
            last = current.previos;
        } else {   //не последний эл?
            current.next.previos = current.previos;
        }
        return current;   //возвращаем удаленный эл.

    }

    //вывод1 с начала списка до конца
    public void displayForward() {
        System.out.print("List (first-->last): ");
        Link2Svaz current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    //вывод2 с конца списка в начало
    public void displayBackward() {
        System.out.print("List (last-->first): ");
        Link2Svaz current = last;
        while (current != null) {
            current.displayLink();
            current = current.previos;
        }
        System.out.println("");

    }
}
