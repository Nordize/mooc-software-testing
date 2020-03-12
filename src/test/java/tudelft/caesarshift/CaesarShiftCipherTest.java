package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.ghappy.GHappy;

public class CaesarShiftCipherTest {

    @Test
    public void test1(){
        CaesarShiftCipher C_shift = new CaesarShiftCipher();

        String result = C_shift.CaesarShiftCipher("abc",3);
        Assertions.assertEquals("def",result);
    }

    @Test
    public void test2(){
        CaesarShiftCipher C_shift = new CaesarShiftCipher();

        String result = C_shift.CaesarShiftCipher("xyz",3);
        Assertions.assertEquals("abc",result);
    }

    @ParameterizedTest(name = "string={0},result={1}")
    @CsvSource({
            "java,lcxc", "hungry,jwpita", "blog,dnqi"
    })
    public void test_automation1(String str,String expected_result) {
        CaesarShiftCipher C_shift = new CaesarShiftCipher();

        String result = C_shift.CaesarShiftCipher(str,2);

        Assertions.assertEquals(expected_result,result);
    }
}
