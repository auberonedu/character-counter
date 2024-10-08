import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CharacterFrequencyCounterTest {
    @Test
    void testGetFrequencyCaseSensitivity() {
        // Arrnage
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("SsS");
        // Act
        int actualCount = counter.getFrequency('s');
        // Assert
        assertEquals(3, actualCount);
    }

    @Test
    void testGetFrequencyMissingCharacters() {
        // Aranage
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
        // Assert
        assertEquals(0.0, actualPercentage, .001);
    }
}
