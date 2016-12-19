//Program that takes five cards from the user and then outputs the best poker
//hand that the user has.

int hand = 0;

int card1 = 0;
int card2 = 0;
int card3 = 0;
int card4 = 0;
int card5 = 0;
int heartTot = 0;
int spadeTot = 0;
int clubTot = 0;
int diamTot = 0;

println("Please provide 5 cards' ranks (1,2,3,4,5,6,7,8,9,10,J,Q,K) and suits.");
print("Please enter your first card rank: ");
String card = System.console().readLine;
If (card.charAt(0) == 'J') {
  card1 = 11;
} else if (card.charAt(0) == 'Q') {
  card1 = 12;
}
print("Now, please enter your first card suit: ");
Str suit = System.console().readLine
 