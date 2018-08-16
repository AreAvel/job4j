package ru.job4j.array;

import java.util.Arrays;

/**
 * class ArrayDuplicate - удаление копий из массива
 * @author Nikolay Tkachenko (mailto: Tkach1702@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - counter; j++) {
                if (array[i].equals(array[j])) {
                    while ((j != array.length - counter - 1)
                            && array[array.length - counter - 1].equals(array[j])) {
                        counter++;
                    }
                    String temp = array[array.length - counter - 1];
                    array[array.length - counter - 1] = array[j];
                    array[j] = temp;
                    counter++;
                }
            }
        }
        return Arrays.copyOf(array, array.length - counter);
    }
}