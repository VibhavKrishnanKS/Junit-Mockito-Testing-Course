package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class DemoUtilsTest {
    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
    }

    // @AfterEach
    // void tearDownAfterEach(){
    // System.out.println("Running @AfterEach");
    // }
    //
    // // Also remember by default the methods must be static
    // @BeforeAll
    // static void setupBeforeEachClass(){
    // System.out.println("@BeforeAll executes only once before all test methods
    // execution in the class");
    // }
    //
    // // Also remember by default the methods must be static
    // @AfterAll
    // static void tear(){
    // System.out.println("@AfterAll executes only once after all test methods
    // execution in the class");
    // }

    // Testing the add method
    @Test
    @DisplayName("Equals and Not Equals")
    void test_Equals_And_Not_Equals() {

        // The test below will pass, if so the two values are equal. Else it will
        // display the desired message
        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        //// The test below will pass, if so the two values are not equal. Else it will
        //// display the desired message
        assertNotEquals(6, demoUtils.add(1, 9), "1 + 9 must not be 6");

    }

    @Test
    @DisplayName("NULL and NOT NULL")
    void test_Null_And_Not_Null() {

        String str1 = null;
        String str2 = "Vibhav";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

    @Test
    @DisplayName("Same and Not Same")
    void testSameAndNotSame() {

        // The test below will pass, if so the two values are same. Else it will display
        // the desired message
        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Objects should refer to the same object");
        // The test below will pass, if so the two values are not same. Else it will
        // display the desired message
        assertNotSame(demoUtils.getAcademy(), demoUtils.getAcademyInList(),
                "Objects should not refer to the same object");
    }

    @DisplayName("True and False")
    @Test
    void testTrueFalse() {
        int gradeOne = 10;
        int gradeTwo = 5;

        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "This should return false");
    }

    @DisplayName("Array Equals")
    @Test
    void testArrayEquals() {
        String[] expectedArray = { "A", "B", "C" };
        String[] resultArray = demoUtils.getFirstThreeLettersOfAlphabet();
        assertArrayEquals(expectedArray, resultArray, "Arrays should be the same");
    }

    @DisplayName("Iterable Equals")
    @Test
    void testIterableEquals() {
        List<String> theList = List.of("luv", "2", "code");
        assertIterableEquals(theList, demoUtils.getAcademyInList(), "Expected list should be same as actual list");
    }

    @DisplayName("Lines match")
    @Test
    void testLinesMatch() {
        List<String> theList = List.of("luv", "2", "code");
        assertLinesMatch(theList, demoUtils.getAcademyInList(), "Lines Should match");
    }

    @DisplayName("Throws and Does Not Throw")
    @Test
    void testThrowAndDoesNotThrow() {
        assertThrows(Exception.class, () -> {
            demoUtils.throwException(-1);
        }, "Should throw exception");
        // As the function accepts a value that is greater than zero it shouldn't throw
        // any exception
        assertDoesNotThrow(() -> {
            demoUtils.throwException(9);
        }, "Should not throw exception");
    }

    @DisplayName("Timeout")
    @Test
    void testTimeout() {
        assertTimeoutPreemptively(Duration.ofSeconds(2), () -> {
            demoUtils.checkTimeout();
        }, "Method should execute in 2 seconds");
    }

}
