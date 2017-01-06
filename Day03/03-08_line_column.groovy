//Program to take text from the user and print it to screen, one word per line.

print("Please enter some text: ");
String str = System.console().readLine();
for (int i = 0; i < str.length(); i++) {
  if (str.charAt(i) == ' ') {
    println("");
  } else {
    print(str.charAt(i));
  }
}