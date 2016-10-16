int max = 0;
boolean finished = false;
while (!finished) {
	print("Please enter a positive integer (-1 to finish): ");
	int i = Integer.parseInt(System.console().readLine());
	if (i == -1) {
		finished = true;
	} else if (i > max) {
		max = i;
	}
}
println("The highest number you entered was " + max);