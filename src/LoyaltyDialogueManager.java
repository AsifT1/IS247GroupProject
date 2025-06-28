import java.util.Random;
import java.util.Scanner;

public class LoyaltyDialogueManager extends DialogueManager {
    @Override
    public void printMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to join our loyalty program? (Yes/No)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Alright! We'll create your account!");
            System.out.print("Please enter your first name: ");
            String name = scanner.next();

            String initials = name.substring(name.length() - 1).toUpperCase();

            System.out.print("Please enter your last name: ");
            String last = scanner.next();

            Random rand = new Random();
            int randomNumber = rand.nextInt(10, 100);  // 10 to 99 inclusive

            String pass = (last.length() >= 3 ? last.substring(0, 3) : last) + randomNumber;
            String complete = initials + pass.toLowerCase();


            LoyaltyAccount<String> account = new LoyaltyAccount<>(complete);
            account.addPoints(5);

            System.out.println("Your generated password is: " + complete);
            System.out.println("You've earned 5 loyalty points! Current points: " + account.getPoints());

            // Original message
            System.out.println(message);
        } else {
            System.out.println(message);
        }
    }
}