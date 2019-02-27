package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void lastWordMatchingWithR() {
        int words = new CountLetters().count("cats|ever");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void multipleMatchingWordsWithR() {
        int words = new CountLetters().count("never|ever");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void initWithNumber() {
        int words = new CountLetters().count("2ever");
        Assertions.assertEquals(1, words);
    }
}
