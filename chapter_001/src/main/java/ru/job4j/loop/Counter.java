package ru.job4j.loop;
/** 
*class Counter. 
*@author Nikolay Tkachenko (mailto: Tkach1702@mailto).
*@version $Id$.
*@since 0.1.
*/
public class Counter {
	/**
	*add: сложение всех четных числе в заданном диапозоне
	*@param start.
	*@param finish.
	*@return result.
	*/
	public int add(int start, int finish) {
		int result = 0;
		for (; start < finish + 1; start++) {
			if (start % 2 == 0) {
				result = result + start;
			}
		}
		return result;
	}	
}