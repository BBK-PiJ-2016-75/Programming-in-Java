//Program to turn the entered number, which could include commas and a decimal
//point, into a double, and then halve it. Cannot use Double.parseDouble().

print("Please enter a number, using commas and decimal points, if required: ");
String numberEntered = System.console().readLine();

//Take the entered number and divide it into integer and fractional parts.
String integerPart = "";
String fractionalPart = "";
boolean foundDecimal = false;
for (int i = 0; i < numberEntered.length(); i++) {
  if (!foundDecimal && Character.isDigit(numberEntered.charAt(i))) {
    integerPart += numberEntered.charAt(i);
  } else if (foundDecimal && Character.isDigit(numberEntered.charAt(i))) {
    fractionalPart += numberEntered.charAt(i);
  } else if (!foundDecimal && numberEntered.charAt(i) == '.') {
    foundDecimal = true;
  } 
}

//Assemble the parts into a string, convert it to a double, then halve it.
String numberAssembled = integerPart + "." + fractionalPart;
double number = (double) Double.valueOf(numberAssembled);
double halved = number / 2;

//Take halved amount, convert it to a string, then include the commas needed.
String commasNeeded = halved.toString();
String finalHalved = "";
foundDecimal = false;
int count = 0;
for (int i = commasNeeded.length() - 1; i >= 0; i--) {
  if (!foundDecimal && commasNeeded.charAt(i) != '.') {
    finalHalved = commasNeeded.charAt(i).toString() + finalHalved;
  } else if (!foundDecimal && commasNeeded.charAt(i) == '.') {
    finalHalved = commasNeeded.charAt(i).toString() + finalHalved;
    foundDecimal = true;
  } else if (foundDecimal) {
    if (count > 0 && count % 3 == 0) {
      finalHalved = "," + finalHalved;
    }
    finalHalved = commasNeeded.charAt(i).toString() + finalHalved;
    count++;
  }
}

println("Half of " + numberEntered + " is " + finalHalved + ".");