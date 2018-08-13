package ru.job4j.array;
/**
*class Check
*@author Nikolay Tkachnko (mailto: Tkach1702@mail.ru).
*@version $Id$
*@since 0.1
*/
public class Check {
	/**
	*mono 
	*@param data
	*@return result
	*/
    public boolean mono(boolean[] data) {
        boolean result = true;
		boolean control = data[0];
        for (int i = 0; i != data.length; i++) {
			if (control != data[i]) {
				result = false;
				break; 
			}
        }
        return result;
    }
}