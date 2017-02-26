package com.github.bbkpij201675.programminginjava.day06.ex07;

/**
 * A utility class to convert an integer array to a integer list, and print
 * the nodes of an integer list to the console.
 */
public class ArrayUtilities {

  /**
   * Converts an integer array into an integer list.
   *
   * @param array the integer array to convert.
   * @return the converted integer list.
   */
  public static IntegerNode arrayToList(int[] array) {
    IntegerNode integerNodeList = new IntegerNode(array[0]);
    for (int i = 1; i < array.length; i++) {
      IntegerNode nodeToAdd = new IntegerNode(array[i]);
      integerNodeList.addIntegerNode(nodeToAdd);
    }
    return integerNodeList;
  }

  /**
   * Prints the value of each node in an integer list to the console.
   *
   * @param list the integer list to be printed.
   */
  public static void printIntegerList(IntegerNode list) {
    if (list.getNextNode() == null) {
      System.out.println(list.getValue());
    } else {
      System.out.print(list.getValue() + ", ");
      printIntegerList(list.getNextNode());
    }
  }
}
