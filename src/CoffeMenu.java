/**
 * Represents a menu specifically for coffee drinks.
 * Inherits common menu functionality from the {@code menu} class.
 */
public class CoffeMenu extends menu {

    /**
     * Constructs a CoffeeMenu with the specified drink name or category.
     *
     * @param drinks the coffee drink(s) or drink category to include in the menu
     */
    CoffeMenu(String drinks) {
        super(drinks);
    }
}
