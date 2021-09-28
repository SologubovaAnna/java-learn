/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор Класс массива с высокоуровневым интерфейсом
 * getMax(), который возвращает наибольшее значение ключа в массиве или –1, если
 * массив пуст
 * arrt - новый массив, в который вставляются отсортированные эл-ты от max до min
 * removeMax(); - отвечает за сортироку.
 * т.е. в цикле for loop массива arr вставляем max эл. в массив arrt и удаляем эл из массива arr
 * и так пока элементов в массиве arr не будет
 * получается что отсортированные эл сохраняться в масссиве arrt
 *  Last modified:     September 14, 2021
 **************************************************************************** */
class HightArrayZadachaApp {
    public static void main(String[] args) {
        int max = 11;
        HightArrayZadacha arr, arrt;
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

        //   arr.display();

        // arr.delete(5);

        //arr.display();

        //  arr.getMax();

        int s = 77;
        arr.find(s);

        //   arr.removeMax();
        //  arr.display();
        //arr.delete(99);
        //  arr.getMax();
        //   arr.display();


        int m = 100;
        arrt = new HightArrayZadacha(m);
        for (int j = 0; j < max; j++) {

            arrt.insert(arr.getMax());
            arr.removeMax();

        }
        arrt.display();


    }
}
