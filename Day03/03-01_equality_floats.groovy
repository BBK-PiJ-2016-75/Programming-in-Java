//Program to show that floating point equality is an approximation,
//not an absolute.

double d1 = 1.255;
double d2 = d1 + 7 - 4 - 3;

if (Math.abs(d1 - d2) < 10E-6) {
	println("1.255 is equal to 1.255 plus 7 minus 7");
} else {
	println("1.255 is NOT equal to 1.255 plus 7 minus 7");
}

//Print the values of d1 and d2.
print(d1 + "  " + d2);