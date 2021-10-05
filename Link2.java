/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Основной конструктор для двустороннего списка
 *  Last modified:     October 05, 2021
 **************************************************************************** */
class Link2 {
    public long dData;  //данные
    public Link2 next;   //следуюущие эл в списке

    public Link2(long dd) {
        dData = dd;
    }

    public void displayLink2() {
        System.out.print(" " + dData + " ");
    }


}
