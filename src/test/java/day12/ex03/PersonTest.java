package day12.ex03;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Simple tests to verify and debug the Person class.
 */
public class PersonTest {
  private Person testPerson;

  @Before
  public void setUp() throws Exception {
    testPerson = new Person();
  }

  @Test
  public void testsNormalName() {
    String input = "Dereck Robert Yssirt";
    String expected = "DRY";
    String actual = testPerson.getInitials(input);
    assertEquals(expected, actual);
  }

  @Test
  public void testsExtraSpacesInName() {
    String input = " W.  Axl  Rose";
    String output = testPerson.getInitials(input);
    String expected = "WAR";
    assertEquals(expected, output);
  }
}
