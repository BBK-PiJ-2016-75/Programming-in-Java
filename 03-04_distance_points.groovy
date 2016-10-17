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

//Check the distances.

double dist1_2 = Math.sqrt((Math.pow(firstPoint.x - secondPoint.x, 2)+(Math.pow(firstPoint.y - secondPoint.y)));
double dist1_3 = Math.sqrt((Math.pow(firstPoint.x - thirdPoint.x, 2)+(Math.pow(firstPoint.y - thirdPoint.y)));
double dist2_3 = Math.sqrt((Math.pow(secondPoint.x - thirdPoint.x, 2)+(Math.pow(secondPoint.y - thirdPoint.y)));