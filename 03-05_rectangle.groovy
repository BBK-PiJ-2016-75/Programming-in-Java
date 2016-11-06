class Point {
	double x;
	double y;
}

class Rectangle {
  Point upLeft;
  Point downRight;
}

Point topLeft = new Point();
Point bottomRight = new Point();

print("Please enter the X coordinate of the top left corner of the rectangle: ");
topLeft.x = Double.parseDouble(System.console().readLine());
print("Next, please enter the Y coordinate of the top left corner: ");
topLeft.y = Double.parseDouble(System.console().readLine());
print("And now, please enter the X coordinate of the bottom right corner of the rectangle: ");
bottomRight.x = Double.parseDouble(System.console().readLine());
print("Finally, please enter the Y coordinate of the bottom right corner: ");
bottomRight.y = Double.parseDouble(System.console().readLine());

Rectangle myRect = new Rectangle();
myRect.upLeft = topLeft;
myRect.downRight = bottomRight;

double width = myRect.downRight.x - myRect.upLeft.x;
double height = myRect.upLeft.y - myRect.downRight.y;

println("The perimeter of the rectangle is: " + ((width + height) * 2) + ".");
println("The area of the rectangle is: " + (width * height) + ".");