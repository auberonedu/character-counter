import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Counter;

public class CharacterFrequencyCounterTest {
    @Test
    void testGetFrequencyCaseSensitivity() {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("SsS");
        // Act (called the method and get frequency)
        int actualCount = counter.getFrequency('s');
        // Assert
        assertEquals(3, actualCount);
    }

    @Test
    void testGetFrequencyMissingCharacter() {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
        // Action
        int actualCount = counter.getFrequency('s');
        // Assert
        assertEquals(0, actualCount);
    }

    @Test
    void testRelativePerecntageMissingCharacter() {
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("aaa");
        //Act
        double actualPercentage = counter.getRelativePercentage('z');
        //Assert
        assertEquals(0.0, actualPercentage, .001);
    }

    @Test
    void testGetRelativePercentage() {

    }
}
