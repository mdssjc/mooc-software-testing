package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    private GHappy gHappy;

    @BeforeEach
    void setUp() {
        gHappy = new GHappy();
    }

    @Test
    void test01() {
        boolean result = gHappy.gHappy("xxggxx");

        Assertions.assertTrue(result);
    }

    @Test
    void test02() {
        boolean result = gHappy.gHappy("xxgxx");

        Assertions.assertFalse(result);
    }

    @Test
    void test03() {
        boolean result = gHappy.gHappy("xxggyygxx");

        Assertions.assertFalse(result);
    }

    @Test
    void test04() {
        boolean result = gHappy.gHappy("g");

        Assertions.assertFalse(result);
    }

    @Test
    void test05() {
        boolean result = gHappy.gHappy("gg");

        Assertions.assertTrue(result);
    }
}
