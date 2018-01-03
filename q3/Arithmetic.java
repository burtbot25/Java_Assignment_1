package q3;

/**
 * For reading user input.
 */
import java.util.Scanner;

/**
 * <p>This program takes 2 user integer inputs and calculates
 * the sum, difference, quotient and product of the two numbers.</p>
 *
 * @author Wilburt Herrera | Set 1B
 * @version 1.0
 */
public class Arithmetic {
    
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
         * Prompts for first input.
         */
        System.out.println("Enter your first number");
        
        /**
         * Reads and stores user's first input.
         */
        double input1 = scan.nextDouble();
        
        /**
         * Prompts for user's second input.
         */
        System.out.println("Enter your second number");
        
        /**
         * Reads and stores user's second input.
         */
        double input2 = scan.nextDouble();
        
        /**
         * Prints sum of inputs.
         */
        System.out.println("The sum of your numbers is: " 
            + (input1 + input2));
        
        /**
         * Prints difference of inputs.
         */
        System.out.println("The difference of your numbers is: " 
            + (input1 - input2));
        
        /**
         * Prints quotient of inputs.
         */
        System.out.println("The quotient of your numbers is: " 
            + (input1 / input2));
        
        /**
         * Prints product of inputs.
         */
        System.out.println("The product of your number is: " 
            + (input1 * input2));
        
        /**
         * Indicates that the program ran correctly.
         */
        System.out.println("Question three was called and ran sucessfully.");
        
        /**
         * Closes Scanner.
         */
        scan.close();
    }

};
