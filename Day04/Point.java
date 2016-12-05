public class Point {
  
  public double x;
  public double y;
  
  public double distanceTo(Point target) {
    return Math.sqrt(Math.pow(target.x - this.x, 2) + (Math.pow(target.y - this.y, 2)));
  }
  
  public double distanceToOrigin() {
    Point origin = new Point();
    return distanceTo(origin);
  }
  
  public void moveTo(double xAxis, double yAxis) {
    this.x = xAxis;
    this.y = yAxis;
  }
  
  public void moveTo(Point target) {
    this.x = target.x;
    this.y = target.y;
  }
  
  public Point clone() {
    Point clone = new Point();
    clone.x = this.x;
    clone.y = this.y;
    return clone;
  }
  
  public Point opposite() {
    Point clone = new Point();
    clone.x = -this.x;
    clone.y = -this.y;
    return clone;
  }
}