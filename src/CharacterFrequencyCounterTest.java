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
    void testGetFrequencyLetterNotFound() {
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
        CharacterFrequencyCounter percenter = new CharacterFrequencyCounter("aaa");
        // Act
        double percent = percenter.getRelativePercentage('b');
        // Assert
        assertEquals(0, percent, .001);
    }
}
