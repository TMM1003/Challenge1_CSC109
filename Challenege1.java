public class Challenege1 {

    public static void main(String[] args) {
        // TODO: call setup methods
        // TODO: show welcome message and ASCII art
        // TODO: run login flow
        // TODO: if login succeeds, show the main menu until the user logs out
    }

    public static void showWelcomeMessage() {
        // TODO: print a fun qBay welcome message
        // TODO: print ASCII art
    }

    public static void loadHardcodedAccounts() {
        // TODO: create a few Quinnipiac student accounts with hardcoded emails/passwords
    }

    public static void loadStarterItems() {
        // TODO: create at least 5 starter items for the buy menu
    }

    public static boolean loginUser() {
        // TODO: prompt for Quinnipiac email
        // TODO: prompt for password
        // TODO: validate against hardcoded accounts
        // TODO: allow at most 3 failed attempts
        // TODO: lock the user out after 3 failures
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
        // TODO: add the selected item to the cart
        // TODO: make sure the item appears later in the cart menu
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
        // TODO: tell the user they have successfully logged out
        // TODO: exit the program
    }
}
