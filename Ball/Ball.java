/*
 * The Ball class models a moving ball at (x, y) with displacement
 *   per move-step of (xStep, yStep).
 */
public class Ball {
   // The private instance variables
   private double x, y, xStep, yStep;

   // Constructor
   public Ball(double x, double y, double xStep, double yStep) {
      this.x = x;
      this.y = y;
      this.xStep = xStep;
      this.yStep = yStep;
   }

   // The public getters and setters
   public double getX() {
      return this.x;
   }
   public void setX(double x) {
      this.x = x;
   }
   public double getY() {
      return this.y;
   }
   public void setY(double y) {
      this.y = y;
   }
   public double getXStep() {
      return this.xStep;
   }
   public void setXStep(double xStep) {
      this.xStep = xStep;
   }
   public double getYStep() {
      return this.yStep;
   }
   public void setYStep(double yStep) {
      this.yStep = yStep;
   }

   // Return a String to describe this instance
   public String toString() {
      return "Ball@(" + x + "," + y + "),speed=(" + xStep + "," + yStep + ")";
   }

   public double[] getXY() {
      double[] results = new double[2];
      results[0] = this.x;
      results[1] = this.y;
      return results;
   }
   public void setXY(double x, double y) {
      this.x = x;
      this.y = y;
   }
   public double[] getXYStep() {
      double[] results = new double[2];
      results[0] = this.xStep;
      results[1] = this.yStep;
      return results;
   }
   public void setXYStep(double xStep, double yStep) {
      this.xStep = xStep;
      this.yStep = yStep;
   }

   // Move a step by increment x and y by xStep and yStep, respectively.
   // Return "this" instance to support chaining operation.
   public Ball move() {
      x += xStep;
      y += yStep;
      return this;
   }
}
