package com.github.bbkpij201675.programminginjava.day06.ex01;

/**
 * Creates and manages a list of patients for a hospital.
 */
public class HospitalManager {
  private Patient firstPatient = null;
  private int listCount = 0;

  public Patient getFirstPatient() {
    return this.firstPatient;
  }

  public int getListCount() {
    return this.listCount;
  }

  /**
   * Adds a new patient to the hospital's list.
   * @param newPatient the patient to add to the hospital's list.
   */
  public void addPatient(Patient newPatient) {
    listCount++;
    if (firstPatient == null) {
      firstPatient = newPatient;
      return;
    }
    Patient current = firstPatient;
    while (current.getNextPatient() != null) {
      // this means we are not yet at the end of the list
      current = current.getNextPatient();
    }
    // at this point, current points to the last patient
    current.setNextPatient(newPatient);
  }

  /**
   * Removes a patient from the hospital's list by name.
   * @param name the name of the patient to remove from the hospital's list.
   * @return true if the patient is found and removed, false otherwise.
   */
  public boolean deletePatient(String name) {
    if (firstPatient == null) {
      // list is empty, nothing to remove
      return false;
    }
    if (firstPatient.getName().equals(name)) {
      // first patient in the list must be removed
      firstPatient = firstPatient.getNextPatient();
      listCount--;
      return true;
    }
    Patient current = firstPatient;
    while (current.getNextPatient() != null) {
      if (current.getNextPatient().getName().equals(name)) {
        // We found it! It is the next one!
        // Now link this patient to the one after the next
        current.setNextPatient(current.getNextPatient().getNextPatient());
        listCount--;
        return true;
      }
      current = current.getNextPatient();
    }
    return false;
  }

  /**
   * Prints to the console the names of the patients on the hospital's list.
   */
  public void printPatientList() {
    if (firstPatient == null) {
      return;
    }
    Patient current = firstPatient;
    while (current.getNextPatient() != null) {
      System.out.println(current.getName());
      current = current.getNextPatient();
    }
    System.out.println(current.getName());
  }
}
