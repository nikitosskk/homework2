package org.example;

import com.example.componentpattern.Component;
import com.example.componentpattern.Composite;
import com.example.componentpattern.Leaf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComponentPatternTest {

    @Test
    void testLeafOperation() {
        Component leaf = new Leaf("A");
        assertEquals("Leaf A", leaf.operation());
    }

    @Test
    void testCompositeOperation() {
        Component composite = new Composite("X");
        composite.add(new Leaf("B"));
        composite.add(new Leaf("C"));
        String expectedResult =
                "Composite X\n" +
                        "Leaf B\n" +
                        "Leaf C";
        assertEquals(expectedResult, composite.operation());
    }

    // Другие тесты...
}