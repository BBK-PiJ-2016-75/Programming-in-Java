//Program that asks for a text and then counts letters in a loop and a half.
//If the user enters a letter that has already been counted, it exits.

print("Please write a text: ");
String text = System.console().readLine();
String alreadyChecked = "";
boolean repeated = false;
while (!repeated) {
  print("Which letter would you like to count now? ");
  String check = System.console().readLine();
  for (int i = 0; i < alreadyChecked.length() && !repeated; i++) {
    if (alreadyChecked.charAt(i) == check.charAt(0)) {
      repeated = true;
    }
  }
  if (repeated) {
    println("Repeated character. Exiting the program...");
    break;
  }
  int count = 0;
  for (int j = 0; j < text.length(); j++) {
    if (text.charAt(j) == check.charAt(0)) {
      count++;
    }
  }
  println("There are " + count + " in your text.");
  alreadyChecked += check;
}
println("Thank you for your cooperation. Good bye!");