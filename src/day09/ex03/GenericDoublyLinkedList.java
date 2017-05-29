package com.github.bbkpij201675.programminginjava.day09.ex03;

/**
 * A generic doubly-linked list, which uses generic nodes.
 *
 * @param <T> the generic type for the list
 */
public class GenericDoublyLinkedList<T> {
  private GenericDoublyLinkedNode head = null;
  private GenericDoublyLinkedNode tail = null;
  private int listCount = 0;

  public int getListCount() {
    return listCount;
  }

  /**
   * Adds an element to the doubly-linked list, updating the list's head and
   * tail, and incrementing the list's count total.
   *
   * @param element the element of data to add to the list
   */
  public void addElement(T element) {
    GenericDoublyLinkedNode item = new GenericDoublyLinkedNode<>(element);
    listCount++;
    if (head == null) {
      head = item;
      tail = item;
    } else {
      GenericDoublyLinkedNode current = head;
      while (current.getNextNode() != null) {
        current = current.getNextNode();
      }
      current.setNextNode(item);
      item.setPreviousNode(current);
      tail = item;
    }
  }

  /**
   * Deletes a specified item from the doubly-linked list, by first checking
   * if the item is at the list's head or tail, then checking in order.
   *
   * @param element the element of data to delete from the list
   */
  public void deleteElement(T element) {
    if (head != null) {
      if (head.getData().equals(element)) {
        head = head.getNextNode();
        head.setPreviousNode(null);
        listCount--;
      } else if (tail.getData().equals(element)) {
        tail = tail.getPreviousNode();
        tail.setNextNode(null);
        listCount--;
      } else {
        GenericDoublyLinkedNode current = head;
        while (current.getNextNode() != null) {
          if (current.getData().equals(element)) {
            GenericDoublyLinkedNode previous = current.getPreviousNode();
            GenericDoublyLinkedNode next = current.getNextNode();
            previous.setNextNode(next);
            next.setPreviousNode(previous);
            listCount--;
          }
          current = current.getNextNode();
        }
      }
    }
  }

  /**
   * Prints out all elements of the list in order.
   */
  public void print() {
    if (head != null) {
      GenericDoublyLinkedNode current = head;
      while (current.getNextNode() != null) {
        System.out.println(current.getData());
        current = current.getNextNode();
      }
      System.out.println(current.getData());
    }
  }
}
