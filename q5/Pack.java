package q5;

/**
 * <p>This program encodes the characters A B E F and I and encodes
 * them into an int value using the following formula: 
 * "value = character - 'A' + 1". </p>
 * <p>After their value is encoded, they are multiplied and added 
 * together to produce the encoded value of the five character string.<p>
 * <p>The encoded value in integers is then decoded back
 * to the original characters that it is made up from.</p>
 * 
 * @author Wilburt Herrera | Set 1B
 * @version 1.0
 */
public class Pack {
    
    /**
     * Base to match the MIX computer character table.
     */
    public static final int BASE_56 = 56;
    
    /**
     * Power for the first position.
     */
    public static final int POSITION1 = 0;
    
    /**
     * Power for the second position.
     */
    public static final int POSITION2 = 1;
    
    /**
     * Power for the third position.
     */
    public static final int POSITION3 = 2;
    
    /**
     * Power for the fourth position.
     */
    public static final int POSITION4 = 3;
    
    /**
     * Power for the fifth position.
     */
    public static final int POSITION5 = 4;
    
    /**
     * ASCII character table offset.
     */
    public static final int OFFSET = 64;
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        // First character to be decoded
        final char c1 = 'A';
        
        // Second character to be decoded
        final char c2 = 'B';
        
        // Third character to be decoded
        final char c3 = 'E';
        
        // Fourth character to be decoded
        final char c4 = 'F';
        
        // Fifth character to be decoded
        final char c5 = 'I';
        
        /**
         * Outputs the original character set.
         */
        System.out.println("Original: " + c5 + c4 + c3 + c2 + c1);
        
        // Assigns encoded value to first character
        int value1 = (c1 - 'A' + 1);
        
        // Assigns encoded value to second character
        int value2 = (c2 - 'A' + 1);
        
        // Assigns encoded value to third character
        int value3 = (c3 - 'A' + 1);
        
        // Assigns encoded value to fourth character
        int value4 = (c4 - 'A' + 1);
        
        // Assigns encoded value to fifth character
        int value5 = (c5 - 'A' + 1);
        
        /**
         * Assigns value to 1st encoded digit based on position.
         */
        int digit1 = (value1 * (int) Math.pow(BASE_56, POSITION1));
        
        /**
         * Assigns value to 2nd encoded digit based on position.
         */
        int digit2 = (value2 * (int) Math.pow(BASE_56, POSITION2));
        
        /**
         * Assigns value to 3rd encoded digit based on position.
         */
        int digit3 = (value3 * (int) Math.pow(BASE_56, POSITION3));
        
        /**
         * Assigns value to 4th encoded digit based on position.
         */
        int digit4 = (value4 * (int) Math.pow(BASE_56, POSITION4));
        
        /**
         * Assigns value to 5th encoded digit based on position.
         */
        int digit5 = (value5 * (int) Math.pow(BASE_56, POSITION5));
        
        // Encoded values added together
        int encodedTotal = digit5 + digit4 + digit3 + digit2 + digit1;
                
        /**
         * Outputs the encoded value.
         */
        System.out.println("Encoded: " + encodedTotal);
        
        // Extracts least significant digit (1)
        int revert1 = encodedTotal % BASE_56;
        
        // Calculates change remaining (1)
        int remainder1 = encodedTotal / BASE_56;
        
        // Extracts least significant digit (2)       
        int revert2 = remainder1 % BASE_56;
        
        // Calculates change remaining (2)
        int remainder2 = remainder1 / BASE_56;
        
        // Extracts least significant digit (3)    
        int revert3 = remainder2 % BASE_56;
        
        // Calculates change remaining (3)
        int remainder3 = remainder2 / BASE_56;
        
        // Extracts least significant digit (4)
        int revert4 = remainder3 % BASE_56;
        
        // Calculates change remaining (4)
        int remainder4 = remainder3 / BASE_56;
        
        // Extracts least significant digit (5)
        int revert5 = remainder4 % BASE_56;
        
        // Offsets digit1's reverted value and decodes to a char
        char decode1 = (char) (revert1 + OFFSET);
        
        // Offsets digit2's reverted value and decodes to a char
        char decode2 = (char) (revert2 + OFFSET);
        
        // Offsets digit3's reverted value and decodes to a char
        char decode3 = (char) (revert3 + OFFSET);
        
        // Offsets digit4's reverted value and decodes to a char
        char decode4 = (char) (revert4 + OFFSET);
        
        // Offsets digit5's reverted value and decodes to a char
        char decode5 = (char) (revert5 + OFFSET);
        
        /**
         * Prints the decoded output.
         */
        System.out.println("Decoded: " + decode5 + decode4 + decode3 + decode2 
            + decode1);
        
        /**
         * Indicates that the program ran correctly.
         */
        System.out.println("Question four was called and ran sucessfully.");
    }

};
