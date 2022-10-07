import java.util.Scanner;

/**
 * Provides methods to prompt for, gather, and return user input in various
 * types and formats.
 * 
 * @author Sam Crow - crows@merrimack.edu
 * @version 1.0.0
 * @since 9/25/22
 */
public class UserPrompt {

    /**
     * Prompts the user for a series of integer values and parses them into
     * an Integer[] array.
     * 
     * @return - an array of Integer[] values representing the user input.
     */
    public static Integer[] getIntegerArray() {
        // Get user input
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter a string of Integers " +
                "(e.g. 99 7 33 107 888 67):");
        String inputLine = getInput.nextLine();
        getInput.close();
        
        /* Split into String array, non-numeric characters are treated
        as(consecutive) delimiters */
        String numericStringArray[] = inputLine.split("[^0-9]+");

        // Build final array to return.
        Integer integerArray[] = new Integer[numericStringArray.length];
        for (int i = 0; i < numericStringArray.length; i++) {
            integerArray[i] = Integer.valueOf(numericStringArray[i]);
        }

        return integerArray;
    }
}
