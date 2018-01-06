package day06.ex07;

/**
 * Simple program to test the methods of the ArrayUtilities class.
 */
public class ArrayUtilitiesTester {

  public static void main(String[] args) {
    ArrayUtilitiesTester tester = new ArrayUtilitiesTester();
    tester.launch();
  }

  private void launch() {
    int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    IntegerNode valuesAsList = ArrayUtilities.arrayToList(values);
    ArrayUtilities.printIntegerList(valuesAsList);
  }
}
