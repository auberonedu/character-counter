import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test
    void testGetFrequency() {
      CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
      int actualCount = counter.getFrequency('l');
      assertEquals(2, actualCount);
    }

    @Test
    void testGetRelativePercentagePresent() {
      CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
      double actualRelativePercentage = counter.getRelativePercentage('l');
      assertEquals(40, actualRelativePercentage, .001);
    }

    @Test
    void testGetRelativePercentageAbsent() {
      CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
      double actualRelativePercentage = counter.getRelativePercentage('q');
      assertEquals(0, actualRelativePercentage, .001);
    }
}