package advanced.tasks.grocery;

import java.util.Scanner;

//TODO:
// 1. Deleting all the items (GroceryList.java)
// 2. Add default items in the grocery list
// 3. Fix problem with option when adding not number or not number from choice (print: "enter valid option")
// 4. accept any case letters
/* 5. cannot start with number (GroceryList.java) = check if the value consists of letters only *regular expression
(you cannot add in your list stuff like: 23933jKF#@@) */




public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList grocerylist = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit){
            System.out.println("Enter your choice ");
            choice = scanner.nextInt();
        //bug fix
            scanner.nextLine();

            switch (choice){
                case 0:
                    //print all options
                    printInstructions();
                    break;
                case 1:
                    //print grocery list
                    grocerylist.printGroceryList();
                    break;
                case 2:
                    //add item
                    addItem();
                    break;
                case 3:
                    //modify item
                    modifyItem();
                    break;
                case 4:
                    //remove item
                    removeItem();
                    break;
                case 5:
                    //search item
                    searchForItem();
                    break;
                case 6:
                    //quit
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions(){
            System.out.println("\nPress");
            System.out.println("\t 0 - To print choice options");
            System.out.println("\t 1 - To print the list of grocery items");
            System.out.println("\t 2 - To add an item to the list");
            System.out.println("\t 3 - To modify an item in the list");
            System.out.println("\t 4 - To remove an item from the list");
            System.out.println("\t 5 - To search for an item in the list");
            System.out.println("\t 6 - To quit the application");
        }

        public static void addItem(){
            System.out.println("Please enter grocery item ");
            grocerylist.addGroceryItem(scanner.nextLine());
        }

        public static void modifyItem(){
            System.out.print("Enter item number ");
            int itemNo = scanner.nextInt();

           //fixing input bug
            scanner.nextLine();
            System.out.print("Enter replacement item ");
            String newItem = scanner.nextLine();
            grocerylist.modifyGroceryItem(itemNo-1,newItem);
        }

        public static void removeItem(){
            System.out.print("Enter item name to be removed ");
            String itemName = scanner.nextLine();
            grocerylist.removeGroceryItem(itemName);
        }

        public static void searchForItem(){
            System.out.print("Enter item to search for: ");
            String searchItem = scanner.nextLine();

            if(grocerylist.searchItem(searchItem)){
                System.out.println("Found " + searchItem + " in our grocery list");
            }else{
                System.out.println(searchItem + "is not in the list");
            }
        }

    }
