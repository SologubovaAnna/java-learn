/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Решение головоломки "Ханойская башня"
 * Перекладываение дисков с одного стержня на другой при условии что
 * больший диск ложить на нижний нельзя
 * Запуск программы: C>java TowersApp
 * Работа с классом упорядоченного массива
 *  Last modified:     October 18, 2021
 **************************************************************************** */
class TowersApp {
    static int nDisk = 4;

    public static void main(String[] args) {
        doTowers(nDisk, 'A', 'B', 'C');
    }

    public static void doTowers(int nD, char from, char inter, char to) {
        if (nD == 1) {
            System.out.print("\nDisk 1 from " + from + " to " + to);
        } else {
            doTowers(nD - 1, from, to, inter);  //from -->inter
            System.out.print("\nDisk " + nD + " from " + from + " to " + to);
            doTowers(nD - 1, inter, from, to);  //from -->to
        }

    }

}
