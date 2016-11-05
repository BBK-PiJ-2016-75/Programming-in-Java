//Program to print a pyramid on the screen which is made up of increasing numbers,
//from top to bottom, from 1 - 25.

print("Please enter how many levels the pyramid should be (1 - 25): ");
int level = Integer.parseInt(System.console().readLine());

if ((level >= 1) && (level <=25)) { 
	int step = 1;
	while (step <= level) {
		int space = (50 - (2 * step));
		while (space > 0) {
				print(" ");
				space--;	
		}
		int block = step;
		while (block > 0) {
      if (step < 10) {
        print(" " + step);
      } else print(step);
    block--;
    }
		println("");
		step++;
	}
} else println("That number was out of range!");