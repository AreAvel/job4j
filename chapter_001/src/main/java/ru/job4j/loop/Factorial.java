package ru.job4j.loop;
/**
*class Factorial - вычисление факториала
*@author Nikolay Tkachenko (mailto: Tkach1702@mail.ru).
*@version $Id$.
*@since 0.1.
*/
public class Factorial {
	/**
	*calc - вычисление факториала.
	*@param n.  
	*@return result.
	*/
	public int calc(int n) {
		int result = 1;
		for (int i = 1; i < n + 1; i++) {
			result = result * i;			
		}
		return result;
	}
}