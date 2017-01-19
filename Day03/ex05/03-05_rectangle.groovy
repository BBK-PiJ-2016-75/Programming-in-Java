package ex05

//Program that takes in the coordinates of two points, creates a rectangle from
//them as opposite corners, then prints the area and perimeter of the rectangle.

class Point {
  double x;
  double y;
}

class Rectangle {
  Point upLeft;
  Point downRight;
}

//Create the opposing points.
Point topLeft = new Point();
Point bottomRight = new Point();

//Construct the rectangle.
print("Please enter the X coordinate of the top-left corner of the rectangle: ");
topLeft.x = Double.parseDouble(System.console().readLine());
print("Next, please enter the Y coordinate of the top-left corner: ");
topLeft.y = Double.parseDouble(System.console().readLine());
print("And now, please enter the X coordinate of the bottom-right corner: ");
bottomRight.x = Double.parseDouble(System.console().readLine());
print("Finally, please enter the Y coordinate of the bottom-right corner: ");
bottomRight.y = Double.parseDouble(System.console().readLine());

Rectangle myRect = new Rectangle();
myRect.upLeft = topLeft;
myRect.downRight = bottomRight;

//Calculate the rectangle's width and height.
double width = myRect.downRight.x - myRect.upLeft.x;
double height = myRect.upLeft.y - myRect.downRight.y;

println("The perimeter of the rectangle is: " + ((width + height) * 2) + ".");
println("The area of the rectangle is: " + (width * height) + ".");
