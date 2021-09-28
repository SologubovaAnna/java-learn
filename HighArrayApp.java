/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Объект класса HighArray
 *  Last modified:     September 14, 2021
 **************************************************************************** */

class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;      //размер массива
        HighArray arr;          //ссылка на моссив
        arr = new HighArray(maxSize);  //создание массива

        //вставка в массив элементов
        arr.insert(77);
        arr.insert(99);
        arr.insert(22);
        arr.insert(88);
        arr.insert(00);
        arr.insert(11);
        arr.insert(33);
        arr.insert(55);
        arr.insert(44);
        arr.insert(66);

        //вывод элементов
        arr.display();

        //поиск элементов
        int searchKey = 1;
        if (arr.find(searchKey)) {
            System.out.println("Found " + searchKey + " ");
        } else {
            System.out.println("Not found " + searchKey + " ");
        }

        //удаление элементов из массива
        arr.delete(00);
        arr.delete(55);
        arr.delete(100);

        //повторный вывод элементов
        arr.display();

    }
}
