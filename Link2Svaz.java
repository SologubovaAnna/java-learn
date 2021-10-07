/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Основной конструктор для двусвязного списка
 *  Last modified:     October 07, 2021
 **************************************************************************** */
class Link2Svaz {
    public long dData;   //данные
    public Link2Svaz next;   //следующий эл
    public Link2Svaz previos;  //предыдущий эл

    public Link2Svaz(long n) {
        dData = n;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
