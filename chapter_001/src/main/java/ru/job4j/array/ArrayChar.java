package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }
    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        // проверить. что массив data имеет первые элементы одинаковые с value
        //проверяем что исходный массив больше или равен префикса
        if (data.length >= value.length) {
            for (int i = 0; i != value.length; i++) {
                if (data[i] != value[i]) {
                    result = false;
                }
            }
        }
        return result;
    }
}
