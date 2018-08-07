package ru.job4j.converter;
/**
 *class Converter: converter currency.
 * @author Nikolay Tkachenko(tomail:Tkach1702@mail.ru).
 * @version $Id$.
 * since 1.0.
 */
public class Converter {
    /**
     * Convert rubles into evro.
     * @param value rubles.
     * @return evro.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }
    /**
     * Convert rubles into dollars.
     * @param value rubles.
     * @return dollars.
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }
    /**
     * Convert evro into rubels
     * @param value evro.
     * @return rubels.
     */
    public int evroToRubels(int value) {
        return value * 70;
    }
    /**
     * Convert dollars into rubels
     * @param value dollars.
     * @return rubels.
     */
    public int dollarsToRubels(int value) {
        return value * 60;
    }
}