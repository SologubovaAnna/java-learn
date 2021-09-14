/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Класс массива с низкоуровневым интерфейсом
 *  Last modified:     September 14, 2021
 **************************************************************************** */
public class LowArray {
    private long[] a;   //ссылка на массив

    public LowArray(int size) { //конструктор
        a = new long[size];
    }

    public void setElem(int index, long value) {  //запись элемента
        a[index] = value;
    }

    public long getElem(int index) {   //чтение элемента
        return a[index];

    }
}
