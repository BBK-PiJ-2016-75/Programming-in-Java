//Programe to check whether or not the entered text is a palindrome.
print("Please enter some text to check: ");
String text = System.console().readLine();
boolean palindrome = true;
for (int i = 0; i < (text.length() / 2); i++) {
  if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
    palindrome = false;
  }
}
if (palindrome) {
  println("The text you entered is a palindrome.");
} else println("The text you entered is not a palindrome.");