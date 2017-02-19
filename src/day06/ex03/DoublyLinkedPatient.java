package com.github.bbkpij201675.programminginjava.day06.ex03;

/**
 * Creates a hospital patient which is linked to both the next and previous
 * patients in a list.
 */
public class DoublyLinkedPatient {
  private String name = null;
  private int age = 0;
  private String illness = null;
  private DoublyLinkedPatient nextPatient = null;
  private DoublyLinkedPatient previousPatient = null;

  /**
   * Constructs a patient object from a provided name, age, and illness.
   * @param name the patient's name.
   * @param age the patient's age.
   * @param illness the patient's illness.
   */
  public DoublyLinkedPatient(String name, int age, String illness) {
    this.name = name;
    this.age = age;
    this.illness = illness;
  }

  //Sets the patient's name.
  public void setName(String name) {
    this.name = name;
  }

  //Sets the patient's age.
  public void setAge(int age) {
    this.age = age;
  }

  //Sets the patient's illness.
  public void setIllness(String illness) {
    this.illness = illness;
  }

  //Sets the next patient.
  public void setNextPatient(DoublyLinkedPatient nextPatient) {
    this.nextPatient = nextPatient;
  }

  //Sets the previous patient.
  public void setPreviousPatient(DoublyLinkedPatient previousPatient) {
    this.previousPatient = previousPatient;
  }

  //Returns the patient's name.
  public String getName() {
    return this.name;
  }

  //Returns the patient's age.
  public int getAge() {
    return this.age;
  }

  //Returns the patient's illness.
  public String getIllness() {
    return  this.illness;
  }

  //Returns the next patient in the list.
  public DoublyLinkedPatient getNextPatient() {
    return this.nextPatient;
  }

  //Returns the previous patient in the list.
  public DoublyLinkedPatient getPreviousPatient() {
    return this.previousPatient;
  }
}
