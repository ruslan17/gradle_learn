package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class ListTest {

    List<String> listA = List.of(
        "A",
        "B"
    );

    List<String> listB = List.of(
        "B",
        "A"
    );

    @Test
    void testUsingJUnit() {

        boolean areListsEqual = listA.size() == listB.size() && listA.containsAll(listB);
        assertEquals(true, areListsEqual);
    }

    @Test
    void testUsingAssertJ() {

        // игнорирует дубликаты
        assertThat(listA)
            .hasSameElementsAs(listB);

        // учитывает дубликаты
        assertThat(listA)
            .containsExactlyInAnyOrderElementsOf(listB);
    }

}
