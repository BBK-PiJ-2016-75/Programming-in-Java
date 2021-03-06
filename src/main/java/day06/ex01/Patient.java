package day06.ex01;

/**
 * Creates a hospital patient.
 */
public class Patient {
  private String name = null;
  private int age = 0;
  private String illness = null;
  private Patient nextPatient = null;

  /**
   * Constructs a patient object from a provided name, age, and illness.
   *
   * @param name    the patient's name.
   * @param age     the patient's age.
   * @param illness the patient's illness.
   */
  public Patient(String name, int age, String illness) {
    this.name = name;
    this.age = age;
    this.illness = illness;
  }

  //Returns the patient's name.
  public String getName() {
    return this.name;
  }

  //Sets the patient's name.
  public void setName(String name) {
    this.name = name;
  }

  //Returns the patient's age.
  public int getAge() {
    return this.age;
  }

  //Sets the patient's age.
  public void setAge(int age) {
    this.age = age;
  }

  //Returns the patient's illness.
  public String getIllness() {
    return this.illness;
  }

  //Sets the patient's illness.
  public void setIllness(String illness) {
    this.illness = illness;
  }

  //Returns the next patient in the list.
  public Patient getNextPatient() {
    return this.nextPatient;
  }

  //Sets the next patient.
  public void setNextPatient(Patient nextPatient) {
    this.nextPatient = nextPatient;
  }
}
