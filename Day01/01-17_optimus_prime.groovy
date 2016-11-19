//Program to find and print the nearest prime number to a user provided integer.

print("Please enter a positive integer: ");
int target = Integer.parseInt(System.console().readLine());
boolean nearPos = false;
boolean nearNeg = false;
int posCount = target + 1;
int negCount = target - 1;

while (!nearPos) {
	int denom = 2;
	while (denom < posCount) {
		if (posCount % denom == 0) {
			posCount++;
			denom = 2;
		} else denom++;
	}
	nearPos = true;
}

while (!nearNeg) {
	int denom = 2;
	while (denom < negCount) {
		if (negCount % denom == 0) {
			negCount--;
			denom = 2;
		} else denom++;
	}
	nearNeg = true;
}

int posDiff = posCount - target;
int negDiff = target - negCount;
if (posDiff < negDiff) {
	println("The nearest prime number is " + posCount + ".");
} else if (negDiff < posDiff) {
	println("The nearest prime number is " + negCount + ".");
}else println("The nearest prime numbers are " + negCount + " and " + posCount + ".");