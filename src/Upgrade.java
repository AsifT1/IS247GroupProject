/**
 * Represents an upgrade option that can be applied to a product or service.
 * Classes implementing this interface must define how the upgrade is applied.
 */
public interface Upgrade {

    /**
     * Applies or prompts for an upgrade.
     */
    void update();
}

