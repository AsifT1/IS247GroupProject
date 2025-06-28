/**
 * Abstract base class representing a generic payment method.
 * Subclasses must provide an implementation for the {@code pay()} method.
 */
abstract class paymentmethod {

    /**
     * Performs a payment action.
     * Must be implemented by any subclass.
     */
    abstract void pay();
}


