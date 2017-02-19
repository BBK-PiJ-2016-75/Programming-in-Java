package com.github.bbkpij201675.programminginjava.day09.ex03;

/**
 * Created by Dennis on 10/02/2017.
 */
public class GenericDoublyLinkedList<T extends GenericDoublyLinkedNode> {
  private GenericDoublyLinkedNode head = null;
  private GenericDoublyLinkedNode tail = null;

  /**
   * asa.
   * @param element asa
   */
  public void addElement(T element) {
    if (head == null) {
      head = element;
      tail = element;

    } else {
      GenericDoublyLinkedNode current = head;
      //if
      while (current.getNextNode() != null) {
        current = current.getNextNode();
      }
    }
  }
}
