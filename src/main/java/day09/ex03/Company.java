package day09.ex03;

/**
 * A simple company database, which keeps a generic doubly-linked list of
 * employee names and one of employee National Insurance numbers.
 */
public class Company {
  GenericDoublyLinkedList<String> employeeNames = new GenericDoublyLinkedList<>();
  GenericDoublyLinkedList<Integer> employeeNI = new GenericDoublyLinkedList<>();
}
