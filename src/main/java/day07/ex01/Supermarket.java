package day07.ex01;

/**
 * A supermarket queue is an implementation of the person queue interface.
 */
public class Supermarket implements PersonQueue {
  private static final int MAX_SIZE = 10;
  private int size = 0;
  private Person head = null;

  @Override
  public void insert(Person person) {
    if (size < MAX_SIZE) {
      if (head == null) {
        head = person;
        size++;
      } else {
        Person current = head;
        while (current.getNextPerson() != null) {
          current = current.getNextPerson();
        }
        current.setNextPerson(person);
        size++;
      }
    } else {
      System.out.println("Maximum queue size reached. Cannot insert any more.");
    }
  }

  /**
   * Prints to the console the names of all the person objects in the
   * supermarket queue.
   */
  public void printQueue() {
    Person current = head;
    while (current.getNextPerson() != null) {
      System.out.print(current.getName() + ", ");
      current = current.getNextPerson();
    }
    System.out.println(current.getName() + ".");
  }

  @Override
  public Person retrieve() {
    size--;
    Person retrieved = head;
    head = head.getNextPerson();
    return retrieved;
  }

  public int getSize() {
    return size;
  }

  public int getMaxSize() {
    return MAX_SIZE;
  }
}
