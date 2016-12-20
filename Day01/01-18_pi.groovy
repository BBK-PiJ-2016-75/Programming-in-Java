//This program adds a number of terms together in order to calculate Pi.

int base = 4;
double total = 0;
print("Please enter how many terms of Pi you wish to calculate: ");
int terms = Integer.parseInt(System.console().readLine());

for (int i = 0; i < terms; i++) {
  total += base / ((i * 2) + 1);
  base = -base;
}

println(total);