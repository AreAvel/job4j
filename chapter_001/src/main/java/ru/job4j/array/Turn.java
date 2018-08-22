package ru.job4j.array;
/**
*class Turn
*@author Nikolay Tkachenko (mailto: Tkach1702@mail.ru)
*@version $Id$
*@since 0.1
*/
public class Turn {
	/**
	*turn переворот массива.
	*@param array source array
	*@return array
	*/
    public int[] back(int[] array) {
		for (int index = 0; index != array.length / 2; index++) {
			int temp = array[index];
			array[index] = array[array.length - (index + 1)];
			array[array.length - (index + 1)] = temp;	
		}
        return array;
    }
}