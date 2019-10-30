package basicTests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void test1() {
        System.out.println("Test 1 works");
        assertEquals("19",System.getenv("TEST_ENV"));
    }


    @Test
    public void test2() {
        System.out.println("Test 2 works");
    }
}
