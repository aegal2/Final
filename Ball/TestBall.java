/*
 * A Test Driver for the Ball class.
 */
public class TestBall {
   public static void main(String[] args) {
      // Test constructor and toString()
      Ball b1 = new Ball(1, 2, 11, 12);
      System.out.println(b1);  // toString()

      // Test Setters and Getters
      b1.setX(3);
      b1.setY(4);
      b1.setXStep(13);
      b1.setYStep(14);
      System.out.println(b1);  // run toString() to inspect the modified instance
      System.out.println("x is: " + b1.getX());
      System.out.println("y is: " + b1.getY());
      System.out.println("xStep is: " + b1.getXStep());
      System.out.println("yStep is: " + b1.getYStep());

      // Test setXY(), getXY(), setXYStep(), getXYStep()
      b1.setXY(5, 6);
      b1.setXYStep(15, 16);
      System.out.println(b1);  // toString()
      System.out.println("x is: " + b1.getXY()[0]);
      System.out.println("y is: " + b1.getXY()[1]);
      System.out.println("xStep is: " + b1.getXYStep()[0]);
      System.out.println("yStep is: " + b1.getXYStep()[1]);

      // Test move() and chaining
      System.out.println(b1.move());  // toString()
      System.out.println(b1.move().move().move());
   }
}
