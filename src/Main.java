import java.util.Scanner;
import java.util.Random;
public class Main extends TextEffect {
    public static void pressEnterToContinue(Scanner input) {
        input.nextLine();
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Coffee shop = new Coffee();
        Main app = new Main();

        app.textwords("Hello There! You down to go to a cafe? ");

        String response = scan.nextLine();

        if(response.equalsIgnoreCase("Yes")){
            System.out.println("Let`s look for one nearby! Please enter your zip-code!");

            String zip = scan.nextLine();
            shop.setCafeLocation(zip);
            app.textwords("Searching for a cafe near " + shop.getCafeLocation()+".....");
            pressEnterToContinue(input);
            cafeshop(shop.getCafeLocation());

        }
        else{
            app.textwords("All good! We can go another day!");
        }


    }

    public static void cafeshop(String location){

        Scanner options = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        TextEffect app = new TextEffect();
        app.textwords("\nI found a cafe near the zipcode " + location);
        pressEnterToContinue(input);
        app.textwords("Welcome to The Thinking Cup! ");
        app.textwords("How can I help you today!");
        Customer customer = new Customer();
        String[] customerArray = {"1. I'd like to order please","2. Honestly... I think I'll go somewhere else.."};
        customer.dialogue(customerArray);
        String choice = options.next();
        debitcash deb = new debitcash();
        if(choice.equalsIgnoreCase("1")) {
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
                if (cof.equalsIgnoreCase("1")) {
                    app.textwords("How would you like to pay?");
                    deb.pay();
                    String cash = buy.next();

                    if (cash.equalsIgnoreCase("1")) {
                        app.textwords("Alright your total is 4.75!");

                    } else {
                        app.textwords("Alright your total is 5.35!");
                        ;
                    }

                }
                if (cof.equalsIgnoreCase("2")) {
                    String cash = buy.next();
                    app.textwords("How would you like to pay?");
                    deb.pay();
                    if (cash.equalsIgnoreCase("1")) {
                        app.textwords("Alright! Your total is 5.25!");
                    } else {
                        app.textwords("Alright your total is 5.56!");
                    }

                }
                if (cof.equalsIgnoreCase("3")) {
                    String cash = buy.next();
                    app.textwords("How would you like to pay?");
                    deb.pay();
                    if (cash.equalsIgnoreCase("1")) {
                        app.textwords("Alright! Your total is 4.00!");
                    } else {
                        app.textwords("Alright your total is 4.24!");
                    }

                }
                if (cof.equalsIgnoreCase("4")) {
                    String cash = buy.next();
                    app.textwords("How would you like to pay?");
                    deb.pay();
                    if (cash.equalsIgnoreCase("1")) {
                        app.textwords("Alright! Your total is 5.00!");
                    } else {
                        app.textwords("Alright your total is 5.30!");
                    }


                }
                if (cof.equalsIgnoreCase("3")) {
                    String cash = buy.next();
                    app.textwords("How would you like to pay?");
                    deb.pay();
                    if (cash.equalsIgnoreCase("1")) {
                        app.textwords("Alright! Your total is 4.00!");
                    } else {
                        app.textwords("Alright your total is 4.24!");
                    }

                }


            }
            if (food.equalsIgnoreCase("2")) {
                app.textwords("'I'd like to order one of your refreshers..'");
                Scanner buy = new Scanner(System.in);

                // Display refresher menu using your `menu` class
                menu a = new menu("1. Strawberry refresher $5.25");
                menu b = new menu("\n2. Watermelon refresher $5.25");
                menu c = new menu("\n3. Pineapple refresher $5.25");
                menu d = new menu("\n4. Mango refresher $5.25");
                menu e = new menu("\n5. Grape refresher $5.25");
                System.out.println(a.drinks + b.drinks + c.drinks + d.drinks + e.drinks);

                // Get user's refresher choice
                String ref = buy.nextLine();

                // If valid refresher option
                if (ref.equalsIgnoreCase("1") || ref.equalsIgnoreCase("2") || ref.equalsIgnoreCase("3") ||
                        ref.equalsIgnoreCase("4") || ref.equalsIgnoreCase("5")) {

                    // Ask for upgrade
                    size si = new size();
                    si.update(); // prints: "Would you like to upgrade your refresher for 50 cents more?"
                    String upgrade = buy.nextLine();
                    boolean upgraded = upgrade.equalsIgnoreCase("Yes");

                    // Ask for payment method
                    app.textwords("How would you like to pay?");
                    deb.pay(); // uses previously declared debitcash instance
                    String payment = buy.nextLine();

                    // Display total
                    if (upgraded) {
                        if (payment.equals("1")) {
                            app.textwords("Alright! Your total is 5.75!");
                        } else {
                            app.textwords("Alright! Your total is 6.06!");
                        }
                    } else {
                        if (payment.equals("1")) {
                            app.textwords("Alright! Your total is 5.25!");
                        } else {
                            app.textwords("Alright! Your total is 5.56!");
                        }
                    }

                }
            }
            if (food.equalsIgnoreCase("3")){
                app.textwords("'I'd like some juice please...'");
                Scanner buy = new Scanner(System.in);

                menu a = new menu("1. Orange juice $3.00 ");
                menu b = new menu("\n2. Pineapple juice $3.00");
                menu c = new menu("\n3. Mango juice $3.00");
                menu d = new menu("\n4. Apple juice $3.00");
                menu e = new menu("\n5. Grape juice $3.00");
                String juice = buy.nextLine();
                if (juice.equalsIgnoreCase("1") || juice.equalsIgnoreCase("2") || juice.equalsIgnoreCase("3") ||
                        juice.equalsIgnoreCase("4") || juice.equalsIgnoreCase("5")){
                    String cash = buy.next();
                    app.textwords("How would you like to pay?");
                    deb.pay();
                    if (cash.equalsIgnoreCase("1")) {
                        app.textwords("Alright! Your total is 3.00!");
                    } else {
                        app.textwords("Alright your total is 3.18!");
                    }

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

                // Ask how they want to pay before getting the payment option
                app.textwords("How would you like to pay?");
                deb.pay();
                String cash = buy.next();

                if (cake.equalsIgnoreCase("1") || cake.equalsIgnoreCase("2") || cake.equalsIgnoreCase("5")) {
                    if (cash.equalsIgnoreCase("1")) {
                        app.textwords("Alright! Your total is 7.00!");
                    } else {
                        app.textwords("Alright your total is 7.42!");
                    }
                } else if (cake.equalsIgnoreCase("3")) {
                    if (cash.equalsIgnoreCase("1")) {
                        app.textwords("Alright! Your total is 5.00!");
                    } else {
                        app.textwords("Alright your total is 5.30!");
                    }
                } else if (cake.equalsIgnoreCase("4")) {
                    if (cash.equalsIgnoreCase("1")) {
                        app.textwords("Alright! Your total is 4.00!");
                    } else {
                        app.textwords("Alright your total is 4.24!");
                    }
                }
            }
            if (food.equalsIgnoreCase("5")) {
                app.textwords("'Maybe I`ll try one of your guys' hot-food!'");
                Scanner buy = new Scanner(System.in);

                menu a = new menu("1. Turkey sandwich $10.00");
                menu b = new menu("\n2. Chicken sandwich $10.00");
                menu c = new menu("\n3. Egg and cheese on a croissant $10.00");
                menu d = new menu("\n4. Bacon egg and cheese on a roll $10.00");
                menu e = new menu("\n5. Club sandwich $10.00");
                System.out.println(a.drinks + b.drinks + c.drinks + d.drinks + e.drinks);

                String hot = buy.nextLine();

                // Ask for payment method first
                app.textwords("How would you like to pay?");
                deb.pay();
                String cash = buy.next();

                if (hot.equalsIgnoreCase("1") || hot.equalsIgnoreCase("2") || hot.equalsIgnoreCase("3") ||
                        hot.equalsIgnoreCase("4") || hot.equalsIgnoreCase("5")) {

                    if (cash.equalsIgnoreCase("1")) {
                        app.textwords("Alright! Your total is $10.00");
                    } else {
                        app.textwords("Alright! Your total is $10.60");
                    }
                }
            }

        }
        else{
            app.textwords("That's okay! Take care!");
        }
    }
}

class Coffee extends TextEffect{
    public static void pressEnterToContinue(Scanner input) {
        input.nextLine();
    }

    private String location;

    public String getCafeLocation() {return location;}

    public void setCafeLocation(String location){this.location = location;}

}
