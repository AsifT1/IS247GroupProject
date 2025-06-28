import java.util.Random;
import java.util.Scanner;

/**
 * The main entry point for the café ordering application.
 * Simulates interaction with a customer, including location-based café search,
 * item selection, payment, and optional loyalty program interaction.
 */
public class Main extends TextEffect {

    /**
     * Prompts the user to press Enter to continue.
     *
     * @param input a Scanner object to read user input
     */
    public static void pressEnterToContinue(Scanner input) {
        input.nextLine();
    }

    /**
     * The main method that starts the café ordering simulation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner options = new Scanner(System.in);

        Coffee shop = new Coffee();
        Main app = new Main();
        Customer customer = new Customer();
        debitcash deb = new debitcash();
        LoyaltyDialogueManager dm = new LoyaltyDialogueManager();

        app.textwords("Hello There! You down to go to a cafe? ");

        String response = scan.nextLine();

        if (response.equalsIgnoreCase("Yes")) {
            System.out.println("Lets look for one nearby! Please enter your zip-code!");

            String zip = scan.nextLine();
            shop.setCafeLocation(zip);
            app.textwords("Searching for a cafe near " + shop.getCafeLocation() + ".....");
            pressEnterToContinue(input);
            cafeshop(shop.getCafeLocation(), app, customer, deb, dm);
        } else {
            app.textwords("All good! We can go another day!");
        }
    }

    /**
     * Handles café interaction including menu selection, payment, and message display.
     *
     * @param location  the user-provided zip code location
     * @param app       the main app instance for displaying text
     * @param customer  the customer object for dialogue
     * @param deb       the payment method (cash or card)
     * @param dm        the dialogue manager for message customization
     */
    public static void cafeshop(String location, Main app, Customer customer, debitcash deb, LoyaltyDialogueManager dm) {
        // ... rest of the method (unchanged)
    }
}

/**
 * A simple class representing a coffee shop with a user-specified location.
 */
class Coffee extends TextEffect {
    private String location;

    /**
     * Gets the café location.
     *
     * @return the user-defined location
     */
    public String getCafeLocation() {
        return location;
    }

    /**
     * Sets the café location.
     *
     * @param location the zip code or location to set
     */
    public void setCafeLocation(String location) {
        this.location = location;
    }
}
