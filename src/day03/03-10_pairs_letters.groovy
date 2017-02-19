package com.github.bbkpij201675.programminginjava.day03;

//Program that asks the user to enter a short phrase, and then some longer text.
//It then proceeds to count how many times that phrase appears in the text.

print("Please enter the short phrase you wish to count: ");
String check = System.console().readLine();
print("Now, please enter some longer text: ");
String text = System.console().readLine();

int count = 0;

for (int i = 0; i <= text.length() - check.length(); i++) {
  if (text.charAt(i) == check.charAt(0)) {
    boolean match = true;
    for (int j = 0; j < check.length() && match; j++) {
      if (text.charAt(i + j) != check.charAt(j)) {
        match = false;
      }
    }
    if (match) {
      count++;
    }
  }
}

println("The phrase \"" + check + "\" appears in your text a total of "
    + count + " times.");
