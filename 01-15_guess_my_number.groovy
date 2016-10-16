int numberToGuess = Math.abs(1000 * Math.random());
int guessCount = 0
boolean guessed = false;
println("Try to guess my number!");
while (!guessed){
	print("Tell me a number: ");
	int guess = Integer.parseInt(System.console().readLine());
	if (guess < numberToGuess) {
		println("No! My number is higher.");
	} else if (guess > numberToGuess) {
		println("No! My number is lower.");
	} else {
		println("CORRECT!");
		guessed = true;
	}
	guessCount++;
}
println("You needed " + guessCount + " guesses.");
