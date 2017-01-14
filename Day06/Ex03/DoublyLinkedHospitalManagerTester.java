public class DoublyLinkedHospitalManagerTester {
  
  public static void main(String[] args) {
    DoublyLinkedHospitalManagerTester tester = new DoublyLinkedHospitalManagerTester();
    tester.run();
  }
  
  public void run() {
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
    System.out.println(myHospital.getListCount());
    myHospital.printListForwards();
    myHospital.printListBackwards();
    System.out.println(myHospital.getFirstPatient().getName());
    System.out.println(myHospital.getLastPatient().getName());
    myHospital.deletePatient("George Doe");
    myHospital.deletePatient("Peter Doe");
    myHospital.deletePatient("John Doe");
    myHospital.deletePatient("Ringo Doe");
    System.out.println(myHospital.getListCount());
    myHospital.printListForwards();
    myHospital.printListBackwards();
    System.out.println(myHospital.getFirstPatient().getName());
    System.out.println(myHospital.getLastPatient().getName());
  }
}