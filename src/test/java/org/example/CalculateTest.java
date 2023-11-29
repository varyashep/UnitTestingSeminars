package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    private Calculate calculate = new Calculate();

    @Test
    void testGetAverage() {
        int[] list = {1, 2, 3, 4, 5};
        int expectedAverage = 3;
        int actualAverage = calculate.GetAverage(list);
        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void testGetAverageWithEmptyList() {
        int[] list = {};
        int expectedAverage = 0;
        int actualAverage = calculate.GetAverage(list);
        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void testGetAverageWithNegativeNumbers() {
        int[] list = {-1, -2, -3, -4, -5};
        int expectedAverage = -3;
        int actualAverage = calculate.GetAverage(list);
        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void testCompareAverageFirstLess() {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {6, 7, 8, 9, 10};
        String expectedOutput = "Второй список имеет большее среднее значение";

        // Redirect System.out to a PrintStream
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        calculate.CompareAverage(list1, list2);

        // Restore System.out
        System.setOut(originalOut);

        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void testCompareAverageWithEqualAverages() {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {1, 2, 3, 4, 5};
        String expectedOutput = "Средние значения равны";

        // Redirect System.out to a PrintStream
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        calculate.CompareAverage(list1, list2);

        // Restore System.out
        System.setOut(originalOut);

        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void testCompareAverageSecondLess() {
        int[] list1 = {6, 7, 8, 9, 10};
        int[] list2 = {1, 2, 3, 4, 5};
        String expectedOutput = "Первый список имеет большее среднее значение";

        // Redirect System.out to a PrintStream
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        calculate.CompareAverage(list1, list2);

        // Restore System.out
        System.setOut(originalOut);

        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
