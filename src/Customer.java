/**
 * Represents a customer who can output dialogue lines.
 */
public class Customer {

    /**
     * Prints each string from the given array to the console, each followed by a space,
     * then prints a newline after all elements are printed.
     *
     * @param arr an array of strings representing dialogue lines to print
     */
    public void dialogue(String[] arr) {
        for (String num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
