import java.util.ListIterator;
import java.util.Stack;

/**
 * Provides methods for creating sorted Stack objects. For the purposes of this
 * project, I'm basing this class off of the SortedListMaker class. For this
 * project, the assignment is to pivot to utilizing Stacks, from LinkedList.
 * 
 * @author Sam Crow - crows@merrimack.edu
 * @version 1.0.0
 * @since 10/05/22
 */
public class SortedStackMaker {

    /**
     * Creates a sorted Stack of Integer Objects from a given array of
     * Integer Objects, with the smallest object on the bottom of the stack.
     * 
     * This method was originally implemented with LinkedList, but the code has
     * been updated to generate and return a Stack, per shifting requirements.
     *  
     * @param array - Unsorted array of Integer objects
     * @return - Stack of Integer Objects, sorted in natural order.
     */
    public static Stack<Integer> makeFromIntegerArray(Integer[] array) {
        // Nothing to do with an empty or null argument.
        if (array.length == 0 || array == null) {
            return null;
        }

        // Prime the Stack
        Stack<Integer> returnStack = new Stack<>();
        returnStack.add(array[0]);

        // Build the sorted list, utilizing a list iterator
        ListIterator<Integer> iterator = returnStack.listIterator();
        for (int i = 1; i < array.length; i++) {
            while (iterator.hasNext()) {
                Integer element = iterator.next();
                if (element.compareTo(array[i]) > 0) { // Find sorted slot
                    iterator.previous();
                    break; // inner loop
                }
            }
            iterator.add(array[i]);
            iterator = returnStack.listIterator(); // Bring the pointer to start

        }

        return returnStack;
    }
}
