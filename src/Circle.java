public class Circle {

    int x;
    int y;
    double radius;

     public Circle(int x, int y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

     void moveCenterOfCircle(int move_x_on, int move_y_on){
         this.x += move_x_on;
         this.y += move_y_on;
    }
     boolean doesPointRemainInCircle(int previous_x, int previous_y){
         double gipotenuza = Math.sqrt((x - previous_x)^2 + (y - previous_y)^2);
        return this.radius >= gipotenuza;
     }

     boolean checkConsistancyOfCircle(int x1, int y1, double radius1){
         double z = Math.sqrt((this.x - x1)^2 + (this.y - y1)^2);
         return radius > (z + radius1);
     }

     void displayParametersOfCircle(){
         System.out.println("Center of the circle is in this point: (" + this.x + ", " + this.y + ")");
         System.out.println("Radius of this circle equals: " + this.radius);
         System.out.println("Length of this circle equals: " + 6.28*this.radius);
     }

    public static void main(String[] args){

     }
}
