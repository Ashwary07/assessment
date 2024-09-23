/*
 * Should at least have 3 class 
 * - Book 
 * - Author
 * - And a class that controls and processes all of the data.  
 */




import java.util.Scanner;

public class libraryFunctionality {
    public static void main(String[] args) {
        menu();
    }
    
    static void menu() {
        try (Scanner sc = new Scanner(System.in)) {
        boolean run= true;
        System.err.print("  ");
        for (int i = 0; i<30; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.println("      Welcome to the Library");
        System.out.print("  ");
        for (int i = 0; i<30; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.println("    1 > View All Books");
        System.out.println("    2 > View All eBooks");
        System.out.println("    3 > View All non-eBooks");
        System.out.println("    4 > View an author's books");
        System.out.println("    5 > Add Book");
        System.out.println("    6 > Edit Book");
        System.out.println("    7 > Exit");
        System.out.print("  ");
        for (int i = 0; i<30; i++) {
            System.out.print("*");
        }
        System.out.println("  ");

            try {
                while (run) {
                    System.out.print("  Enter your choice: ");
                    int choice = sc.nextInt();
                    if (choice <= 0 || choice >= 8) {
                        System.out.println("  Not an option");
                        System.out.print("  Do you want to try again? (yes/'type anything'): ");
                        String retry = sc.next().toLowerCase();
                        if (!retry.equals("yes")){
                            System.out.println("    See you later");
                            run = false;
                        }
                    } else {
                        menu2(choice);
                        run = false;
                    }
                }
            } catch (Exception e) {
               System.out.println("Wrong input");
               sc.nextLine();
            }    
        }    
    }
    

    static void menu2(int choice) {
        try (Scanner sc = new Scanner(System.in)) {
            switch (choice) {
                case 1 -> {
                    System.out.println("Viewing all Books...");
                    viewAllBooks();
                }
                case 2 -> {
                    System.out.println("Viewing all eBooks...");
                    viewAlleBooks();
                }
                case 3 -> {
                    System.out.println("Viewing all non-eBooks...");
                    viewAllNonEBooks();
                }
                case 4 -> {
                    System.out.print("Enter the name of author: ");
                    String authorsName = sc.next().toLowerCase();
                    searchByAuthor(authorsName);
                }
                case 5 -> {
                    System.out.print("Enter the name of the book you want to add: ");
                    String addBook = sc.next().toLowerCase();
                    addingBook(addBook);
                }
                case 6 -> {
                    System.out.print("Enter the name of the book you want to edit: ");
                    String editBook = sc.next().toLowerCase();
                    editingBook(editBook);
                }
                case 7 -> {
                    System.out.println("Thank you for using this system! ");
                    break;
                }
                default -> throw new AssertionError();
            }
        }
    }

    static void viewAllBooks() { // to view all every single book
        System.out.println("book1");
        System.out.println("book2");
        System.out.println("book3");
    }

    static void viewAlleBooks() { // to view all ebooks
        System.out.println("book1");
        System.out.println("book2");
        System.out.println("book3");
    }

    static void viewAllNonEBooks() { // to view all non-ebooks
        System.out.println("book1");
        System.out.println("book2");
        System.out.println("book3");
    }

    static void searchByAuthor( String authorsName) { // to search by name
        System.out.println("hey from search by author");
    }

    static void addingBook(String addBook) { // to add the book
        System.out.println("hey from adding a book");
    }

    static void editingBook(String editBook) { // to edit the book
        System.out.println("hey from editing a book");
    }   
}