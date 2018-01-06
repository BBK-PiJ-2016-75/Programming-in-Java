package groovy.day01;

//Program to find and print all of the prime numbers up to 1,000.

int count = 2;

while (count < 1000) {
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
  }
  count++;
}
println("");

println("Finished!");
