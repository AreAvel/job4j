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
     *@param array - source array
     *@return array
     */
    public int[] sort(int[] array) {
        int temp;
        for (int j = 1; j != array.length; j++) {
            for (int i = j; i >= 1 && array[i - 1] > array[i]; i--) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
            }
        }
        return array;
    }
}