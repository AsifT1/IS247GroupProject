import java.util.Random;
import java.util.Scanner;

public class LoyaltyDialogueManager extends DialogueManager {
    @Override
    public void printMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to join our loyalty program? (Yes/No)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.print("Please enter your first name: ");
            String name = scanner.next();

            String initials = name.substring(name.length() - 1);
            String upper = initials.toUpperCase();

            System.out.print("Please enter your last name: ");
            String last = scanner.next();

            Random rand = new Random();
            int randomNumber = rand.nextInt(10, 100);  // 10 to 99 inclusive

            String pass = last.length() >= 3 ? last.substring(0, 3) + randomNumber : last + randomNumber;
            String lower = pass.toLowerCase();

            String complete = upper + lower;
            System.out.println("Your generated password is: " + complete);

            String stars = "****";
            String everything = stars.concat(complete);
            System.out.println("Your password with stars: " + everything);

            String reverse = new StringBuilder(everything).reverse().toString();
            System.out.println("Your password reversed: " + reverse);

            // Then print the original message:
            System.out.println(message);

        } else {
            // Just print the message if user says No
            System.out.println(message);
        }
    }
}
