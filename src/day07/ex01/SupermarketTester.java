package com.github.bbkpij201675.programminginjava.day07.ex01;

/**
 * Simple program to test the methods of the Supermarket class.
 */
public class SupermarketTester {

  public static void main(String[] args) {
    SupermarketTester tester = new SupermarketTester();
    tester.run();
  }

  private void run() {
    Supermarket mySupermarket = new Supermarket();
    System.out.println("The max size for this queue is: "
        + mySupermarket.getMaxSize());
    mySupermarket.insert(new Person("John Doe"));
    mySupermarket.insert(new Person("Jane Doe"));
    mySupermarket.insert(new Person("Steve Doe"));
    mySupermarket.insert(new Person("George Doe"));
    mySupermarket.insert(new Person("Dennis Doe"));
    mySupermarket.insert(new Person("Eli Doe"));
    mySupermarket.insert(new Person("Mary Doe"));
    mySupermarket.insert(new Person("Peter Doe"));
    mySupermarket.insert(new Person("Paul Doe"));
    mySupermarket.insert(new Person("Ringo Doe"));
    System.out.println("The current size of the queue is: "
        + mySupermarket.getSize());
    mySupermarket.printQueue();
    mySupermarket.retrieve();
    mySupermarket.retrieve();
    mySupermarket.retrieve();
    System.out.println("Now, the size of the queue is: "
        + mySupermarket.getSize());
    mySupermarket.insert(new Person("Luke Skywalker"));
    mySupermarket.insert(new Person("Darth Vader"));
    mySupermarket.insert(new Person("Boba Fett"));
    mySupermarket.insert(new Person("Jar-Jar Binks"));
    mySupermarket.printQueue();
  }
}
