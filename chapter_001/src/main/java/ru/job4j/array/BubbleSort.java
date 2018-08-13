package ru.job4j.array;

/**
 * class BybbleSort
 * @author Nikolay Tkachenko (mailto: Tkach1702@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class BubbleSort {
    /**
     * sort - bubble sorting
     * @param array
     * @return array
     */
    public int[] sort(int[] array) {
        int temp;
        for (int j = 0; j != (array.length - 1); j++) {
            for (int i = 0; i != (array.length - 1); i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}