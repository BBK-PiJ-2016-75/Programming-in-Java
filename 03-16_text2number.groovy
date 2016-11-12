//Programe to turn the enetered text into a palindrome.
print("Please enter a number, using commas and decimal points, if required: ");
String numberEntered = System.console().readLine();
String numberScreened = "";
String decimalScreened = "";
boolean foundDecimal = false;
int decimalPlaces = 0;
for (int i = 0; i < numberEntered.length(); i++) {
  if (!foundDecimal && Character.isDigit(numberEntered.charAt(i))) {
    numberScreened += numberEntered.charAt(i);
  } else if (!foundDecimal && numberEntered.charAt(i) == '.') {
    decimalPlaces = i;
    foundDecimal = true;
  } else if (foundDecimal && Character.isDigit(numberEntered.charAt(i))) {
    decimalScreened += numberEntered.charAt(i);
  }
}
int wholeNumber = Integer.parseInt(numberScreened);
int decimalNumber = Integer.parseInt(decimalScreened);
println("You entered: " + wholeNumber + "." + decimalNumber);
println("Half of that number is: " + wholeNumber / 2 + "." + (decimalNumber * 10) / 2);