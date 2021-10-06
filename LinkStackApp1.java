/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Класс main для стека
 * Конструктор для двустороннего списка
 *  Last modified:     October 06, 2021
 **************************************************************************** */

class LinkStackApp1 {
    public static void main(String[] args) {
        LinkStack1 theStack = new LinkStack1();
        theStack.push(20);
        theStack.push(50);
        theStack.displayStakLink();
        theStack.push(200);
        theStack.push(500);
        theStack.displayStakLink();
        theStack.pop();
        theStack.pop();
        theStack.displayStakLink();

    }
}
