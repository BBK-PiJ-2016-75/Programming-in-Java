public class CircularHospitalManagerTester {
  
  public static void main(String[] args) {
    CircularHospitalManagerTester tester = new CircularHospitalManagerTester();
    tester.run();
  }
  
  private void run() {
    CircularHospitalManager myHospital = new CircularHospitalManager();
    myHospital.addPatient(new CircularPatient("John Doe", 45, "Palsy"));
    myHospital.addPatient(new CircularPatient("Jane Doe", 35, "Palsy"));
    myHospital.addPatient(new CircularPatient("Steve Doe", 45, "Palsy"));
    myHospital.addPatient(new CircularPatient("George Doe", 45, "Palsy"));
    myHospital.addPatient(new CircularPatient("Dennis Doe", 45, "Palsy"));
    myHospital.addPatient(new CircularPatient("Eli Doe", 35, "Palsy"));
    myHospital.addPatient(new CircularPatient("Mary Doe", 35, "Palsy"));
    myHospital.addPatient(new CircularPatient("Peter Doe", 45, "Palsy"));
    myHospital.addPatient(new CircularPatient("Paul Doe", 45, "Palsy"));
    myHospital.addPatient(new CircularPatient("Ringo Doe", 45, "Palsy"));
    System.out.println("------------");
    System.out.println("Total number of patients in list: " + myHospital.getListCount());
    System.out.println("First paitent name: " + myHospital.getFirstPatient().getName());
    myHospital.printPatientList();
    myHospital.deletePatient("George Doe");
    myHospital.deletePatient("Peter Doe");
    myHospital.deletePatient("John Doe");
    myHospital.deletePatient("Ringo Doe");
    System.out.println("------------");
    System.out.println("Total number of patients in list: " + myHospital.getListCount());
    System.out.println("First paitent name: " + myHospital.getFirstPatient().getName());
    myHospital.printPatientList();
    myHospital.addPatient(new CircularPatient("Luke Skywalker", 45, "Palsy"));
    myHospital.deletePatient("Darth Vader");
    System.out.println("------------");
    System.out.println("Total number of patients in list: " + myHospital.getListCount());
    System.out.println("First paitent name: " + myHospital.getFirstPatient().getName());
    myHospital.printPatientList();
  }
}