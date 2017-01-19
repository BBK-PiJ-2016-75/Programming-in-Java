//Program to check whether or not the entered text is a palindrome, strict or
//relaxed. First, it keeps only the letters, then it coverts them to lower-case.

print("Please enter some text to check: ");
String text = System.console().readLine();

//Remove all punctuation or other characters from entered string.
String lettersOnlyText = "";
for (int i = 0; i < text.length(); i++) {
  if (Character.isLetter(text.charAt(i))) {
    lettersOnlyText += text.charAt(i);
  }
}

//Convert all letters to lower-case.
String lowerCaseText = "";
for (int i = 0; i < lettersOnlyText.length(); i++) {
  lowerCaseText += Character.toLowerCase(lettersOnlyText.charAt(i));
}

//Check if converted string is a palindrome.
boolean palindrome = true;
for (int i = 0; i < (lowerCaseText.length() / 2) && palindrome; i++) {
  if (lowerCaseText.charAt(i) != lowerCaseText.charAt((lowerCaseText.length()
      - 1) - i)) {
    palindrome = false;
  }
}

if (palindrome) {
  println("Yes! The text you entered is either a strict or relaxed palindrome.");
} else {
  println("Sorry, buddy! The text you entered is neither a strict nor relaxed palindrome.");
}
