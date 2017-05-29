package com.github.bbkpij201675.programminginjava.day06.ex10;

/**
 * Simple program to test the methods of the SortedLinkedList class.
 */
public class SortedLinkedListTester {

  public static void main(String[] args) {
    SortedLinkedListTester tester = new SortedLinkedListTester();
    tester.launch();
  }

  private void launch() {
    SortedLinkedList myList = new SortedLinkedList();
    for (int i = 0; i < 15; i++) {
      int random = (int) Math.abs(1000 * Math.random());
      System.out.println(random + ", ");
      myList.addNode(new SortedListNode(random));
    }
    myList.printList();
  }
}
