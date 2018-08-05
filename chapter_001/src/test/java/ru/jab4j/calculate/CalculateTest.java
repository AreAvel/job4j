package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Test.
*
*@author Nikolay Tkachenko (mailto:Tkach1702@mail.ru)
*@version $Id$
*@since 05.08.2018
*/

public class CalculateTest {
/**
*Test echo.
*/
@Test
    public void whenTakeNameThenTreeEchoPlusName() {
	String input = "Tkachenko Nikolay";
	String expect = "Echo, echo, echo: Tkachenko Nikolay";
	Calculate calc = new Calculate();
	String result = calc.echo(input);
	assertThat(result, is(expect));
	}
}
