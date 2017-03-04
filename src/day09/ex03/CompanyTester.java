package com.github.bbkpij201675.programminginjava.day09.ex03;

/**
 * Simple program to test the Company class, using the methods of the
 * GenericDoublyLinkedList class.
 */
public class CompanyTester {

  public static void main(String[] args) {
    CompanyTester tester = new CompanyTester();
    tester.run();
  }

  private void run() {
    Company myCompany = new Company();
    myCompany.employeeNames.addElement("Joe Bloggs");
    myCompany.employeeNames.addElement("Jane Bloggs");
    myCompany.employeeNames.addElement("Timmy Bloggs");
    myCompany.employeeNames.addElement("Judy Bloggs");
    myCompany.employeeNames.addElement("Sally Bloggs");
    myCompany.employeeNames.print();
    System.out.println("Total Names: " + myCompany.employeeNames.getListCount());
    myCompany.employeeNI.addElement(12345);
    myCompany.employeeNI.addElement(23456);
    myCompany.employeeNI.addElement(34567);
    myCompany.employeeNI.addElement(45678);
    myCompany.employeeNI.addElement(56789);
    myCompany.employeeNI.print();
    System.out.println("Total NI Numbers: " + myCompany.employeeNI.getListCount());
    myCompany.employeeNames.deleteElement("Joe Bloggs");
    myCompany.employeeNames.deleteElement("Sally Bloggs");
    myCompany.employeeNames.deleteElement("Timmy Bloggs");
    myCompany.employeeNames.print();
    System.out.println("Total Names: " + myCompany.employeeNames.getListCount());
    myCompany.employeeNI.deleteElement(12345);
    myCompany.employeeNI.deleteElement(56789);
    myCompany.employeeNI.deleteElement(34567);
    myCompany.employeeNI.print();
    System.out.println("Total NI Numbers: " + myCompany.employeeNI.getListCount());
  }
}
