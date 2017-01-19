//Program which divides one integer by another, giving the quotient and the
//remainder, without using the "/" or "%" operators.

int div = 0;
int rem = 0;
boolean notZero = true;

print("Please enter the first integer: ");
int i = Integer.parseInt(System.console().readLine());
print("And now, please enter the second one: ");
int j = Integer.parseInt(System.console().readLine());

//Create alternative variable that can be manipulated.
int iAlt = i;

if (j == 0) {
  notZero = false;
}

while (((iAlt - j) >= 0) && (notZero)) {
  iAlt -= j;
  div++;
}

if (!notZero) {
  println("You cannot divide by zero!");
} else {
  rem = iAlt;
  println(i + " divided by " + j + " is " + div + ", remainder " + rem + ".");
}
