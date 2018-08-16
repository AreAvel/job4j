package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate array = new ArrayDuplicate();
        String[] input = new String[] {"Привет", "Привет", "Я", "Привет", "Я", "Это", "Это"};
        String[] result = array.remove(input);
        String[] expect = new String[] {"Привет", "Это", "Я"};

        for (int i = 0; i != result.length; i++) {
            System.out.println(result[i]);
        }

        assertThat(result, is(expect));
    }
}
