package com.github.bbkpij201675.programminginjava.day01;

//Program which multiplies two integers supplied by the user,
//without using the "*" operator.

int total = 0;
int count = 0;

print("Please enter the first integer: ");
int i = Integer.parseInt(System.console().readLine());
print("Now, please enter the second integer: ");
int j = Integer.parseInt(System.console().readLine());

//Create alternate variables that might be manipulated.
int iAlt = i;
int jAlt = j;

//If multiplying by a negative number.
if (jAlt < 0) {
  iAlt = -iAlt;
  jAlt = -jAlt;
}

while (count < jAlt) {
  total += iAlt;
  count++;
}

println(i + " multiplied by " + j + " equals " + total + ".");
