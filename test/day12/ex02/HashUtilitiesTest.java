package com.github.bbkpij201675.programminginjava.day12.ex02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * A simple battery of tests to verify the behaviour of the HashUtilities class.
 */
public class HashUtilitiesTest {
  private HashUtilities hash;

  @Before
  public void setUp() throws Exception {
    hash = new HashUtilities();
  }

  @Test
  public void testsZero() {
    int toCheck = 0;
    int expected = 0;
    int actual = hash.shortHash(toCheck);
    assertEquals(expected, actual);
  }

  @Test
  public void testsMax() {
    int toCheck = Integer.MAX_VALUE;
    int expected = 647;
    int actual = hash.shortHash(toCheck);
    assertEquals(expected, actual);
  }

  @Test
  public void testsNineNineNine() {
    int toCheck = 999;
    int expected = 999;
    int actual = hash.shortHash(toCheck);
    assertEquals(expected, actual);
  }
}
