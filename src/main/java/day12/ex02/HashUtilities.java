package day12.ex02;

/**
 * Utility class to create a simple hash code which will always be < 1,000.
 */
public class HashUtilities {

  public static int shortHash(int inputInt) {
    int result = Math.abs(inputInt % 1000);
    return result;
  }
}
