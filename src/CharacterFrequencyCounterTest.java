import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
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
    CharacterFrequencyCounter counter = new CharacterFrequencyCounter("Hello");
    int actualCount = counter.getFrequency('s');
    assertEquals(0, actualCount);
  }

  @Test
  void testGetRelativePercentage() {
    CharacterFrequencyCounter percentage = new CharacterFrequencyCounter("SSSS");
    double actualPercent = percentage.getRelativePercentage('s');
    assertEquals(100, actualPercent);
  }

  @Test
  void testGetRelativePercentageMissingCharacter() {
    CharacterFrequencyCounter percentage = new CharacterFrequencyCounter("SSsA");
    double actualPercent = percentage.getRelativePercentage('z');
    assertEquals(0.0, actualPercent, .001);
  }
}
