package ru.job4j.array;

/**
*class Square.
*@author Nikolay Tkachenko (mailto: Tkach1702@mail.ru).
*@version $Id$.
*@since 0.1.
*/
public class Square {
	/**
	*calculate - массив заполняется числами, возведенными в квадрат.
	*@param bound
	*@return rst.
	*/
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
			for (int i = 0; i != bound; i++) {	
				rst[i] = (int) Math.pow((i + 1), 2);
			}
        return rst;
    }
}