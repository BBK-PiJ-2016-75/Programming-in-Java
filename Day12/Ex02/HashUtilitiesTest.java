import org.junit.*;
import static org.junit.Assert.*;

public class HashUtilitiesTest {
  
  @Test
  public void testsZero() {
    HashUtilities hash = new HashUtilities();
    int toCheck = 0;
    int output = hash.shortHash(toCheck);
    int expected = 0;
    assertEquals(output, expected);
  }
  
  @Test
  public void testsMax() {
    HashUtilities hash = new HashUtilities();
    int toCheck = Integer.MAX_VALUE;
    int output = hash.shortHash(toCheck);
    int expected = 647;
    assertEquals(output, expected);
  }
  
  @Test
  public void testsRandom() {
    HashUtilities hash = new HashUtilities();
    int toCheck = Integer.MAX_VALUE;
    int output = hash.shortHash(toCheck);
    int expected = 647;
    assertEquals(output, expected);
  }
  
}