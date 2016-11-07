//Program that asks the user to enter some text, and then a letter.
//It then proceeds to count how many times that letter appears in the text.
print("Please enter some text: ");
String str = System.console().readLine();
print("Now, please enter the letter you wish to count: ");
String check = System.console().readLine();
int count = 0;
for (int i = 0; i < str.length(); i++) {
  if (str.charAt(i) == check.charAt(0)) {
    count++;
  }
}
println("The letter \"" + check.charAt(0) + "\" appears in your text a total of " + count + " times.");