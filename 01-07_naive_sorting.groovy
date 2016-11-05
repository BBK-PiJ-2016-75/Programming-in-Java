//This program sorts three integers that the user inputs, in ascending order.

print("Please enter the first integer: ");
int first = Integer.parseInt(System.console().readLine());
print("Now, please enter the second integer: ");
int second = Integer.parseInt(System.console().readLine());
print("Finally, please enter the third one: ");
int third = Integer.parseInt(System.console().readLine());

if ((first >= second) && (first >= third)) {
	if (second >= third) {
		println(third + ", " + second + ", " + first);
	} else println(second + ", " + third + ", " + first);
} else if ((second >= first) && (second >= third)) {
	if (first >= third) {
		println(third + ", " + first + ", " + second);
	} else println(first + ", " + third + ", " + second);
} else if (first >= second) {
	println(second + ", " + first + ", " + third);
} else println(first + ", " + second + ", " + third);