package tudelft.ghappy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GHappyTest {
    private GHappy test;
    private boolean actual;

    @BeforeEach
    public void setup(){
        test = new GHappy();
        actual = false;
    }

    @Test
    public void testGHappyEmptyString(){
        actual = test.gHappy("");
        assertTrue(actual);
    }

    @Test
    public void testGHappyNotEmptyStringWithoutG(){
        actual = test.gHappy("asd");
        assertTrue(actual);
    }

    @Test
    public void testGHappyGInTheMiddleAlone(){
        actual = test.gHappy("asdgasd");
        assertFalse(actual);
    }

    @Test
    public void testGHappyGsInTheMiddle(){
        actual = test.gHappy("asdggasd");
        assertTrue(actual);
    }

    @Test
    public void testGHappyGsInTheMiddleMultipleTimes(){
        actual = test.gHappy("asdggasgd");
        assertFalse(actual);
    }

    @Test
    public void testGHappyGsInTheMiddleMultipleTimesTrue(){
        actual = test.gHappy("asdggasggd");
        assertTrue(actual);
    }

    @Test
    public void testGHappyThreeGsInTheMiddleAlone(){
        actual = test.gHappy("asdgggasd");
        assertTrue(actual);
    }

    @Test void testGHappyStartOfString(){
        actual = test.gHappy("gasdd");
        assertFalse(actual);
    }

    @Test void testGHappyGsStartOfString(){
        actual = test.gHappy("ggasdd");
        assertTrue(actual);
    }

    @Test void testGHappyGEndOfString(){
        actual = test.gHappy("asddg");
        assertFalse(actual);
    }

    @Test void testGHappyGsEndOfString(){
        actual = test.gHappy("asddgg");
        assertTrue(actual);
    }
}
