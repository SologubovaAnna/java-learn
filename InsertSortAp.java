/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Класс main для ArraysIns.java где сортировка методом вставки
 *  Last modified:     September 14, 2021
 **************************************************************************** */
class InsertSortAp {
    public static void main(String[] args) {
        int maxSize = 100;          //кол-во элементов всего
        ArrayIns arr;              //ссылка на массив
        arr = new ArrayIns(maxSize);        //создание массива

        //вставка в массив
        arr.insert(77);
        arr.insert(88);
        arr.insert(66);
        arr.insert(55);
        arr.insert(44);
        arr.insert(33);
        arr.insert(22);
        arr.insert(11);
        arr.insert(00);
        arr.insert(99);
        arr.display();
        arr.insertionSort();
        arr.display();

    }
}
