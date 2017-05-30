package com.github.bbkpij201675.programminginjava.day11.ex03;

/**
 * Simple program to test the methods of the TreeIntSortedList and
 * ListIntSortedList classes, which both implement the IntSortedList interface.
 */
public class IntSortedListTester {

  public static void main(String[] args) {
    IntSortedListTester myIntSortedListTester = new IntSortedListTester();
    myIntSortedListTester.launch();
  }

  private void launch() {
    TreeIntSortedList treeSortedList = new TreeIntSortedList(4);
    test(treeSortedList);
    ListIntSortedList listSortedList = new ListIntSortedList(4);
    test(listSortedList);
  }

  private void test(IntSortedList testee) {
    testee.add(5);
    testee.add(8);
    testee.add(1);
    testee.add(17);
    testee.add(12);
    testee.add(3);
    testee.add(10);
    testee.add(17);
    System.out.println("Sorted list contains 9: " + testee.contains(9));
    System.out.println("Sorted list contains 10: " + testee.contains(10));
    System.out.println("Current members of sorted list: " + testee.toString());
  }
}
