package com.github.bbkpij201675.programminginjava.day08.ex05;

/**
 * A classical guitar object is both a musical instrument and a wooden object,
 * which means that it can both play music and be burnt.
 */
public class Guitar implements MusicalInstrument, WoodenObject {

  @Override
  public void play(String music) {
    System.out.println("Playing: " + music);
  }

  @Override
  public void burn() {
    System.out.println("The guitar is aflame.");
  }
}
