
package area.of.pentagon;
import java.util.Scanner;

public class AreaOfPentagon {
    public static void main(String[] args) {
    // Area of pentagon
    Scanner input = new Scanner(System.in);
    System.out.println("please enter the lenght of pentagon: ");
    double r = input.nextDouble();
    double s = 2*r*Math.sin((Math.PI)/5);
    double area = (5*s*s)/(4*Math.tan(Math.PI/5));
        System.out.println("the area of pentagon is " +area );
    
            }
    
}
