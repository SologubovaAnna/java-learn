/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор для двустороннего списка
 * Обращается к основному Link2()
 *  Last modified:     October 05, 2021
 **************************************************************************** */
class FirstLastList {
    private Link2 first;  //первый эл
    private Link2 last;   //последний эл

    public FirstLastList() {
        //пока список не содержит эл-тов
        first = null;
        last = null;
    }

    //True если список пуст
    public boolean isEmpti() {
        return first == null;
    }

    //вставка эл в начало списка
    public void insertFirst(long d) {
        //создаем новый эл
        Link2 newLink = new Link2(d);
        //если список пуст
        if (isEmpti()) {
            //newLink <-- last
            last = newLink;
        }
        //newLink --> старое знач first
        newLink.next = first;
        //first --> newLink
        first = newLink;

    }

    //вставка эл в конец списка
    public void insertLast(long d) {
        //создаем новый эл
        Link2 newLink = new Link2(d);
        if (isEmpti()) {
            //first --> newLink
            first = newLink;
        } else {
            //last --> старое знач newLink
            last.next = newLink;
            //newLink <-- last
            last = newLink;
        }
    }

    public long deleteFirst() {
        long temp = first.dData;
        if (first.next != null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link2 current = first;
        while (current != null) {
            current.displayLink2();
            current = current.next;
        }
        System.out.print("");

    }
}
