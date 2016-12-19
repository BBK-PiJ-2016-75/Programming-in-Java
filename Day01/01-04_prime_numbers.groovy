//This program informs the user whether or not the number entered is prime.

boolean prime = true;
int i = 0;
int j = 2;

print("Please enter an integer: ");
i = Integer.parseInt(System.console().readLine());

if (i < 2) {
  prime = false;
} else while ((j < i) && (prime)) {
	if (i % j == 0) {
		prime = false;
	} else {
    j++;
  }
}

if (prime) {
	println(i + " is prime!");
} else {
  println(i + " is not prime, sorry.");
}