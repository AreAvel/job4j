package ru.job4j.calculator;
/**
 *class Calculator: add, subtract, div, multiple.
 * @author Nikolay Tkachenko(tomail:Tkach1702@mail.ru).
 * @version $Id$.
 * since 1.0.
 */
public class Calculator {
    double result;
    /**
     * add.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * subtract.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    /**
     * div.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     * multiple.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    /**
     * get result.
     */
    public double getResult() {
        return this.result;
    }
}

