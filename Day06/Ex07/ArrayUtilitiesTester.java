package ex07;

public class ArrayUtilitiesTester {
  
  public static void main(String[] args) {
    ArrayUtilitiesTester tester = new ArrayUtilitiesTester();
    tester.run();
  }
  
  private void run() {
    int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    integerNode valuesAsList = ArrayUtilities.arrayToList(values);
    ArrayUtilities.printIntegerList(valuesAsList);
  }
}