/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Класс Main для простого связанного списка
 * ссылается на основной конструктор Link при удалении
 * При создании списка, вставки эл и вывод ссылается на конструктор LinkList
 *  Last modified:     October 05, 2021
 **************************************************************************/
class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();  //создание нового списка
        //ввод эл в список
        theList.insertFirst(1, 25.99);
        theList.insertFirst(4, 5.79);
        theList.insertFirst(3, 2.00);
        theList.insertFirst(2, 8.9);
        //вывод списка на экран эл
        theList.displayList();
        //удаление c первого эл пока список не опустеет
        while (!theList.isEmpty()) {
            Link aLink = theList.deleteFirst();  //удаление эл
            //вывод удаленного эл
            System.out.print("Deleted: ");
            //обращ к основному конструктору Link
            aLink.displayLink();
            System.out.println("");
        }
        //вывод списка
        theList.displayList();

        //вставка эл
        theList.insertFirst(44, 25.99);
        theList.insertFirst(11, 55.79);
        theList.insertFirst(22, 75.9);
        theList.insertFirst(88, 105.989);

        //вывод списка
        theList.displayList();

        //поиск
        Link n = theList.find(88);
        if (n != null) {
            System.out.print("Find: " + n.iData);
        } else {
            System.out.print("Can`t find.");
        }


        //удаление
        Link del = theList.delete(22);
        if (del != null) {
            System.out.print("Delete: " + del.iData);
        } else {
            System.out.print("Not delete.");
        }

        //вывод списка
        theList.displayList();
    }
}
