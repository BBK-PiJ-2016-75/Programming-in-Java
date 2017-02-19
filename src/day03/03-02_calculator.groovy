package com.github.bbkpij201675.programminginjava.day03;

//Program that takes two numbers from the user, and then performs
//the chosen operation.

print("Enter the first number: ");
double first = Double.parseDouble(System.console().readLine());
print("And now, enter the second number: ");
double second = Double.parseDouble(System.console().readLine());

println("Now choose which operation you wish to carry out: ");
println("For addition, enter 1.");
println("For subtraction, enter 2.");
println("For multiplication, enter 3.");
println("For division, enter 4.");
print("Please enter your choice: ");
int choice = Integer.parseInt(System.console().readLine());

switch (choice) {
  case 1:
    double add = first + second;
    println(first + " plus " + second + " is " + add + ".");
    break;
  case 2:
    double subtract = first - second;
    println(first + " minus " + second + " is " + subtract + ".");
    break;
  case 3:
    double times = first * second;
    println(first + " times " + second + " is " + times + ".");
    break;
  case 4:
    double over = first / second;
    println(first + " divided by " + second + " is " + over + ".");
    break;
  default:
    println("That was not a valid option!");
    break;
}
