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
        boolean result = true;
        boolean control0011 = data[0][0];
        boolean diagonal = data[0][data.length - 1];
        for (int i = 0; i != data.length; i++) {      //цикл по строкам
            for (int j = 0; j != data.length; j++) {  //цикл по столбцам
                //проверка диагонали 001122 (переменная control0011)
                if (j == i & control0011 != data[i][j]) {
                    result = false;
                    return result; //возвращаем значение false
                }
                //проверка обратной диагонали (diagonal)
                if (j == data.length - i - 1 & diagonal != data[i][j]) {
                    result = false;
                    return result; //возвращаем значение false
                }
            }
        }
        //пересечение диагоналей
        if (data.length % 2 != 0) {
            if (control0011 != diagonal) {
                return result; //возвращаем значение false
            }
        }
        return result; //возвращаем значение true
    }
}
