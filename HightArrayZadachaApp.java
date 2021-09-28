/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор Класс массива с высокоуровневым интерфейсом
 * getMax(), который возвращает наибольшее значение ключа в массиве или –1, если
массив пуст
 *  Last modified:     September 14, 2021
 **************************************************************************** */
class HightArrayZadachaApp {
    public static void main(String[] args) {
        int max = 100;
        HightArrayZadacha arr;
        arr = new HightArrayZadacha(max);

        arr.insert(5);
        arr.insert(8);
        arr.insert(77);
        arr.insert(105);
        arr.insert(57);
        arr.insert(88);
        arr.insert(99);
        arr.insert(71);
        arr.insert(22);
        arr.insert(33);


        arr.display();

        arr.getMax();

        arr.display();

        arr.delete(105);

        arr.display();

        arr.getMax();

        int s = 77;
        arr.find(s);
        

    }
}
