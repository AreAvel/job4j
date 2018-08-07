package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

        /**
         *class CalculatorTest test add, test subtract,
         *@author Nikolay Tkachenko(tomail:Tkach1702@mail.ru).
         *@version $Id$.
         *since 1.0.
         */
        public class CalculatorTest {
            @Test
            public void whenAddOnePlusOneThenTwo() {
                Calculator calc = new Calculator();
                calc.add(1D, 1D);
                double result = calc.getResult();
                double expected = 2D;
                assertThat(result, is(expected));
            }
            @Test
            public void whenSubtractOneOnOneThen0() {
                Calculator calc = new Calculator();
                calc.subtract(1D, 1D);
                double result = calc.getResult();
                double expected = 0D;
                assertThat(result, is(expected));
            }
            @Test
            public void whenDiv10On5Then2() {
                Calculator calc = new Calculator();
                calc.div(10D, 5D);
                double result = calc.getResult();
                double expected = 2D;
                assertThat(result, is(expected));
            }
            @Test
            public  void whenMultiple5On5hen25() {
                Calculator calc = new Calculator();
                calc.multiple(5D, 5D);
                double result = calc.getResult();
                double expected = 25D;
                assertThat(result, is(expected));
            }
        }
