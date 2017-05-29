package com.github.bbkpij201675.programminginjava.day09.ex05;

/**
 * Simple program to test the methods of the GenericNumberStack class.
 */
public class GenericNumberStackTester {

  public static void main(String[] args) {
    GenericNumberStackTester tester = new GenericNumberStackTester();
    tester.launch();
  }

  private void launch() {
    GenericNumberStack<Double> myNumberStack = new GenericNumberStack<>(0.0);
    myNumberStack.push(1.1);
    myNumberStack.push(2.2);
    myNumberStack.push(3.3);
    myNumberStack.push(4.4);
    myNumberStack.push(5.5);
    System.out.println("Stack is empty: " + myNumberStack.isEmpty());
    myNumberStack.pop();
    myNumberStack.pop();
    myNumberStack.pop();
    myNumberStack.pop();
    myNumberStack.pop();
    System.out.println("Stack is empty: " + myNumberStack.isEmpty());
    // GenericNumberStack<String> myStringStack = new GenericNumberStack<>("0.0");
  }
}
