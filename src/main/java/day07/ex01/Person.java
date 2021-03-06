package day07.ex01;

/**
 * Creates a person object, consisting of a name field and a pointer to the
 * next person object in the queue.
 */
public class Person {
  private String name = null;
  private Person nextPerson = null;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Person getNextPerson() {
    return nextPerson;
  }

  public void setNextPerson(Person nextPerson) {
    this.nextPerson = nextPerson;
  }
}
