import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test
    void testGetFrequency() {
        CharacterFrequencyCounter testCounter = new CharacterFrequencyCounter("greetings");
        int actualCount = testCounter.getFrequency('g');
        // 2 is what I expect
        assertEquals(2, actualCount);
    }

    @Test
    void testGetRelativePercentageRecent() {
        CharacterFrequencyCounter testCounter = new CharacterFrequencyCounter("greetings");
        double actualPercentage = testCounter.getRelativePercentage('z');
        // 0.0 is what I expect
        assertEquals(0.0, actualPercentage, 0.0);
    }
    

    @Test
    void testGetRelativePercentageMissing() {
        CharacterFrequencyCounter tesCounter = new CharacterFrequencyCounter("greetings");
        double actualPercentage = tesCounter.getRelativePercentage('q');
        // 0.0 is what I expect
        assertEquals(0.0, actualPercentage, 0.0);
      }
}
