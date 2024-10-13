import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test
    void testGetFrequencyCaseSensitivity() {

        //arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("SsS");
        //action
        int actualCounter = counter.getFrequency('s');
        //assert 
        assertEquals(3, actualCounter);
    }

    @Test

    void testGetFrequencyMissingCharacter(){
        //arrage
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
        //act
        int actualCounter = counter.getFrequency('s');
        //assert
        assertEquals(0, actualCounter);
    }

    @Test
    void testGetRelativePercentageMissingCharacter() {
        //arranage 
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("aaa");
        //action
        double actualPercentage = counter.getRelativePercentage('z');
        //assert
        assertEquals(0.0, actualPercentage, .001);
    }

}
