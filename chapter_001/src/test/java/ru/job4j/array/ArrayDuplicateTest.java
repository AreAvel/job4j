package ru.job4j.array;

import org.hamcrest.collection.IsArrayContainingInAnyOrder;
import org.hamcrest.collection.IsArrayContainingInOrder;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate array = new ArrayDuplicate();
        String[] input = {"Привет", "Привет", "Я", "Привет", "Я", "Это", "Это"};
        String[] result = array.remove(input);
        String[] expect = {"Привет", "Это", "Я"};

        assertThat(result, is(expect));
    }
}
