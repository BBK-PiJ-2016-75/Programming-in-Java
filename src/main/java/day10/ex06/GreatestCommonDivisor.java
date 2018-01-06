package day10.ex06;

/**
 * Program which recursively calculates the greatest common divisor of two
 * given natural numbers.
 */
public class GreatestCommonDivisor {

  public static void main(String[] args) {
    GreatestCommonDivisor myGCD = new GreatestCommonDivisor();
    myGCD.launch();
  }

  private void launch() {
    System.out.println("The greatest common divisor of 12 and 15 is: " + gcd(12, 15));
    System.out.println("The greatest common divisor of 12 and 6 is: " + gcd(6, 12));
    System.out.println("The greatest common divisor of 14 and 27 is: " + gcd(14, 27));
    System.out.println("Expected results: 3, 6, 1");
  }

  private int gcd(int smaller, int greater) {
    if (greater % smaller == 0) {
      return smaller;
    } else {
      return gcd(greater % smaller, smaller);
    }

  }
}
