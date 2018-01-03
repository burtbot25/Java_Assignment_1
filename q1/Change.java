package q1;

/**
 * For reading the user's input
 */
import java.util.Scanner;

/**
 * <p>This program takes the user's input and divides the amount based on a bill
 * or coin value to determine the fewest number of each bill and coin needed to
 * represent that amount</p>
 * <p> It performs this function by storing the quotient of the remaining amount
 * and the largest value remaining and then processing the remainder for 
 * division of the next largest value until there is no money left.
 *
 * @author Wilburt Herrera | Set 1B
 * @version 1.0
 */
public class Change {
    
    /**
     * 10 dollar bill.
     */
    static final double TEN_DOLLARS = 10.0;
    
    /**
     * 5 dollar bill.
     */
    static final double FIVE_DOLLARS = 5.0;
    
    /**
     * 2 dollar coin.
     */
    static final double TOONIES = 2.0;
    
    /**
     * 1 dollar coin.
     */
    static final double LOONIES = 1.0;
    
    /**
     * Quarters.
     */
    static final int QUARTERS = 25;
    
    /**
     * Dimes.
     */
    static final int DIMES = 10;
    
    /**
     * Nickels.
     */
    static final int NICKELS = 5;
    
    /**
     * Pennies.
     */
    static final int PENNIES = 1;
    
    /**
     * Used to convert cents from a double to an integer.
     * For ease of calculation when dealing with rounding errors.
     */
    static final int TO_INTEGER = 100;
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        /**
         * Creates the scanner object.
         */
        Scanner scan = new Scanner(System.in);
        
        /**
         * Prompts user for a monetary value.
         */
        System.out.println("Please enter a monetary amount: ");
        double money = scan.nextDouble();
        
        // How many ten dollar bills
        int tens = (int) (money / TEN_DOLLARS);
        
        // Change after tens
        double remainder1 = money % TEN_DOLLARS;
        
        // How many five dollar bills
        int fives = (int) (remainder1 / FIVE_DOLLARS);
        
        // Change after fives
        double remainder2 = remainder1 % FIVE_DOLLARS;
        
        // How many two dollar coins
        int twos = (int) (remainder2 / TOONIES);
        
        // Change after twos
        double remainder3 = remainder2 % TOONIES;
        
        // How many 1 dollar coins
        int ones = (int) (remainder3 / LOONIES);
        
        // Change after ones
        double centsLeft = remainder3 % LOONIES;

        /**
         * Rounds double value to the nearest integer (e.g., 1 penny = 100)
         * and shifts decimal points up to work with change as an integer.
         */
        int remainder4 = (int) Math.round(centsLeft * TO_INTEGER);  
        
        // How many quarters
        int quarters = (int) (remainder4 / QUARTERS);
        
        // Change after quarters
        int remainder5 = (remainder4 % QUARTERS);
        
        // How many dimes
        int dimes = (int) (remainder5 / DIMES);
        
        // Change after dimes
        int remainder6 = (remainder5 % DIMES);
        
        // How many nickels
        int nickels = (int) (remainder6 / NICKELS);
        
        // Change after nickels
        int remainder7 = (remainder6 % NICKELS);
        
        // How many pennies
        int pennies = (int) (remainder7 / PENNIES);
        
        /**
         * Prints the change needed.
         */
        System.out.println("You need: ");
        
        /**
         * Prints the # of tens needed.
         */
        System.out.println(tens + " ten dollar bill(s)");
        
        /**
         * Prints the # of fives needed.
         */
        System.out.println(fives + " five dollar bill(s)");
        
        /**
         * Prints the # of toonies needed.
         */
        System.out.println(twos + " two dollar coin(s)");
        
        /**
         * Prints the # of loonies needed.
         */
        System.out.println(ones + " one dollar coin(s)");
        
        /**
         * Prints the # of quarters needed.
         */
        System.out.println(quarters + " twenty-five cent coin(s)");
        
        /**
         * Prints the # of dimes needed.
         */
        System.out.println(dimes + " ten cent coin(s)");
        
        /**
         * Prints the # of nickels needed.
         */
        System.out.println(nickels + " five cent coin(s)");
        
        /**
         * Prints the # of pennies needed.
         */
        System.out.println(pennies + " one cent coin(s)");
        
        /**
         *  Displays that question one is complete
         */
        System.out.println("Question one was called and ran sucessfully.");
        
        /**
         * Closes Scanner.
         */
        scan.close();
    }

};
