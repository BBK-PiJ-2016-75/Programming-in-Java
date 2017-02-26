package com.github.bbkpij201675.programminginjava.day06.ex01.paircoding;

import com.github.bbkpij201675.programminginjava.day06.ex01.HospitalManager;
import com.github.bbkpij201675.programminginjava.day06.ex01.Patient;

/**
 * Simple program to test the methods of the HospitalManager class.
 */
public class TestHospitalManager {

  public static void main(String[] args) {
    TestHospitalManager tester = new TestHospitalManager();
    tester.run();
  }

  private void run() {

    //Patient fPatient = hm.getFirstPatient();
    // System.out.println("Patient name: " + fPatient.getName());

    boolean running = true;
    while (running) {
      System.out.println("What would you like to do?");
      System.out.println("1 - Add a new patient file");
      System.out.println("2 - Delete an existing patient file");
      System.out.println("0 - Exit");
      System.out.println("\n >");

      //Scanner reader = new Sca(System.in);
      // int input = reader.nextInt();

      try {
        String userInput = System.console().readLine();

        int userSelection = Integer.parseInt(userInput);

        switch (userSelection) {
          case 0:
            running = false;
            break;

          case 1:
            System.out.println("Please enter patient details.");
            System.out.println("You selected option 1 : Enter first name:");
            String name = System.console().readLine();
            System.out.println("Please Enter age:");
            int age = Integer.parseInt(System.console().readLine());
            System.out.println("Please Enter illness:");
            String illness = System.console().readLine();
            HospitalManager hm = new HospitalManager();
            Patient firstPatient = hm.getFirstPatient();
            hm.addPatient(firstPatient);
            System.out.println("\n");
            System.out.println("Name: " + firstPatient.getName() + " Age: "
                + firstPatient.getAge() + " illness :" + firstPatient.getIllness());
            System.out.println("\n");
            break;

          case 2:
            break;

          default:
            System.out.println("Invalid option selected. Please try again.");
        }
      } catch (NumberFormatException ex) {
        running = false;
        System.out.println("Please enter a valid integer. Error processing input.");
      }
    }
  }
}
