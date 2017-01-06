//Program that creates two rectangles based on given coordinates, then checks 
//whether or not a given point falls within the area of the first, second or both.

class Point {
	double x;
	double y;
}

class Rectangle {
  Point upLeft;
  Point downRight;
}

//Create points for rectangles.
Point topLeft1 = new Point();
Point bottomRight1 = new Point();
Point topLeft2 = new Point();
Point bottomRight2 = new Point();

//Create first rectangle.
print("Please enter the X coordinate of the top-left corner of the first rectangle: ");
topLeft1.x = Double.parseDouble(System.console().readLine());
print("Next, please enter the Y coordinate of the top-left corner: ");
topLeft1.y = Double.parseDouble(System.console().readLine());
print("And now, please enter the X coordinate of the bottom-right corner of the first rectangle: ");
bottomRight1.x = Double.parseDouble(System.console().readLine());
print("Finally, please enter the Y coordinate of the bottom-right corner: ");
bottomRight1.y = Double.parseDouble(System.console().readLine());

Rectangle rect1 = new Rectangle();
rect1.upLeft = topLeft1;
rect1.downRight = bottomRight1;

//Create second rectangle.
print("Please enter the X coordinate of the top-left corner of the second rectangle: ");
topLeft2.x = Double.parseDouble(System.console().readLine());
print("Next, please enter the Y coordinate of the top-left corner: ");
topLeft2.y = Double.parseDouble(System.console().readLine());
print("And now, please enter the X coordinate of the bottom-right corner of the second rectangle: ");
bottomRight2.x = Double.parseDouble(System.console().readLine());
print("Finally, please enter the Y coordinate of the bottom-right corner: ");
bottomRight2.y = Double.parseDouble(System.console().readLine());

Rectangle rect2 = new Rectangle();
rect2.upLeft = topLeft2;
rect2.downRight = bottomRight2;

//Create point to check.
Point checkPoint = new Point();
print("Please enter the X coordinate of a point to check: ");
checkPoint.x = Double.parseDouble(System.console().readLine());
print("Now, please enter the Y coordinate of this point: ");
checkPoint.y = Double.parseDouble(System.console().readLine());

//Check where the point is, in relation to the rectangles.
boolean insideFirst = false;
boolean insideSecond = false;

//Check inside first rectangle.
boolean insideX1 = false;
boolean insideY1 = false;
if ((checkPoint.x > rect1.upLeft.x) && (checkPoint.x < rect1.downRight.x)) {
  insideX1 = true;
}
if ((checkPoint.y > rect1.downRight.y) && (checkPoint.y < rect1.upLeft.y)) {
  insideY1 = true;
}

if (insideX1 && insideY1) {
  insideFirst = true;
}

//Check inside second rectangle.
boolean insideX2 = false;
boolean insideY2 = false;
if ((checkPoint.x > rect2.upLeft.x) && (checkPoint.x < rect2.downRight.x)) {
  insideX2 = true;
}
if ((checkPoint.y > rect2.downRight.y) && (checkPoint.y < rect2.upLeft.y)) {
  insideY2 = true;
}

if (insideX2 && insideY2) {
  insideSecond = true;
}

//Print the results of checking.
if (insideFirst && insideSecond) {
  println("The point is inside the overlapping area of both rectangles.");
} else if (insideFirst) {
  println("The point is inside the area of the first rectangle only.");
} else if (insideSecond) {
  println("The point is inside the area of the second rectangle only.");
} else {
  println("The point is outside the areas of both rectangles.");
}