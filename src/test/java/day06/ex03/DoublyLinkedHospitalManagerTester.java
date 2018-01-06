package day06.ex03;

/**
 * Simple program to test the methods of the DoublyLinkedHospitalManager class.
 */
public class DoublyLinkedHospitalManagerTester {

  /**
   * Creates a launcher.
   *
   * @param args command-line arguments.
   */
  public static void main(String[] args) {
    DoublyLinkedHospitalManagerTester tester
        = new DoublyLinkedHospitalManagerTester();
    tester.launch();
  }

  private void launch() {
    DoublyLinkedHospitalManager myHospital = new DoublyLinkedHospitalManager();
    myHospital.addPatient(new DoublyLinkedPatient("John Doe", 45, "Palsy"));
    myHospital.addPatient(new DoublyLinkedPatient("Jane Doe", 35, "Palsy"));
    myHospital.addPatient(new DoublyLinkedPatient("Steve Doe", 45, "Palsy"));
    myHospital.addPatient(new DoublyLinkedPatient("George Doe", 45, "Palsy"));
    myHospital.addPatient(new DoublyLinkedPatient("Dennis Doe", 45, "Palsy"));
    myHospital.addPatient(new DoublyLinkedPatient("Eli Doe", 35, "Palsy"));
    myHospital.addPatient(new DoublyLinkedPatient("Mary Doe", 35, "Palsy"));
    myHospital.addPatient(new DoublyLinkedPatient("Peter Doe", 45, "Palsy"));
    myHospital.addPatient(new DoublyLinkedPatient("Paul Doe", 45, "Palsy"));
    myHospital.addPatient(new DoublyLinkedPatient("Ringo Doe", 45, "Palsy"));
    System.out.println("------------");
    System.out.println("Total number of patients in list: "
        + myHospital.getListCount());
    System.out.println("First patient name: "
        + myHospital.getFirstPatient().getName());
    myHospital.printListForwards();
    System.out.println("Last patient name: "
        + myHospital.getLastPatient().getName());
    myHospital.printListBackwards();
    myHospital.deletePatient("George Doe");
    myHospital.deletePatient("Peter Doe");
    myHospital.deletePatient("John Doe");
    myHospital.deletePatient("Ringo Doe");
    System.out.println("------------");
    System.out.println("Total number of patients in list: "
        + myHospital.getListCount());
    System.out.println("First patient name: "
        + myHospital.getFirstPatient().getName());
    myHospital.printListForwards();
    System.out.println("Last patient name: "
        + myHospital.getLastPatient().getName());
    myHospital.printListBackwards();
    myHospital.addPatient(new DoublyLinkedPatient("Luke Skywalker", 45, "Palsy"));
    myHospital.deletePatient("Darth Vader");
    System.out.println("------------");
    System.out.println("Total number of patients in list: "
        + myHospital.getListCount());
    System.out.println("First patient name: "
        + myHospital.getFirstPatient().getName());
    myHospital.printListForwards();
    System.out.println("Last patient name: "
        + myHospital.getLastPatient().getName());
    myHospital.printListBackwards();
  }
}
