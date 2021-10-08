/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор итератора.
 * и связанные список Link2
 *  Last modified:     October 05, 2021
 **************************************************************************** */
class ListIterator {
    private Link2 current; //текущий эл
    private Link2 previos; //предыдущий эл
    private LinkListIterator ourList;  //связанный список

    public ListIterator(LinkListIterator list) {
        ourList = list;
        reset();                       //метод ниже. Возврат в 1-му эл списка
    }

    //возврат к first
    public void reset() {
        current = ourList.getFirst();  //getFirst() - в LinkListIterator. получение первого эл.
        previos = null;    //помним что когда 1 эл в списке то предыдущий всегда 0
    }

    //true если текущий эл является последним эл в списке
    public boolean atEnd() {
        return (current.next == null);   //помним что последний эл в списке всегда ведет на 0
    }

    //переход на сл элемент списка
    public void nextLink() {
        previos = current;     //предыдущий тогда = текущему эл
        current = current.next;   //текущ эл = следующему в списке
    }

    //Получение текущего эл. Обратить внимание тип Link2
    public Link2 getCurrent() {
        return current;
    }

    //Вставка эл после текущего эл
    public void insertAfter(long dd) {
        //создаем список
        Link2 newLink = new Link2(dd);
        //если пустой список
        if (ourList.isEmpty()) {
            //1-й эл списка newLink
            ourList.setFirst(newLink);
            //текущ эл = получ ссылку newLink
            current = newLink;
        } else {   //если не пустой список
            newLink.next = current.next;  //в этом списке next = текущий next
            current.next = newLink;       //текущий Next = новый список (dd)
            nextLink();   //переход к новому эл. Метод выше тут.
        }
    }

    //вставка эл перед текущ эл
    public void insertBefore(long dd) {
        //создаем список
        Link2 newLink = new Link2(dd);
        if (previos == null) {  //предыдущ эл = 0, т.е. в начале списка или пустой список
            newLink.next = ourList.getFirst();   //текущий список = список.метод получение 1-го эл списка
            ourList.setFirst(newLink);     //наш список присваивает знач эл newLink(dd) метод присвоения в LinkListIterator
            reset();   //метод выше тут. Возвращает на first
        } else {    //не в начале списка
            newLink.next = previos.next;   //newLink(dd) след эл = предыдущему.следующему
            previos.next = newLink;      //предыдущий.след-ий  = текущему эл
            current = newLink;          // текущий эл = текущему dd
        }
    }

    //удаление текущего эл-та
    public long deleteCurrent() {
        long value = current.dData;   //значение удаляемое = текущему эл-ту из конструктора списка dData
        //если в нач списка
        if (previos == null) {
            ourList.setFirst(current.next);   //наш список.метод присвоения первго эл (текущий next)
            reset();    //возврат к 1 эл-ту
        } else {   //если не в начале списка
            previos.next = current.next;    //предыдущий next = текущему next
            if (atEnd()) {  //если текущий эл является последним эл в списке
                reset();   //вернуться к 1-му эл-ту
            } else {    //если не последний эл
                current = current.next;    //текущий эл = текущему next
            }
        }
        return value;  //возвращаем удаляемое значение эл
    }
}
