package util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class LeapYearTest {

    @Test
    public void testTypicalLeapYear() {
        // arrange
        int year = 1996;

        // act
        boolean result = Date.isLeapYear(year);

        // assert
        assertTrue(result);
    }

}
