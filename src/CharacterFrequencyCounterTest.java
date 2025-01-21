import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test
    public void testAppearsThreeTimesInHelloWord(){
        //Arrange
        CharacterFrequencyCounter counter= new CharacterFrequencyCounter("Hello world");

        //Act
        int actualAcout = counter.getFrequency('o');

        //Assert
        assertEquals(2,actualAcout);
    }
    @Test
    public void testNoneOccuringCharactersPercentsgeIsZero(){
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hi there");

        //Act 
        double actualPercentage = counter.getRelativePercentage('z');

        //Assert 
        assertEquals(0.0, actualPercentage, 0.0001);
    }
}