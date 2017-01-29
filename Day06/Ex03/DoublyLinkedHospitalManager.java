package ex03;

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
   * sdf
   * @param newPatient
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

  // this is a member method of class HospitalManager
  // returns true if the patient was found and removed, false otherwise
  
  /**
   * sdfas
   * @param name
   * @return
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
   * sdfsd
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
   * asdas
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