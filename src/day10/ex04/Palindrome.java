package com.github.bbkpij201675.programminginjava.day10.ex04;

/**
 * Program which checks if a given string is a true palindrome or not.
 */
public class Palindrome {

  public static void main(String[] args) {
    Palindrome myPalindrome = new Palindrome();
    myPalindrome.launch();
  }

  /**
   * Recursive method which checks if a string is a palindrome or not.
   *
   * @param toCheck the string to be checked
   * @return true if the string is a palindrome, false if it isn't
   */
  private boolean checkPalindrome(String toCheck) {
    int remaining = toCheck.length();
    if (remaining <= 1) {
      return true;
    } else {
      char start = Character.toLowerCase(toCheck.charAt(0));
      char end = Character.toLowerCase(toCheck.charAt(remaining - 1));
      if (Character.isLetter(start) && Character.isLetter(end)) {
        if (start == end) {
          String shorterCheck = toCheck.substring(1, remaining - 1);
          return checkPalindrome(shorterCheck);
        } else {
          return false;
        }
      } else if (!Character.isLetter(start)) {
        String shorterCheck = toCheck.substring(1);
        return checkPalindrome(shorterCheck);
      } else {
        String shorterCheck = toCheck.substring(0, remaining - 1);
        return checkPalindrome(shorterCheck);
      }
    }
  }

  private void launch() {
    String palindrome = "Able was I, 'ere I saw Elba!";
    System.out.println("String to check: " + palindrome);
    System.out.println(palindrome + " is a palindrome: "
        + checkPalindrome(palindrome));
  }
}
