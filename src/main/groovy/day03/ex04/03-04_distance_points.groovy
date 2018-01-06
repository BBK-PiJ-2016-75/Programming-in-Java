package groovy.day03.ex04;

//Program to plot the coordinates of three points, and then see which two are
//closest.

class Point {
  double x;
  double y;
}

//Define the three points.
Point firstPoint = new Point();
print("Please enter the x coordinate of the first point: ");
firstPoint.x = Double.parseDouble(System.console().readLine());
print("Please enter the y coordinate of the first point: ");
firstPoint.y = Double.parseDouble(System.console().readLine());

Point secondPoint = new Point();
print("Please enter the x coordinate of the second point: ");
secondPoint.x = Double.parseDouble(System.console().readLine());
print("Please enter the y coordinate of the second point: ");
secondPoint.y = Double.parseDouble(System.console().readLine());

Point thirdPoint = new Point();
print("Please enter the x coordinate of the third point: ");
thirdPoint.x = Double.parseDouble(System.console().readLine());
print("Please enter the y coordinate of the third point: ");
thirdPoint.y = Double.parseDouble(System.console().readLine());

//Calculate the distances.
double dist1_2 = Math.sqrt((Math.pow(firstPoint.x - secondPoint.x, 2))
    + (Math.pow(firstPoint.y - secondPoint.y, 2)));
double dist1_3 = Math.sqrt((Math.pow(firstPoint.x - thirdPoint.x, 2))
    + (Math.pow(firstPoint.y - thirdPoint.y, 2)));
double dist2_3 = Math.sqrt((Math.pow(secondPoint.x - thirdPoint.x, 2))
    + (Math.pow(secondPoint.y - thirdPoint.y, 2)));

//Compare the distances.
if ((dist1_2 < dist1_3) && (dist1_2 < dist2_3)) {
  println("The first and second points are closest, as " + dist1_2 +
      " is a shorter distance than " + dist1_3 + " and " + dist2_3 + ".");
} else if ((dist1_3 < dist1_2) && (dist1_3 < dist2_3)) {
  println("The first and third points are closest, as " + dist1_3 +
      " is a shorter distance than " + dist1_2 + " and " + dist2_3 + ".");
} else {
  println("The second and third points are closest, as " + dist2_3 +
      " is a shorter distance than " + dist1_2 + " and " + dist1_3 + ".");
}
