//Program that outputs whether or not the series of entered numbers are in sequence, either greater or smaller.

int step = 0;
boolean sequence = true;
boolean finished = false;

print("Please enter a positive integer (-1 to finish): ");
int i = Integer.parseInt(System.console().readLine());

if (i == -1) {
	finished = true;
} else step = i;

while (!finished) {
	print("Please enter another positive integer (-1 to finish): ");
	int j = Integer.parseInt(System.console().readLine());
	if (j == -1) {
		finished = true;
	} else if (j != (step + 1) && j != (step - 1)) {
		sequence = false;
	}
	if (j < step) {
		step--;
	} else step++;
}

if (sequence) {
	println("Yes.");
} else println("No.");