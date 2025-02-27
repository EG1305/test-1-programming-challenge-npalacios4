package defaultpackage;
import java.util.Scanner;

/**
 *Programming question by NayranPalacios
 */
public class DistanceCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // prompts the user for the first point
        System.out.println("Enter the coordinates of the first point:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        
        // prompt user for the second point
        System.out.println("Enter the coordinates of the second point:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();
        
        // will calculates the distance
        double distance = getDistance(x1, y1, x2, y2);
        
        // Classifies the distance
        String classification = classifyDistance(distance);
        
        // Displays the results with distance rounded to two decimal places
        System.out.printf("The distance between (%.2f, %.2f) and (%.2f, %.2f) is %.2f units.%n", 
                          x1, y1, x2, y2, distance);
        System.out.println("Classification: " + classification);
        
        scanner.close();
    }
    
    public static double getDistance(double x1, double y1, double x2, double y2) {
        double xDiff = x2 - x1;
        double yDiff = y2 - y1;
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }
    
    /**
     * Classifies the distance as short, medium, or long.
     */
    public static String classifyDistance(double distance) {
        if (distance < 5) {
            return "Short";
        } else if (distance <= 15) {
            return "Medium";
        } else {
            return "Long";
        }
    }
}