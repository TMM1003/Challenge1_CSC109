import java.util.Scanner;

public class Challenege1 {
String [] emails;
String [] passwords;
    public static void main(String[] args) {
    }
    public static void showWelcomeMessage() {
        System.out.println("Welcome to Qbay! You can buy or sell anything you want! ");
        System.out.println("             U _____ u  _        ____   U  ___ u  __  __  U _____ u      _____   U  ___ u       ___     ____      _      __   __  _    \r\n" + //
                        " __        __\\| ___\"|/ |\"|    U /\"___|   \\/\"_ \\/U|' \\/ '|u\\| ___\"|/     |_ \" _|   \\/\"_ \\/      / \" \\ U | __\")uU  /\"\\  u  \\ \\ / /U|\"|u  \r\n" + //
                        " \\\"\\      /\"/ |  _|\" U | | u  \\| | u     | | | |\\| |\\/| |/ |  _|\"         | |     | | | |     | |\"| | \\|  _ \\/ \\/ _ \\/    \\ V / \\| |/  \r\n" + //
                        " /\\ \\ /\\ / /\\ | |___  \\| |/__  | |/__.-,_| |_| | | |  | |  | |___        /| |\\.-,_| |_| |    /| |_| |\\ | |_) | / ___ \\   U_|\"|_u |_|   \r\n" + //
                        "U  \\ V  V /  U|_____|  |_____|  \\____|\\_)-\\___/  |_|  |_|  |_____|      u |_|U \\_)-\\___/     U \\__\\_\\u |____/ /_/   \\_\\    |_|   (_)   \r\n" + //
                        ".-,_\\ /\\ /_,-.<<   >>  //  \\\\  _// \\\\      \\\\   <<,-,,-.   <<   >>      _// \\\\_     \\\\          \\\\//  _|| \\\\_  \\\\    >>.-,//|(_  |||_  \r\n" + //
                        " \\_)-'  '-(_/(__) (__)(_\")(\"_)(__)(__)    (__)   (./  \\.) (__) (__)    (__) (__)   (__)        (_(__)(__) (__)(__)  (__)\\_) (__)(__)_) ");
    }

    public void loadHardcodedAccounts() {
        String [] hardEmails = {"John.Smith@quinnipiac.edu", "Jane.Doe@quinnipiac.edu", "Carl.Hansen@quinnipiac.edu", "Jimmy.Darren@quinnipiac.edu", "Greg.Paul@quinnipiac.edu"};
        String [] hardPasswords = {"FishyGalore123", "SecretPassword!", "CSC109CHALLENGE", "SuperOriginalPassword", "FloatyTheDog1987"};

        this.emails = hardEmails;
        this.passwords = hardPasswords;
    }


    public boolean loginUser() {
        int count = 0;
        Scanner in = new Scanner (System.in);

        
        System.out.println("Enter your email: ");
        String userInput = in.nextLine();
        
        System.out.println("Enter your password: ");
        String passwordInput = in.nextLine();

        for (int i = 0; i < emails.length; i++) {
            if (userInput.equals(emails[i])) {
                if (passwordInput.equals(passwords[i])) {
                    return true;
                }
            }
        }
        while ((count < 3)) {
            System.out.println("Incorrect email or password. ");
            count ++;
            System.out.println("Enter your email again: ");
            userInput = in.nextLine();
            
            System.out.println("Enter your password again: ");
            passwordInput = in.nextLine();

            for (int i = 0; i < emails.length; i++) {
                if (userInput.equals(emails[i])) {
                    if (passwordInput.equals(passwords[i])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void showMainMenu() {
        // TODO: show menu options: buy, sell, cart, logout
        // TODO: ask the user to choose an option
        // TODO: call the correct function based on the user's choice
    }

    public static void handleBuyMenu() {
        String[] itemNames = {"MacBook Air", "Dorm Mini Fridge", "Calculus Textbook", "Bike Lock", "Noise-Cancelling Headphones"};
        String[] itemCategories = {"Electronics", "Appliances", "Books", "Accessories", "Electronics"};
        String[] sellerNames = {"John Smith", "Jane Doe", "Carl Hansen", "Jimmy Darren", "Greg Paul"};
        String[] sellerEmails = {"John.Smith@quinnipiac.edu", "Jane.Doe@quinnipiac.edu", "Carl.Hansen@quinnipiac.edu", "Jimmy.Darren@quinnipiac.edu", "Greg.Paul@quinnipiac.edu"};
        double[] itemPrices = {799.99, 120.00, 65.50, 18.99, 149.99};

        System.out.println("\nItems for Sale:");
        for (int i = 0; i < itemNames.length; i++) {
            System.out.printf("%d. %s%n", i + 1, itemNames[i]);
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Select an item number to view details: ");
        int selection = in.nextInt();

        if (selection >= 1 && selection <= itemNames.length) {
            showItemDetails(selection - 1, itemNames, itemCategories, sellerNames, sellerEmails, itemPrices);
        } else {
            System.out.println("Invalid item selection.");
        return;
        }
        System.out.print("Add this item to your cart? (yes/no): ");
        in.nextLine();
        String addToCartChoice = in.nextLine();

        if (addToCartChoice.equalsIgnoreCase("yes") || addToCartChoice.equalsIgnoreCase("y")) {
            addItemToCart(itemNames[selection - 1], itemPrices[selection - 1]);
            System.out.println(itemNames[selection - 1] + " added to cart.");
        }
        
         System.out.print("Enter M to return to the main menu: ");
        String returnChoice = in.nextLine();
        if (returnChoice.equalsIgnoreCase("m")) {
            showMainMenu();
            return;
        }
    }
    public static void showItemDetails(int itemIndex, String[] itemNames, String[] itemCategories, String[] sellerNames, String[] sellerEmails, double[] itemPrices) {
        System.out.println("\nItem Details:");
        System.out.println("Name: " + itemNames[itemIndex]);
        System.out.println("Category: " + itemCategories[itemIndex]);
        System.out.println("Seller: " + sellerNames[itemIndex] + " (" + sellerEmails[itemIndex] + ")");
        System.out.printf("Price: $%.2f%n", itemPrices[itemIndex]);
    }

     public static void addItemToCart(String itemName, double itemPrice) {
        cartItemNames[cartItemCount] = itemName;
        cartItemPrices[cartItemCount] = itemPrice;
        cartItemCount++;

    }

     public static String[] cartItemNames = new String[100];
     public static double[] cartItemPrices = new double[100];
     public static int cartItemCount = 0;
    
    public static void handleSellMenu() {
        // TODO: show options to view current items for sale or add a new item
        // TODO: provide an option to return to the main menu
    }

    public static void showCurrentUserListings() {
        // TODO: display the logged-in user's item names
        // TODO: display each item's category
        // TODO: display each item's price
    }

    public static void addNewItemForSale() {
        // TODO: prompt for item name
        // TODO: prompt for item category
        // TODO: prompt for item price
        // TODO: add the new item to the system
        // TODO: make sure it appears in the user's listings
    }

    public static void handleCartMenu() {
        // TODO: display all cart item names and prices
        // TODO: calculate and display the total price
        // TODO: let the user choose to checkout
        // TODO: provide an option to return to the main menu
    }

    public static void checkoutCart() {
        // TODO: purchase all items currently in the cart
        // TODO: remove purchased items from the buy menu
        // TODO: clear the cart after checkout
    }

    public static void logoutUser() {
        // TODO: print a thank-you message
        System.out.println("Thank you for shopping at QBay! ");
        // TODO: tell the user they have successfully logged out
        System.out.println("You have been successfully logged out. ");
        // TODO: exit the program
    }
}
