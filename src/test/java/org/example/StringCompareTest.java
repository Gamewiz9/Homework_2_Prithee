package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompareTest {

    @Test
    void compareTest() {

        var testCompare =  new StringCompare();

        assertEquals(true, testCompare.compare("darling", "darling"));
        assertEquals(false, testCompare.compare("darling", "short"));
    }

    @Test
    void finalResultTest() {

        int correct = 0;
        int wrong = 0;

        var testCompare =  new StringCompare();

        correct = 3;

        assertEquals("Great job!", testCompare.finalResult(correct, wrong));

        correct = 2;
        wrong = 3;

        assertEquals("Not quite right, try again!", testCompare.finalResult(correct, wrong));


    }
}