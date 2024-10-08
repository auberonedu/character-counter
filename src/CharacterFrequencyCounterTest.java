import static org.junit.Assert.assertEquals;

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
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
        // Act
        int actualCount = counter.getFrequency('s');
        // Assert
        assertEquals(0, actualCount);
    }

    @Test
    void testGetRelativePercentage() {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("aaa");
        // Act
        double actualPercentage = counter.getRelativePercentage('z');
        // Assert
        assertEquals(0.0, actualPercentage, .001); // 3 is ammount of decimals
    }
}

// Test are helpful to prevent bugs, glitches, failures
// It is much faster and more extensive than running the programm and testing manually everytime