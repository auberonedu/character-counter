import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
  @Test
  void testGetFrequencyCaseSensitivity() {
// Arrange
CharacterFrequencyCounter counter= new CharacterFrequencyCounter("SsS");
  //ACt
  int actualCount= counter.getFrequency('s');
  //Assert
  assertEquals(3, actualCount);
}

  @Test
  void testGetFrequencyMissingCharacter() {
    // Arrange
    CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
    // ACt
    int actualCount = counter.getFrequency('s');
    //Assert
    assertEquals(0, actualCount);
  }

    @Test
    void testGetRelativePercentageMissingCharacter() {
      //arrange
      CharacterFrequencyCounter counter = new CharacterFrequencyCounter("aaa");
      //Act
      double actualPercentage = counter.getRelativePercentage('z');
      int actualCount;
      //Assert
      assertEquals(3,actualCount);
    }

    private void assertEquals(int i, int actualCount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
  }
