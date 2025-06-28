import java.util.Random;
import java.util.Scanner;

public class Main extends TextEffect {

    public static void pressEnterToContinue(Scanner input) {
        input.nextLine();
    }

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

    public static void cafeshop(String location, Main app, Customer customer, debitcash deb, LoyaltyDialogueManager dm) {

        Scanner options = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        app.textwords("\nI found a cafe near the zipcode " + location);
        pressEnterToContinue(input);
        app.textwords("Welcome to The Thinking Cup! ");
        app.textwords("How can I help you today!");

        String[] customerArray = {"1. I'd like to order please", "2. Honestly... I think I'll go somewhere else.."};
        customer.dialogue(customerArray);
        String choice = options.next();

        if (choice.equalsIgnoreCase("1")) {
            app.textwords("Alright! What could I get for you today!");
            String[] list = {"1. Coffee", "2. Refreshers", "3. Juice", "4. Pastries", "5. Hot Meals"};
            customer.dialogue(list);
            String food = options.next();

            if (food.equalsIgnoreCase("1")) {
                app.textwords("'I'd like to see the coffee options please..'");
                Scanner buy = new Scanner(System.in);
                menu e = new menu("1. Expresso $4.75 ");
                menu m = new menu("\n2. Macchiato $5.25");
                menu c = new menu("\n3. Cappacino $4.00");
                menu f = new menu("\n4. Frappacino $6.00");
                menu h = new menu("\n5. Iced Latte $5.00");

                System.out.println(e.drinks + m.drinks + c.drinks + f.drinks + h.drinks);
                String cof = buy.nextLine();

                app.textwords("How would you like to pay?");
                deb.pay();
                String cash = buy.next();

                if (cof.equals("1")) {
                    app.textwords(cash.equals("1") ? "Alright your total is 4.75!" : "Alright your total is 5.35!");
                } else if (cof.equals("2")) {
                    app.textwords(cash.equals("1") ? "Alright your total is 5.25!" : "Alright your total is 5.56!");
                } else if (cof.equals("3")) {
                    app.textwords(cash.equals("1") ? "Alright your total is 4.00!" : "Alright your total is 4.24!");
                } else if (cof.equals("4")) {
                    app.textwords(cash.equals("1") ? "Alright your total is 6.00!" : "Alright your total is 6.36!");
                } else if (cof.equals("5")) {
                    app.textwords(cash.equals("1") ? "Alright your total is 5.00!" : "Alright your total is 5.30!");
                }

                dm.setMessage("coffee");
                dm.printMessage();
            }

            if (food.equalsIgnoreCase("2")) {
                app.textwords("'I'd like to order one of your refreshers..'");
                Scanner buy = new Scanner(System.in);
                menu a = new menu("1. Strawberry refresher $5.25");
                menu b = new menu("\n2. Watermelon refresher $5.25");
                menu c = new menu("\n3. Pineapple refresher $5.25");
                menu d = new menu("\n4. Mango refresher $5.25");
                menu e = new menu("\n5. Grape refresher $5.25");
                System.out.println(a.drinks + b.drinks + c.drinks + d.drinks + e.drinks);

                String ref = buy.nextLine();

                if (ref.matches("[1-5]")) {
                    size si = new size();
                    si.update();
                    String upgrade = buy.nextLine();
                    boolean upgraded = upgrade.equalsIgnoreCase("Yes");

                    app.textwords("How would you like to pay?");
                    deb.pay();
                    String payment = buy.nextLine();

                    if (upgraded) {
                        app.textwords(payment.equals("1") ? "Alright! Your total is 5.75!" : "Alright! Your total is 6.06!");
                    } else {
                        app.textwords(payment.equals("1") ? "Alright! Your total is 5.25!" : "Alright! Your total is 5.56!");
                    }

                    dm.setMessage("refreshers");
                    dm.printMessage();
                }
            }

            if (food.equalsIgnoreCase("3")) {
                app.textwords("'I'd like some juice please...'");
                Scanner buy = new Scanner(System.in);
                menu a = new menu("1. Orange juice $3.00 ");
                menu b = new menu("\n2. Pineapple juice $3.00");
                menu c = new menu("\n3. Mango juice $3.00");
                menu d = new menu("\n4. Apple juice $3.00");
                menu e = new menu("\n5. Grape juice $3.00");
                System.out.println(a.drinks + b.drinks + c.drinks + d.drinks + e.drinks);
                String juice = buy.nextLine();

                app.textwords("How would you like to pay?");
                deb.pay();
                String cash = buy.next();

                if (juice.matches("[1-5]")) {
                    app.textwords(cash.equals("1") ? "Alright! Your total is 3.00!" : "Alright your total is 3.18!");
                    dm.setMessage("juice");
                    dm.printMessage();
                }
            }

            if (food.equalsIgnoreCase("4")) {
                app.textwords("'Just a pastry please! '");
                Scanner buy = new Scanner(System.in);
                menu a = new menu("1. Cheesecake $7.00 ");
                menu b = new menu("\n2. Red velvet cake $7.00");
                menu c = new menu("\n3. Brownie $5.00");
                menu d = new menu("\n4. Chocolate chip cookie $4.00");
                menu e = new menu("\n5. Cheese danish $7.00");
                System.out.println(a.drinks + b.drinks + c.drinks + d.drinks + e.drinks);

                String cake = buy.nextLine();

                app.textwords("How would you like to pay?");
                deb.pay();
                String cash = buy.next();

                if (cake.equals("1") || cake.equals("2") || cake.equals("5")) {
                    app.textwords(cash.equals("1") ? "Alright! Your total is 7.00!" : "Alright your total is 7.42!");
                } else if (cake.equals("3")) {
                    app.textwords(cash.equals("1") ? "Alright! Your total is 5.00!" : "Alright your total is 5.30!");
                } else if (cake.equals("4")) {
                    app.textwords(cash.equals("1") ? "Alright! Your total is 4.00!" : "Alright your total is 4.24!");
                }

                dm.setMessage("pastry");
                dm.printMessage();
            }

            if (food.equalsIgnoreCase("5")) {
                app.textwords("'Maybe I’ll try one of your guys' hot-food!'");
                Scanner buy = new Scanner(System.in);
                menu a = new menu("1. Turkey sandwich $10.00");
                menu b = new menu("\n2. Chicken sandwich $10.00");
                menu c = new menu("\n3. Egg and cheese on a croissant $10.00");
                menu d = new menu("\n4. Bacon egg and cheese on a roll $10.00");
                menu e = new menu("\n5. Club sandwich $10.00");
                System.out.println(a.drinks + b.drinks + c.drinks + d.drinks + e.drinks);

                String hot = buy.nextLine();

                app.textwords("How would you like to pay?");
                deb.pay();
                String cash = buy.next();

                if (hot.matches("[1-5]")) {
                    app.textwords(cash.equals("1") ? "Alright! Your total is $10.00" : "Alright! Your total is $10.60");
                    dm.setMessage("hot meal");
                    dm.printMessage();
                }
            }
        } else {
            app.textwords("That's okay! Take care!");
        }
    }
}
class Coffee extends TextEffect {
    private String location;

    public String getCafeLocation() {
        return location;
    }

    public void setCafeLocation(String location) {
        this.location = location;
    }
}
