package util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


class DateTest {

    @Test
    void testTypicalLeapYear() {
        // arrange
        int year = 1996;

        // act
        boolean result = Date.isLeapYear(year);

        // assert
        assertTrue(result);
    }

    @Test
    void testTypicalNonLeapYear() {
        // arrange
        int year = 2001;

        // act
        boolean result = Date.isLeapYear(year);

        // assert
        assertFalse(result);
    }

    @Test
    void testATypicalNonLeapYear() {
        // arrange
        int year = 1900;

        // act
        boolean result = Date.isLeapYear(year);

        // assert
        assertFalse(result);
    }

    @Test
    void testATypicalLeapYear() {
        // arrange
        int year = 2000;

        // act
        boolean result = Date.isLeapYear(year);

        // assert
        assertTrue(result);
    }

    @Test
    void testInvalidYear() {
        int year = 1400;

        Assertions.assertThrows(IllegalArgumentException.class, () -> Date.isLeapYear(year));
    }

    @Test
    void testBoundary() {
        // arrange
        int year = 1582;

        // act
        boolean result = Date.isLeapYear(year);

        // assert
        assertFalse(result);
    }
}
