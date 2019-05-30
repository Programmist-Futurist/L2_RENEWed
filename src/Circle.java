/**
 * In this class we can create and work with circle
 */
public class Circle {

    int x;
    int y;
    double radius;

    /**
     * Assigning Values to Variables
     * @param x is a value that determine the centre of circle by one axis
     * @param y is a value that determine the centre of circle by another axis
     * @param radius is a value that determines the radius of the circle
     */
     public Circle(int x, int y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * Move centre of circle on some values
     * @param x1 add this value to main (@Code x)
     * @param y1 add this value to main (@Code y)
     */
     void moveCenterOfCircle(int x1, int y1){
         this.x += x1;
         this.y += y1;
    }

    /**
     * Checking does previous centre remain in the area of circle or not
     * @param x1 some variable that determine the place of some point by one axis
     * @param y1 some variable that determine the place of some point by another axis
     * @return true of false
     */
     boolean doesPointRemainInCircle(int x1, int y1){
         double hypotenuse = Math.sqrt((x - x1)^2 + (y - y1)^2);
        return this.radius >= hypotenuse;
     }

    /**
     * Checking does our primary circle contains some other circle
     * @param x1 some variable that determine the place of the centre of some circle by one axis
     * @param y1 some variable that determine the place of the centre of some circle by another axis
     * @param radius1 is a value that determines the radius of some circle
     * @return true of false
     */
     boolean checkConsistancyOfCircle(int x1, int y1, double radius1){
         double z = Math.sqrt((this.x - x1)^2 + (this.y - y1)^2);
         return radius > (z + radius1);
     }

    /**
     * Displaying of primary circle parameters
     */
     void displayParametersOfCircle(){
         System.out.println("Center of the circle is in this point: (" + this.x + ", " + this.y + ")");
         System.out.println("Radius of this circle equals: " + this.radius);
         System.out.println("Length of this circle equals: " + 2*Math.PI*this.radius);
     }
    

    /**
     * This method runs all methods from the class Circle
     * @param args
     */
    public static void main(String[] args){
        Circle circle = new Circle(12,12, 10);
        circle.displayParametersOfCircle();
     }
}
