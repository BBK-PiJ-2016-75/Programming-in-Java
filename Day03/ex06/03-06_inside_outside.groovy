package ex06;

//Program that creates a rectangle based on given coordinates, then checks
//whether or not a given point falls within the rectangle's area or not.

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

Point checkPoint = new Point();
print("Please enter the X coordinate of a point to check: ");
checkPoint.x = Double.parseDouble(System.console().readLine());
print("Now, please enter the Y coordinate of this point: ");
checkPoint.y = Double.parseDouble(System.console().readLine());

boolean insideX = false;
boolean insideY = false;

if ((checkPoint.x > myRect.upLeft.x) && (checkPoint.x < myRect.downRight.x)) {
  insideX = true;
}
if ((checkPoint.y > myRect.downRight.y) && (checkPoint.y < myRect.upLeft.y)) {
  insideY = true;
}

if (insideX && insideY) {
  println("The point is inside the area of the rectangle.");
} else {
  println("The point is outside the area of the rectangle.");
}
