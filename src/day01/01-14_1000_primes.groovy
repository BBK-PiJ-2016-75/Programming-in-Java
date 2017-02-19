package com.github.bbkpij201675.programminginjava.day01;

//Program to find and print the first 1,000 prime numbers.

int count = 2;
int primeCount = 0;

while (primeCount < 1000) {
  boolean prime = true;
  int denom = 2;
  while ((denom < count) && (prime)) {
    if (count % denom == 0) {
      prime = false;
    } else {
      denom++;
    }
  }
  if (prime) {
    print(count + ", ");
    primeCount++;
  }
  count++;
}
println("");

println("Finished!");
