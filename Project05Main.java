import java.util.Arrays;
import java.util.Stack;

/**
 * Main class for CSC6301 Module 05, Project 05. Responsible only for calling
 * methods from classes created for this assignment and displaying the final
 * output. This class assumes that 'UserPrompt.java' and 'SortedStackMaker.java'
 * are in the same file-system folder as this class.
 * 
 * -Note- This file has been updated to reflect a change from sorted linked
 * lists to creating a sorted stack.
 * 
 * @author Sam Crow - crows@merrimack.edu
 * @version 2.0.0
 * @since 10/05/2022
 */
public class Project05Main {
    /**
     * Main method for Project 05. Creates methods and calls objects in seperate
     * classes to fulfill the goals of the assignment. Look into associated
     * classes 'UserPrompt.java' and 'SortedStackMaker.java' for implementation
     * details.
     * 
     * @param args - Default main method arguments (unused)
     */
    public static void main(String[] args) {
        Integer[] testArray = UserPrompt.getIntegerArray();

        Stack<Integer> testStack;
        testStack = SortedStackMaker.makeFromIntegerArray(testArray);
        
        System.out.println("You input the following integers:");
        System.out.println(Arrays.toString(testArray));
        System.out.println("\nHere they are as a sorted stack:");
        System.out.println(testStack.toString());
    }
}
