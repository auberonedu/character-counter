import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test
    void testGetFrequency() {

        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("SsS");
        int actualCount = counter.getFrequency('s');

        assertEquals(3, actualCount);

        
    }

    @Test
    void testGetFrequencyMissingCharacter() {
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");

        int actualCount = counter.getFrequency('y');

        assertEquals(0, actualCount); 
    }

    @Test
    void testGetRelativePercentageMissingCharacter() {

        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");

        double actualPercentage = counter.getRelativePercentage('p');

        assertEquals(0.0, actualPercentage, .00); 
    }
}
