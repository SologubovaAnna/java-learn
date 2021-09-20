/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор сортировки (от А до Я) для Person.java\
 * Сортировка вставкой
 *  Last modified:     September 14, 2021
 * Запуск программы: java ObjectSortApp
 **************************************************************************** */
class ArrayInOb {
    private Person[] a;   // Ссылка на массив a
    private int nElems;   //кол-во эл

    public ArrayInOb(int max) {   //конструктор
        a = new Person[max];  //создать массив
        nElems = 0;
    }

    //включение записи в массив
    public void insert(String lastName, String firstName, int age) {
        a[nElems] = new Person(lastName, firstName, age);
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            a[j].displayPersons();
        }
        System.out.println(" ");
    }

    public void insertionSort() {
        int in, out;
        for (out = 1; out < nElems; out++) {  //out - разделительный маркер
            Person temp = a[out];            //скопировать помеченный элемент
            in = out;                  //начать перемещения с out
            //пока не найдень наименьший элемент
            while (in > 0 && a[in - 1].getLast().compareTo(temp.getLast()) > 0) {
                a[in] = a[in - 1];    //сдвинуть эл. в право
                --in;                 // перейти на одну позицию влево
            }
            a[in] = temp;    //вставить помеченный эл.
        }
    }
}
