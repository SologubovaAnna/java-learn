/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Основной конструктор класс Link для простого связанного списка
 *  Last modified:     October 05, 2021
 **************************************************************************** */
class Link {
    public int iData;    //данные ключ
    public double dData;  //данные
    public Link next;     //следующий элемент в списке

    public Link(int id, double dd) {  //конструктор
        //инициализация данных
        //next присваивается автоматом значение null
        iData = id;
        dData = dd;
    }

    //вывод содержимого
    public void displayLink() {
        System.out.print("{" + iData + ". " + dData + "}");
    }

}
