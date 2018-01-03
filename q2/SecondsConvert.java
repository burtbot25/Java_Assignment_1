package q2;

/**
 * For reading user input.
 */
import java.util.Scanner;

/**
 * Formats to HH:MM:SS
 */
import java.text.NumberFormat;

/**
 * <p>This program takes a user's integer input and converts it
 * into the number of hours, minutes, and seconds it represents.</p>
 * 
 * @author Wilburt Herrera | Set 1B
 * @version 1.0
 */
public class SecondsConvert {
    
    /**
     * Number of seconds in an hour.
     */
    public static final int SEC_IN_HOUR = 3600;
    
    /**
     * Number of seconds in a minute.
     */
    public static final int SEC_IN_MIN = 60;
    
    /**
     * Number of seconds in a second.
     */
    public static final int SECONDS = 1;
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        /**
         * Creates a scanner object.
         */
        Scanner scan = new Scanner(System.in);
        
        /**
         * Prompts for user input.
         */
        System.out.println("Enter number of seconds as an integer");
        
        /**
         * Reads and stores user input.
         */
        int input = scan.nextInt();
        
        // How many hours
        int hours = input / SEC_IN_HOUR;
        
        // Remaining seconds (1)
        int remainder1 = input % SEC_IN_HOUR;
        
        // How many minutes
        int mins = remainder1 / SEC_IN_MIN;
        
        // Remaining seconds (2)
        int remainder2 = remainder1 % SEC_IN_MIN;
        
        // How many seconds
        int secs = remainder2 / SECONDS;
        
        /**
         * Creating formatter object.
         */
        NumberFormat fmt = NumberFormat.getInstance();
        
        /**
         * Formats to 2 digits when number is less than 10 (e.g., "01").
         */
        fmt.setMinimumIntegerDigits(2);
        
        /**
         * Formats hours to "HH".
         */
        String hrsFormatted = fmt.format(hours);
        
        /**
         * Formats minutes to "MM".
         */
        String minsFormatted = fmt.format(mins);
        
        /**
         * Formats seconds to "SS".
         */
        String secsFormatted = fmt.format(secs);
        
        /**
         * Prints amount of time.
         */
        System.out.println("Your time in HH/MM/SS: " + hrsFormatted + ":" 
            + minsFormatted + ":" + secsFormatted);
        
        /**
         * Indicates that the program ran correctly.
         */
        System.out.println("Question two was called and ran sucessfully.");
        
        /**
         * Closes Scanner.
         */
        scan.close();
    }

};
