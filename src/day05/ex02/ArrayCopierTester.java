package com.github.bbkpij201675.programminginjava.day05.ex02;

/**
 * Simple program to test the methods of the ArrayCopier class.
 */
public class ArrayCopierTester {

  public static void main(String[] args) {
    ArrayCopierTester tester = new ArrayCopierTester();
    tester.launch();
  }

  private static String printArray(int[] toPrint) {
    String printout = "[";
    for (int i = 0; i < toPrint.length - 1; i++) {
      printout += toPrint[i] + ", ";
    }
    printout += toPrint[toPrint.length - 1] + "]";
    return printout;
  }

  private void launch() {
    int[] source = {1, 2, 3, 4, 5};
    int[] destinationOne = {6, 7, 8};
    int[] destinationTwo = {6, 7, 8, 9, 10};
    int[] destinationThree = {6, 7, 8, 9, 10, 11, 12};
    System.out.println("The source array is " + printArray(source));
    System.out.println("The first destination array is "
        + printArray(destinationOne));
    System.out.println("The second destination array is "
        + printArray(destinationTwo));
    System.out.println("The third destination array is "
        + printArray(destinationThree));

    ArrayCopier testCopier = new ArrayCopier();
    testCopier.copy(source, destinationOne);
    System.out.println("After copying, the first destination array is "
        + printArray(destinationOne));
    testCopier.copy(source, destinationTwo);
    System.out.println("After copying, the second destination array is "
        + printArray(destinationTwo));
    testCopier.copy(source, destinationThree);
    System.out.println("After copying, the third destination array is "
        + printArray(destinationThree));
  }
}
