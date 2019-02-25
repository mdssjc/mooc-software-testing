package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    private Mirror mirror;

    @BeforeEach
    void setUp() {
        mirror = new Mirror();
    }

    @Test
    void test01() {
        String result = mirror.mirrorEnds("abXYZba");

        Assertions.assertEquals("ab", result);
    }

    @Test
    void test02() {
        String result = mirror.mirrorEnds("abca");

        Assertions.assertEquals("a", result);
    }

    @Test
    void test03() {
        String result = mirror.mirrorEnds("aba");

        Assertions.assertEquals("aba", result);
    }

    @Test
    void test04() {
        String result = mirror.mirrorEnds("aa");

        Assertions.assertEquals("aa", result);
    }
}
