/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор для стека
 * Конструктор для двустороннего списка LinkList2
 *  Last modified:     October 06, 2021
 **************************************************************************** */

class LinkStack1 {
    private LinkList2 theStack;

    public LinkStack1() {
        theStack = new LinkList2();
    }
    //размещение эл на вершине

    public void push(long j) {
        theStack.insertFirst(j);
    }

    //извлечение с вершины (т.е. удаление )
    public long pop() {
        return theStack.deleteFirst();
    }

    //если стек пустой то true
    public boolean isEmpty() {
        return (theStack.isEmpty());
    }

    public void displayStakLink() {
        System.out.print("Stack (top --> bottom):");
        theStack.displayList();
    }

}
