package day06.ex03;

/**
 * Creates and manages a list of doubly-linked patients for a hospital.
 */
public class DoublyLinkedHospitalManager {
  private DoublyLinkedPatient firstPatient = null;
  private DoublyLinkedPatient lastPatient = null;
  private int listCount = 0;

  public DoublyLinkedPatient getFirstPatient() {
    return this.firstPatient;
  }

  public DoublyLinkedPatient getLastPatient() {
    return this.lastPatient;
  }

  public int getListCount() {
    return this.listCount;
  }

  /**
   * Adds a new doubly-linked patient to the hospital's list.
   *
   * @param newPatient the doubly-linked patient to add to the hospital's list.
   */
  public void addPatient(DoublyLinkedPatient newPatient) {
    listCount++;
    if (firstPatient == null) {
      firstPatient = newPatient;
      lastPatient = newPatient;
      return;
    }
    DoublyLinkedPatient current = firstPatient;
    while (current.getNextPatient() != null) {
      // this means we are not yet at the end of the list
      current = current.getNextPatient();
    }
    // at this point, current points to the last patient
    current.setNextPatient(newPatient);
    newPatient.setPreviousPatient(current);
    lastPatient = newPatient;
  }

  /**
   * Removes a doubly-linked patient from the hospital's list by name.
   *
   * @param name the name of the doubly-linked patient to remove from the
   *             hospital's list.
   * @return true if the doubly-linked patient is found and removed, false
   * otherwise.
   */
  public boolean deletePatient(String name) {
    if (firstPatient == null) {
      // list is empty, nothing to remove
      return false;
    }
    if (firstPatient.getName().equals(name)) {
      // first patient in the list must be removed
      firstPatient = firstPatient.getNextPatient();
      firstPatient.setPreviousPatient(null);
      listCount--;
      return true;
    }
    if (lastPatient.getName().equals(name)) {
      //last patient in the list must be removed
      lastPatient = lastPatient.getPreviousPatient();
      lastPatient.setNextPatient(null);
      listCount--;
      return true;
    }
    DoublyLinkedPatient current = firstPatient;
    while (current.getNextPatient() != null) {
      if (current.getName().equals(name)) {
        // We found it! It is this one!
        // Now link the next and previous patients to each other.
        DoublyLinkedPatient previous = current.getPreviousPatient();
        DoublyLinkedPatient next = current.getNextPatient();
        previous.setNextPatient(next);
        next.setPreviousPatient(previous);
        listCount--;
        return true;
      }
      current = current.getNextPatient();
    }
    return false;
  }

  /**
   * Prints to the console the names of the doubly-linked patients on the
   * hospital's list, from the first patient to the last.
   */
  public void printListForwards() {
    if (firstPatient == null) {
      return;
    }
    DoublyLinkedPatient current = firstPatient;
    while (current.getNextPatient() != null) {
      System.out.println(current.getName());
      current = current.getNextPatient();
    }
    System.out.println(current.getName());
  }

  /**
   * Prints to the console the names of the doubly-linked patients on the
   * hospital's list, from the last patient to the first.
   */
  public void printListBackwards() {
    if (firstPatient == null) {
      return;
    }
    DoublyLinkedPatient current = lastPatient;
    while (current.getPreviousPatient() != null) {
      System.out.println(current.getName());
      current = current.getPreviousPatient();
    }
    System.out.println(current.getName());
  }
}
