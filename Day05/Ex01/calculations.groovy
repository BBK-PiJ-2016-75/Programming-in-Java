//The user enters the numbers for the operation.
print("Please enter the first number: ");
int num1 = Integer.parseInt(System.console().readLine());
print("Now, please enter the second number: ");
int num2 = Integer.parseInt(System.console().readLine());

//Create a new object for calculation.
Calculator myCalc = new Calculator();

//Display the menu for the user to choose the desired operation.
println("Now, choose which operation you wish to carry out: ");
println("For addition, enter 1.");
println("For subtraction, enter 2.");
println("For multiplication, enter 3.");
println("For division, enter 4.");
println("For remainder, enter 5.")
print("Please enter your choice: ");
int choice = Integer.parseInt(System.console().readLine());

//The list of possible operations.
switch (choice) {
  case 1:
		println(num1 + " plus " + num2 + " is " + myCalc.add(num1, num2) + ".");
		break;
	case 2:
		println(num1 + " minus " + num2 + " is " + myCalc.subtract(num1, num2) + ".");
		break;
	case 3:
		println(num1 + " times " + num2 + " is " + myCalc.multiply(num1, num2) + ".");
		break;
	case 4:
		println(num1 + " divided by " + num2 + " is " + myCalc.divide(num1, num2) + ".");
		break;
  case 5:
    println("The remainder of " + num1 + )
	default:
		println("That was not a vaild option!");
		break;
}