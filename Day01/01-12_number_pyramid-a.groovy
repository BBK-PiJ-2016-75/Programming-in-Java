//Program to print a pyramid on the screen which is made up of increasing numbers,
//from top to bottom. It involves an infinite loop.

int count = 1;

while (count > 0) {
	int step = count;
	while (step > 0) {
		print(count);
		step--;
	}
	println("");
	count++;
}