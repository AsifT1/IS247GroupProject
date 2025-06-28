/**
 * Manages dialogue messages based on product categories.
 */
public class DialogueManager {

    protected String message;

    /**
     * Sets the message according to the given product category.
     *
     * @param category the product category to determine the message for
     */
    public void setMessage(String category) {
        switch (category.toLowerCase()) {
            case "coffee":
                message = "Enjoy your hot coffee!";
                break;
            case "refreshers":
                message = "Hope that refresher cools you down!";
                break;
            case "juice":
                message = "A nice juice to keep you healthy!";
                break;
            case "pastry":
                message = "Enjoy your delicious pastry!";
                break;
            case "hot meal":
                message = "Mmm! Hot and ready to go!";
                break;
            default:
                message = "Enjoy your treat!";
        }
    }

    /**
     * Prints the currently set message to the console.
     */
    public void printMessage() {
        System.out.println(message);
    }
}
