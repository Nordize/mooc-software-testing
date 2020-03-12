package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.chocolate.ChocolateBags;

public class GHappyTest {

    @Test
    public void test1(){
        GHappy g_happy = new GHappy();

        boolean result = g_happy.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void test2(){
        GHappy g_happy = new GHappy();

        boolean result = g_happy.gHappy("xxgxx");
        //System.out.println(result);
        Assertions.assertFalse(result);

    }

    @Test
    public void test3(){
        GHappy g_happy = new GHappy();

        boolean result = g_happy.gHappy("xxggyygxx");
        //System.out.println(result);
        Assertions.assertFalse(result);

    }

    @ParameterizedTest(name = "string={0}")
    @CsvSource({
            "xxgggxyz", "gg", "xxgggxygg", "mggm"
            })
    public void test_automation1(String str) {
        GHappy g_happy = new GHappy();
        boolean result = g_happy.gHappy(str);

        Assertions.assertTrue(result);
    }

    @ParameterizedTest(name = "string={0}")
    @CsvSource({
            "mgm", "xxgggxyg", "g"
    })
    public void test_automation2(String str) {
        GHappy g_happy = new GHappy();
        boolean result = g_happy.gHappy(str);

        Assertions.assertFalse(result);
    }
}
