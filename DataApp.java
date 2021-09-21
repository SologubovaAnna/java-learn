/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * база данных типа метод main
 *Last modified:September 16,2021
 *Запуск программы:C>java ClassDataApp
 *****************************************************************************/

class DataApp {
    public static void main(String[] args) {
        int maxSize = 100;    //размер массива
        DataArray arr;      //ссылка на массив конструкор DataArray.java
        arr = new DataArray(maxSize);  //создание массива

        //вставка 10 элементов
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);

        //вывод
        arr.displayA();

        //поиск
        String seachKey = "Lamarque";  //поиск элемента Lamarque
        Person found;                //указание переменной обращаясь к Person
        found = arr.find(seachKey);  // found = моссиву с методом DataArray.java Person find
        if (found != null) {  //если вернуло не null то нашли
            System.out.print("\n Found ");
            found.displayPersons(); //выводим имя обращаясь к методу  displayPersons() из Person.java
        } else {
            System.out.println("\n Not found: " + seachKey);
        }

        //удаление 3 эелементов
        System.out.println("\nDeleting Smith, Yee4, and Creswell");
        arr.delete("Smith");
        arr.delete("Yee4");
        arr.delete("Creswell");

        //снова вывод элементов
        arr.displayA();

    }
}
