package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryRepresentationTest {

    private static final int NUM = 1000;

    @Test
    void intToBinary() {
        String result = BinaryRepresentation.intToBinary(NUM);

        Assertions.assertEquals(result, Integer.toBinaryString(NUM));
    }
}