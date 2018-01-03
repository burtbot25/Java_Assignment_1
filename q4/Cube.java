package q4;

/**
 * For reading user input.
 */
import java.util.Scanner;

/**
 * <p>This program takes the user's integer input for a side length of a cube
 * and calculates the surface area of the side and the volume of the cube.</p>
 *
 * @author Wilburt Herrera | Set 1B
 * @version 1.0
 */
public class Cube {
    
    /**
     * Power for cube's side surface area.
     */
    public static final int SA_POWER = 2;
    
    /**
     * Surface area coefficient.
     */
    public static final int SA_COEFFICIENT = 6;
    
    /**
     * Power for cube's volume.
     */
    public static final int CUBE_POWER = 3;
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        /**
         * Creates scanner object.
         */
        Scanner scan = new Scanner(System.in);
        
        /**
         * Prompts for user input.
         */
        System.out.println("Enter the length of a side in integers: ");
        
        /**
         * Reads and stores user input.
         */
        int length = scan.nextInt();
        
        /**
         * Displays the surface area of the cube.
         */
        System.out.println("The surface area of the cube is: " 
            + (SA_COEFFICIENT + Math.pow(length, SA_POWER)));
        
        /**
         * Displays the volume of the cube.
         */
        System.out.println("The volume of the cube is: "
            + Math.pow(length, CUBE_POWER));
        
        /**
         * Indicates that the program ran correctly.
         */
        System.out.println("Question four was called and ran sucessfully.");
        
        /**
         * Closes Scanner.
         */
        scan.close();
    }

};
