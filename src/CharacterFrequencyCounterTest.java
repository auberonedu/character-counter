import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharacterFrequencyCounterTest {
    @Test
    public void testGetFrequencyCaseSensitivity() {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("SsS");
        // Act
        int actualCount = counter.getFrequency('s');
        // Assert 
        assertEquals(3, actualCount);
    }

    @Test
    public void testGetFrequencyMissingCharacter(){
        //Arrange 
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("Hello");
        //Action
        int actualCount = counter.getFrequency('s');
        assertEquals(0, actualCount);
    }

    @Test
    public void testGetRelativePercentage() {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
        //Act
        double actualPercentage = counter.getRelativePercentage('z');
        assertEquals(0.0, actualPercentage, .001);
        }
}
