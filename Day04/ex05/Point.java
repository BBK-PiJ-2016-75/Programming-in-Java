package ex05;

/**
 * Creates a point on a Cartesian plane, using x and y co-ordinates.
 */
public class Point {
  public double x = 0.0;
  public double y = 0.0;

  /**
   * Calculates the distance from the current point to a target point.
   * @param target the target point.
   * @return the distance to the target point.
   */
  public double distanceTo(Point target) {
    return Math.sqrt(Math.pow(target.x - this.x, 2) + (Math.pow(target.y
        - this.y, 2)));
  }

  /**
   * Calculates the distance from the current point to the origin point (0, 0).
   * @return the distance to the origin point.
   */
  public double distanceToOrigin() {
    Point origin = new Point();
    return distanceTo(origin);
  }

  /**
   * Sets the current point to new given co-ordinates.
   * @param xAxis the new x co-ordinate.
   * @param yAxis the new y co-ordinate.
   */
  public void moveTo(double xAxis, double yAxis) {
    this.x = xAxis;
    this.y = yAxis;
  }

  /**
   * Sets the current point to a new given point.
   * @param target the new point.
   */
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
