public class DialogueManager {
    protected String message;

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

    public void printMessage() {
        System.out.println(message);
    }
}
