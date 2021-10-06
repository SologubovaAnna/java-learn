/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор для двустороннего списка
 * Основной конструктор Link2
 *  Last modified:     October 06, 2021
 **************************************************************************** */
class LinkList2 {
    private Link2 first;

    public LinkList2() {
        first = null;  //пока нет эл в списке
    }

    //возвращ true если пустой список
    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(long d) {
        Link2 newLink = new Link2(d);
        newLink.next = first;
        first = newLink;
    }

    public long deleteFirst() {
        Link2 temp = first;
        first = first.next;
        return temp.dData;
    }

    public void displayList() {
        Link2 current = first;
        while (current != null) {
            current.displayLink2();
            current = current.next;
        }
        System.out.println(" ");
    }
}
