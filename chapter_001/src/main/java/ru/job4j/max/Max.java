package ru.job4j.max;

/**
*class Max.
*@author Nikolay Tkachenko (mailto:Tkach1702@mail.ru)
*@version $Id$
*@since 0.1
*/
public class Max {
	/**
	*@param first.
    *@param second.
	*@return maximum.
	*/
	public int max(int first, int second) {
		return (first > second ? first : second);
	}
	/**
	*@param first.
	*@param second.
	*@param third.
	*@return temp.
	*/
	public int max(int first, int second, int third) {
		//int temp = this.max(first, second);		
		//temp = this.max(temp, third);
		return this.max(this.max(first, second), third);
	}
}