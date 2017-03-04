package com.github.bbkpij201675.programminginjava.day08.ex06;

/**
 * A teacher has only teaching responsibilities.
 */
public class Teacher {
  private String name;

  public Teacher(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void teach(String lessonName) {
    System.out.println("Teaching lesson: " + lessonName);
  }
}