package tudelft.caesarshift;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher testCipher;
    private String actual;

    @BeforeEach
    public void setup(){
        testCipher = new CaesarShiftCipher();
        actual = "";
    }

    @Test
    public void testCaesarEmptyString(){
        actual = testCipher.CaesarShiftCipher("",1);
        assertEquals("",actual);
    }

    @Test
    public void testCaesarOnlySpace(){
        actual = testCipher.CaesarShiftCipher(" ", 1);
        assertEquals(" ", actual);
    }

    @Test
    public void testCaesarStringPositiveNumber(){
        actual = testCipher.CaesarShiftCipher("asd x", 2);
        assertEquals("cuf z", actual);
    }

    @Test
    public void testCaesarStringNegativeNumber(){
        actual = testCipher.CaesarShiftCipher("bc d", -1);
        assertEquals("ab c", actual);
    }

    @Test
    public void testCaesarStringInvalidCharacterPositiveNumber(){
        actual = testCipher.CaesarShiftCipher("asd /", 1);
        assertEquals("invalid", actual);
    }

    @Test
    public void testCaesarStringCharacterOverFlowPositiveNumber(){
        actual = testCipher.CaesarShiftCipher("abc", -3);
        assertEquals("xyz", actual);
    }

    @Test
    public void testCaesarStringCharacterOverFlowNegativeNumber(){
        actual = testCipher.CaesarShiftCipher("xyz", 3);
        assertEquals("abc", actual);
    }


}
