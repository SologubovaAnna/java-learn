/*
Из двумерного массива в 1 мерный и сортировка от меньшего к большему.
 */

import java.util.*;

public class SortArrayInt {

    public static int[] flattenAndSort(int[][] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[j].length; i++) {
                list.add(array[j][i]);
            }
        }
        int[] intArr = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            intArr[j] = list.get(j);
            // System.out.println(intArr[j]);

        }

        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        return intArr;
    }

    public static void main(String[] args) {
        SortArrayInt x = new SortArrayInt();
        int[][] arr = new int[][]{{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}};
        x.flattenAndSort(arr);
    }

}

