package com.github.bbkpij201675.programminginjava.day06.ex01;

/**
 * Simple program to test the methods of the HospitalManager class.
 */
public class HospitalManagerTester {

  public static void main(String[] args) {
    HospitalManagerTester tester = new HospitalManagerTester();
    tester.run();
  }

  private void run() {
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
    System.out.println("------------");
    System.out.println("Total number of patients in list: "
        + myHospital.getListCount());
    System.out.println("First patient name: "
        + myHospital.getFirstPatient().getName());
    myHospital.printPatientList();
    myHospital.deletePatient("George Doe");
    myHospital.deletePatient("Peter Doe");
    myHospital.deletePatient("John Doe");
    myHospital.deletePatient("Ringo Doe");
    System.out.println("------------");
    System.out.println("Total number of patients in list: "
        + myHospital.getListCount());
    System.out.println("First patient name: "
        + myHospital.getFirstPatient().getName());
    myHospital.printPatientList();
    myHospital.addPatient(new Patient("Luke Skywalker", 45, "Palsy"));
    myHospital.deletePatient("Darth Vader");
    System.out.println("------------");
    System.out.println("Total number of patients in list: "
        + myHospital.getListCount());
    System.out.println("First patient name: "
        + myHospital.getFirstPatient().getName());
    myHospital.printPatientList();
  }
}
