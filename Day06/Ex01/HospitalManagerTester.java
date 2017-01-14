public class HospitalManagerTester {
  
  public static void main(String[] args) {
    HospitalManagerTester tester = new HospitalManagerTester();
    tester.run();
  }
  
  public void run() {
    HospitalManager myHospital = new HospitalManager();
    myHospital.addPatient(new Patient("John Doe", 45, "Palsy"));
    myHospital.addPatient(new Patient("Jane Doe", 35, "Palsy"));
    myHospital.addPatient(new Patient("Steve Doe", 45, "Palsy"));
    myHospital.addPatient(new Patient("George Doe", 45, "Palsy"));
    myHospital.addPatient(new Patient("Dennis Doe", 45, "Palsy"));
    myHospital.addPatient(new Patient("Eli Doe", 45, "Palsy"));
    myHospital.addPatient(new Patient("Mary Doe", 45, "Palsy"));
    myHospital.addPatient(new Patient("Peter Doe", 45, "Palsy"));
    myHospital.addPatient(new Patient("Paul Doe", 45, "Palsy"));
    myHospital.addPatient(new Patient("Ringo Doe", 45, "Palsy"));
    myHospital.printPatientList();
    System.out.println(myHospital.getListCount());
    myHospital.deletePatient("George Doe");
    myHospital.deletePatient("Peter Doe");
    myHospital.deletePatient("John Doe");
    myHospital.printPatientList();
    System.out.println(myHospital.getListCount());
  }
}