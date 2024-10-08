import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test
    void testGetFrequencyCaseSensitivity() {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("SsS");
        // Act
        int actualCount = counter.getFrequency('s');
        // Assert (expected, actual)
        assertEquals(3, actualCount);
    }

    @Test
    void testGetFrequencyMissingCharacter(){
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
        // Act
        int actualCount = counter.getFrequency('s');
        // Assert
        assertEquals(0, actualCount);

    }

    @Test
    void testGetRelativePercentageMissingCharacter() {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("aaa");
        // Act
        double actualPercentage = counter.getRelativePercentage('z');
        // Assert (thrid arg is "fudge factor")
        assertEquals(0.0, actualPercentage, .001);

    }
}
