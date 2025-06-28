/**
 * Represents a payment method that handles debit cash payments.
 * Extends the {@code paymentmethod} class.
 */
public class debitcash extends paymentmethod {

    /**
     * Displays the payment options for debit cash.
     * Overrides the {@code pay()} method from the superclass.
     */
    @Override
    void pay() {
        System.out.println("1. Cash");
        System.out.println("2. Card");
    }
}
