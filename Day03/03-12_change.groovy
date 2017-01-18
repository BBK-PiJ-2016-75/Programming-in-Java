//Program to display to the user what notes and coins would be received as
//change following a user-defined purchase.

print("Please enter the cost of the purchase: ");
double cost = Double.parseDouble(System.console().readLine());
print("Now, please enter the payment amount: ");
double payment = Double.parseDouble(System.console().readLine());
double change = payment - cost;
println("Your purchase cost £" + cost + " and you paid £" + payment +
    ", so your change will be £" + change + ".");

//Convert the change into ints for pounds and pence.
int changePounds = (int) change;
int changePence = (int) (Math.round(change * 100)) % 100;

//Determine how many of each note and coin is needed to make the correct change.
int fifties = changePounds / 50;
for (int i = 0; i < fifties; i++) {
  changePounds -= 50;
}
int twenties = changePounds / 20;
for (int i = 0; i < twenties; i++) {
  changePounds -= 20;
}
int tens = changePounds / 10;
for (int i = 0; i < tens; i++) {
  changePounds -= 10;
}
int fives = changePounds / 5;
for (int i = 0; i < fives; i++){
  changePounds -= 5;
}
int twos = changePounds / 2;
for (int i = 0; i < twos; i++) {
  changePounds -= 2;
}
int ones = changePounds / 1;
for (int i = 0; i < ones; i++) {
  changePounds -= 1;
}
int p50 = changePence / 50;
for (int i = 0; i < p50; i++) {
  changePence -= 50;
}
int p20 = changePence / 20;
for (int i = 0; i < p20; i++) {
  changePence -= 20;
}
int p10 = changePence / 10;
for (int i = 0; i < p10; i++) {
  changePence -= 10;
}
int p05 = changePence / 5;
for (int i = 0; i < p05; i++) {
  changePence -= 5;
}
int p02 = changePence / 2;
for (int i = 0; i < p02; i++) {
  changePence -= 2;
}
int p01 = changePence / 1;
for (int i = 0; i < p01; i++) {
  changePence -= 1;
}

//Print the resulting amounts of notes and coins.
println("Your change is made up of:");
println(fifties + " £50 notes,");
println(twenties + " £20 notes,");
println(tens + " £10 notes,");
println(fives + " £5 notes,");
println(twos + " £2 coins,");
println(ones + " £1 coins,");
println(p50 + " 50p coins,");
println(p20 + " 20p coins,");
println(p10 + " 10p coins,");
println(p05 + " 5p coins,");
println(p02 + " 2p coins, and");
println(p01 + " pennies.");