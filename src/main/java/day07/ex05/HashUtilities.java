package day07.ex05;

/**
 * Utility class to create a simple hash code which will always be < 1,000.
 */
public class HashUtilities {

  public static int shortHash(int inputInt) {
    int result = Math.abs(inputInt % 1000);
    return result;
  }
}
