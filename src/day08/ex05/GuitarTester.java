package com.github.bbkpij201675.programminginjava.day08.ex05;

/**
 * Simple program to test the methods of the Guitar class.
 */
public class GuitarTester {

  public static void main(String[] args) {
    GuitarTester tester = new GuitarTester();
    tester.launch();
  }

  private void launch() {
    Guitar myAxe = new Guitar();
    myAxe.play("Stairway to Heaven");
    myAxe.burn();
  }
}
