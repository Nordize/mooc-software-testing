package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    void test1() {

        Mirror mirror = new Mirror();

        String result = mirror.mirrorEnds("abXYZba");

        Assertions.assertEquals("ab", result);
    }

    @Test
    void test2() {

        Mirror mirror = new Mirror();

        String result = mirror.mirrorEnds("abca");

        Assertions.assertEquals("a", result);
    }

    @Test
    void test3() {

        Mirror mirror = new Mirror();

        String result = mirror.mirrorEnds("aba");

        Assertions.assertEquals("aba", result);
    }
}
