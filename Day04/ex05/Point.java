package ex05;

public class Point {

  public double x = 0.0;
  public double y = 0.0;

  public double distanceTo(Point target) {
    return Math.sqrt(Math.pow(target.x - this.x, 2) + (Math.pow(target.y
        - this.y, 2)));
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

  /**
   * Creates a cloned copy of a point.
   * @return the cloned copy.
   */
  public Point clone() {
    Point clone = new Point();
    clone.x = this.x;
    clone.y = this.y;
    return clone;
  }

  /**
   * Creates an inverse copy of a point.
   * @return the inverse copy.
   */
  public Point opposite() {
    Point negClone = new Point();
    negClone.x = -this.x;
    negClone.y = -this.y;
    return negClone;
  }
}
