/**
 * In this class we can create and work with circle
 */
public class Circle {

    int x;
    int y;
    double radius;

    /**
     * Assigning Values to Variables
     * @param x
     * @param y
     * @param radius
     */
     public Circle(int x, int y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * Move centre of circle on some values
     * @param move_x_on
     * @param move_y_on
     */
     void moveCenterOfCircle(int move_x_on, int move_y_on){
         this.x += move_x_on;
         this.y += move_y_on;
    }

    /**
     * Checking does previous centre remain in the area of circle or not
     * @param previous_x
     * @param previous_y
     * @return true of false
     */
     boolean doesPointRemainInCircle(int previous_x, int previous_y){
         double gipotenuza = Math.sqrt((x - previous_x)^2 + (y - previous_y)^2);
        return this.radius >= gipotenuza;
     }

    /**
     * Checking does our primary circle contains some other circle
     * @param x1
     * @param y1
     * @param radius1
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
         System.out.println("Length of this circle equals: " + 6.28*this.radius);
     }

    /**
     * This method runs all methods from the class Circle
     * @param args
     */
    public static void main(String[] args){

     }
}
