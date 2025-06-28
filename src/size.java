/**
 * Represents a size upgrade option for a refresher.
 * Implements the {@link Upgrade} interface.
 */
public class size implements Upgrade {

    /**
     * Displays a prompt to the user about upgrading their refresher.
     * Overrides the {@code update()} method from the {@link Upgrade} interface.
     */
    @Override
    public void update() {
        System.out.println("Would you like to upgrade your refresher for 50 cents more?");
    }
}

