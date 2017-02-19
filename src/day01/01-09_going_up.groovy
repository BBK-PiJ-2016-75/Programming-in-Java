package com.github.bbkpij201675.programminginjava.day01;

//Program that outputs whether or not the series of entered numbers are
//sequentially greater or not.

int step = 0;
boolean rise = true;
boolean finished = false;

print("Please enter a positive integer (-1 to finish): ");
int i = Integer.parseInt(System.console().readLine());

if (i == -1) {
  finished = true;
} else {
  step = i;
}

while (!finished) {
  print("Please enter another positive integer (-1 to finish): ");
  int j = Integer.parseInt(System.console().readLine());
  if (j == -1) {
    finished = true;
  } else if (j != (step + 1)) {
    rise = false;
  }
  step++;
}

if (rise) {
  println("Yes.");
} else {
  println("No.");
}
