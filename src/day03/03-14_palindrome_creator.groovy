package com.github.bbkpij201675.programminginjava.day03;

//Program to turn the entered text into a palindrome.

print("Please enter some text to turn into a palindrome: ");
String text = System.console().readLine();
String palindrome = text;
for (int i = 0; i < text.length(); i++) {
  palindrome += text.charAt((text.length() - 1) - i);
}
println(palindrome);
