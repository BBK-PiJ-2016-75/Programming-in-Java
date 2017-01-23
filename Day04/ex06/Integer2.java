package ex06;

/**
 * A homemade version of the Integer complex type.
 */
public class Integer2 {
  private int value = 0;

  public void setValue(int number) {
    this.value = number;
  }

  public int getValue() {
    return value;
  }

  /**
   * Returns if an integer is even, by checking if its remainder by 2 is 0.
   * @return true if the integer is even.
   */
  public boolean isEven() {
    if (value % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Returns if an integer is odd, by checking if its remainder by 2 is 1.
   * @return true if the integer is odd.
   */
  public boolean isOdd() {
    if (value % 2 == 1) {
      return true;
    } else {
      return false;
    }
  }

  public void prettyPrint() {
    System.out.println(value);
  }

  public String toString() {
    String number = "" + value;
    return number;
  }
}
