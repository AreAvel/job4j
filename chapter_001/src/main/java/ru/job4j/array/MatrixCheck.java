package ru.job4j.array;

/**
 * class MatrixCheck
 *@author Nikolay Tkachenko (mailto: Tkach1702@mail.ru)
 *@version $Id$
 *@since 0.1
 */
public class MatrixCheck {
    /**
     * mono
     * @param data
     * @return result
     */
    public boolean mono(boolean[][] data) {
        boolean result = false;
        for (int i = 0; i < data.length; i++) {
            if (data[0][0] != data[i][i]) {
                return result;
            }
            if (data[0][data.length - 1] != data[i][data.length - i - 1]) {
                return result;
            }
        }
        //пересечение диагоналей
        if (data.length % 2 != 0) {
            if (data [0][0] != data [0][data.length - 1]) {
                return result;
            }
        }
        result = true;
        return result;
    }
}
