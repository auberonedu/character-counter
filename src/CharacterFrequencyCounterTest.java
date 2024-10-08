import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test
    void testGetFrequencyCaseSensitivity() {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("SsS");
        // Act
        int actualCount = counter.getFrequency('s');
        // Assert
        assertEquals(3, actualCount);
    }

    @Test
    void testGetFrequencyMissingCharacter() {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("Hello");
        // Act
        int actualCount = counter.getFrequency('s');
        // Assert
        assertEquals(0, actualCount);
    }

    @Test
    void testGetRelativePercentageMissingCharacter() {
        // Arrange
        CharacterFrequencyCounter percentage = new CharacterFrequencyCounter("aaa");
        // Act
        double actualPercentage = percentage.getRelativePercentage('z');
        // Assert
        assertEquals(0.0, actualPercentage, .001);
    }
}
