import java.util.Scanner;

public class Challenege1 {
String [] emails;
String [] passwords;
    public static void main(String[] args) {
        // TODO: call setup methods
        // TODO: show welcome message and ASCII art
        // TODO: run login flow
        // TODO: if login succeeds, show the main menu until the user logs out
    }

    public static void showWelcomeMessage() {
        // TODO: print a fun qBay welcome message
        System.out.println("Welcome to Qbay! You can buy or sell anything you want! ");
        // TODO: print ASCII art
        System.out.println("             U _____ u  _        ____   U  ___ u  __  __  U _____ u      _____   U  ___ u       ___     ____      _      __   __  _    \r\n" + //
                        " __        __\\| ___\"|/ |\"|    U /\"___|   \\/\"_ \\/U|' \\/ '|u\\| ___\"|/     |_ \" _|   \\/\"_ \\/      / \" \\ U | __\")uU  /\"\\  u  \\ \\ / /U|\"|u  \r\n" + //
                        " \\\"\\      /\"/ |  _|\" U | | u  \\| | u     | | | |\\| |\\/| |/ |  _|\"         | |     | | | |     | |\"| | \\|  _ \\/ \\/ _ \\/    \\ V / \\| |/  \r\n" + //
                        " /\\ \\ /\\ / /\\ | |___  \\| |/__  | |/__.-,_| |_| | | |  | |  | |___        /| |\\.-,_| |_| |    /| |_| |\\ | |_) | / ___ \\   U_|\"|_u |_|   \r\n" + //
                        "U  \\ V  V /  U|_____|  |_____|  \\____|\\_)-\\___/  |_|  |_|  |_____|      u |_|U \\_)-\\___/     U \\__\\_\\u |____/ /_/   \\_\\    |_|   (_)   \r\n" + //
                        ".-,_\\ /\\ /_,-.<<   >>  //  \\\\  _// \\\\      \\\\   <<,-,,-.   <<   >>      _// \\\\_     \\\\          \\\\//  _|| \\\\_  \\\\    >>.-,//|(_  |||_  \r\n" + //
                        " \\_)-'  '-(_/(__) (__)(_\")(\"_)(__)(__)    (__)   (./  \\.) (__) (__)    (__) (__)   (__)        (_(__)(__) (__)(__)  (__)\\_) (__)(__)_) ");
    }

    public void loadHardcodedAccounts() {
        // TODO: create a few Quinnipiac student accounts with hardcoded emails/passwords
        String [] hardEmails = {"John.Smith@quinnipiac.edu", "Jane.Doe@quinnipiac.edu", "Carl.Hansen@quinnipiac.edu", "Jimmy.Darren@quinnipiac.edu", "Greg.Paul@quinnipiac.edu"};
        String [] hardPasswords = {"FishyGalore123", "SecretPassword!", "CSC109CHALLENGE", "SuperOriginalPassword", "FloatyTheDog1987"};

        this.emails = hardEmails;
        this.passwords = hardPasswords;
    }

    public static void loadStarterItems() {
        // TODO: create at least 5 starter items for the buy menu
    }

    public boolean loginUser() {
        // TODO: prompt for Quinnipiac email
        // TODO: prompt for password
        // TODO: validate against hardcoded accounts
        // TODO: allow at most 3 failed attempts
        // TODO: lock the user out after 3 failures
        
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
        // TODO: display all items for sale by name in a neat format
        // TODO: let the user view details for a selected item
        // TODO: let the user add a selected item to the cart
        // TODO: provide an option to return to the main menu
    }

    public static void showItemDetails() {
        // TODO: display the selected item's name
        // TODO: display the selected item's category
        // TODO: display seller first name, last name, and Quinnipiac email
        // TODO: display the selected item's price
    }

    public static void addItemToCart() {
        if (selectedItem == null) {
            System.out.println("No item selected.");
            return;
        }
        
        cart.add(selectedItem);
        System.out.println("\n" + selectedItem.getName() + " has been added to your cart!");
        selectedItem = null;
    }

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
        boolean inCartMenu = true;
        
        while (inCartMenu) {
            System.out.println("\n===== CART MENU =====");
            
            if (cart.isEmpty()) {
                System.out.println("Your cart is empty.");
            } else {
                System.out.println("\nItems in Cart:");
                double total = 0;
                for (int i = 0; i < cart.size(); i++) {
                    Item item = cart.get(i);
                    System.out.printf("%d. %s - $%.2f\n", i + 1, item.getName(), item.getPrice());
                    total += item.getPrice();
                }
                System.out.printf("\nTotal: $%.2f\n", total);
            }
            
            System.out.println("\nOptions:");
            System.out.println("1. Checkout");
            System.out.println("2. Return to Main Menu");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine().trim();
            
            if (choice.equals("1")) {
                checkoutCart();
                inCartMenu = false;
            } else if (choice.equals("2")) {
                inCartMenu = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void checkoutCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty. Nothing to purchase.");
            return;
        }
        
        double totalCost = 0;
        for (Item item : cart) {
            totalCost += item.getPrice();
            items.remove(item);
        }
        
        System.out.println("\n===== CHECKOUT =====");
        System.out.printf("Purchase successful! Total spent: $%.2f\n", totalCost);
        cart.clear();
        System.out.println("Items have been removed from the marketplace.");
    }

    public static void logoutUser() {
        // TODO: print a thank-you message
        System.out.println("Thank you for shopping at QBay! ");
        // TODO: tell the user they have successfully logged out
        System.out.println("You have been successfully logged out. ");
        // TODO: exit the program
    }
}
