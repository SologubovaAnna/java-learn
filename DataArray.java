/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Объекты как элементы данных
 *  Last modified:     September 16, 2021
 * Запуск программы: C>java DataApp
 **************************************************************************** */
class DataArray {
    private Person[] a;   //ссылка на массив Person.java
    private int nElems;   //кол-во элементов вмассиве

    public DataArray(int max) {    //конструктор
        a = new Person[max];         //создание массива
        nElems = 0;                 //длина массива =0 пока
    }

    //поиск элементов в массиве
    public Person find(String searchName) {     //обращаемся к Person.java
        int j;
        for (j = 0; j < nElems; j++) {   //для каждого элемента в массиве
            if (a[j].getLast().equals(searchName)) {  //если элемент полученный в Person.java==searchName который ищем
                break;    //выводим из цыкла, нашли же
            }
        }
        if (j == nElems) {   //цикл дошел до последнего элемента?
            return null;     //возвращаем ноль. Не нашли
        } else {
            return a[j];    //нашли возвращаем элемент найденный
        }
    }

    //включение записи в моссив
    public void insert(String last, String first, int age) {
        a[nElems] = new Person(last, first, age);  // указываем длину моссива = вносимым элементам моссива Person.java
        nElems++;    //увеличение размера массива
    }

    //Удаление элеммента из моссива
    public boolean delete(String searchName) {
        int j;
        for (j = 0; j < nElems; j++) {    //для каждого элемента
            if (a[j].getLast().equals(searchName)) {  //если искомое(удаляемое) == эл в массиве Person.java метод getLast()
                break;    //выходим из цикла нашли значит
            }
        }
        if (j == nElems) {  //цикл дошел до последнего элемента
            System.out.println("\n Not found delete: " + searchName);
            return false;   // нет удаляемого эдемента значит ложь
        } else {    //  есть удаляемый элемент
            System.out.println("\n Delete: " + searchName);
            for (int k = j; k < nElems; k++) {  //сдиваем последующие элементы
                a[k] = a[k + 1];
            }
            nElems--;   //уменьшаем размер моссива
            return true;  //возвращаем правда т.к. нашли и сместили(удалили)
        }
    }

    //вывод элементов
    public void displayA() {
        for (int j = 0; j < nElems; j++) {  //для каждого элемента
            a[j].displayPersons();       //выводим все элементы обращась к конструктору Person.java метод displayPersons()
        }
    }
}
