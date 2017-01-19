package ex03;

/**
 * Converts decimal numbers to binary notation, or binary numbers to decimal
 * notation.
 */
public class BinaryDecimal {

  /**
   * Multiplies the base by itself, the exponent amount of times.
   * @param base the base number to be multiplied by itself.
   * @param exponent the amount of times to run the multiplication.
   * @return the result of the calculation.
   */
  private static int power(int base, int exponent) {
    int result = base;
    if (exponent == 0) {
      return 1;
    }
    if (exponent == 1) {
      return result;
    }
    for (int i = 1; i < exponent; i++) {
      result *= base;
    }
    return result;
  }

  private static int power2(int exponent) {
    return power(2, exponent);
  }

  /**
   * Converts a number entered in binary notation to its decimal equivalent.
   * @param binaryInput a number in binary notation.
   * @return the same number as binaryInput, in decimal notation.
   */
  private static int binary2decimal(String binaryInput) {
    int result = 0;
    for (int i = 0; i < binaryInput.length(); i++) {
      if (binaryInput.charAt((binaryInput.length() - 1) - i) == '1') {
        result += power2(i);
      }
    }
    return result;
  }

  /**
   * Converts a number entered in decimal notation to its binary equivalent.
   * @param decimalInput a number in decimal notation.
   * @return the same number as decimalInput, in binary notation.
   */
  private static String decimal2binary(int decimalInput) {
    String result = "";
    while (decimalInput > 0) {
      if (decimalInput % 2 == 0) {
        result = "0" + result;
      } else {
        result = "1" + result;
      }
      decimalInput /= 2;
    }
    return result;
  }

  public static void main(String[] args) {
    BinaryDecimal converter = new BinaryDecimal();
    converter.run();
  }

  private void run() {
    System.out.print("Please enter \"1\" to covert a binary number to decimal,"
        + "\nor enter \"2\" to convert a decimal number to binary: ");
    int choice = Integer.parseInt(System.console().readLine());
    if (choice == 1) {
      System.out.print("Now, please enter the binary number you wish to convert"
          + "to decimal :");
      String binaryNumber = System.console().readLine();
      int convertedDecimal = binary2decimal(binaryNumber);
      System.out.println(binaryNumber + " is " + convertedDecimal + " in decimal"
          + "notation.");
    } else if (choice == 2) {
      System.out.print("Now, please enter the decimal number you wish to convert"
          + "to binary :");
      int decimalNumber = Integer.parseInt(System.console().readLine());
      String convertedBinary = decimal2binary(decimalNumber);
      System.out.println(decimalNumber + " is " + convertedBinary + " in binary"
          + "notation.");
    } else {
      System.out.println("That is an invalid option.");
    }
  }
}
