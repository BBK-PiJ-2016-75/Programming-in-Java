package com.github.bbkpij201675.programminginjava.day12.ex03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dennis on 26/02/2017.
 */
public class PersonTest {

  @Test
  public void testsNormalName() {
    Person p = new Person();
    String input = "Dereck Robert Yssirt";
    String output = p.getInitials(input);
    String expected = "DRY";
    assertEquals(expected, output);
  }

  @Test
  public void testsExtraSpacesInName() {
    Person p = new Person();
    String input = " W.  Axl  Rose";
    String output = p.getInitials(input);
    String expected = "WAR";
    assertEquals(expected, output);
  }
}
