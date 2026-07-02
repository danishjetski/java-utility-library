import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    static Scanner input = new Scanner(System.in);
    static ArrayList<BookClass> bookList = new ArrayList<BookClass>();


    public static void main(String[] args) {

        // ArrayList is to store information of the books
        while (true) {
            try {

                int num = 0;
                do { //this loop manages to make sure everytime someone exit a option,it will go back to the main menu.

                    mainMenu();
                    num = input.nextInt();

                    switch (num) {
                        case 1 -> {//For View Book
                            viewBook();
                        }

                        case 2 -> {// For Add Books
                            addBook();
                        }

                        case 3 -> {// For Edit Book
                            editBook();
                        }
                        case 4 -> { // For Delete Book
                            deleteBook();
                        }

                        case 5 -> {// Exit
                            System.out.print("Exiting the program...");

                        }
                    }
                } while (num != 5); //to check if user put number more than limit set

            } catch (NumberFormatException n) {
                System.out.println("Please enter a valid input");
            }//
            catch (IndexOutOfBoundsException b) {
                System.out.println("Please choose according to the list");
            }//
            catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error... Returning to main menu");
            }// catch other errors (usually catch empty input)

        }// while loop end
    }


    public static void mainMenu() {//the Main Menu option
        System.out.println("------------------------------------");
        System.out.println("Book Repository");
        System.out.println("------------------------------------");
        System.out.println("1. View Books");
        System.out.println("2. Add Books");
        System.out.println("3. Edit Books");
        System.out.println("4. Delete Books");
        System.out.println("5. EXIT");
        System.out.println("Select option (1 – 5) >>");
    }// this is where user will find and see what option to choose

    public static void viewBook() {
        System.out.println("You have chosen option the View Book Option.\n");
        if (bookList.size() == 0)
            System.out.println("There are no books available. Please add some books.");
        else {
            for (int i = 0; i < bookList.size(); i++) {
                BookClass book = bookList.get(i);

                System.out.println(
                        (i + 1) + "\nBook Title:" + book.getBookTitle() + "\nBook Author:"
                                + book.getBookAuthor() + "\nBook Publisher:" + book.getBookPublisher());
            }
        }
    }
    // Process End

    public static void addBook() {
        String bookTitle;
        String bookAuthor;
        String bookPublisher;
        String bookCountry;
        double bookPrice;
        String bookLanguage;
        int bookPages;

        while (true) {// while adding book start
            try {
                System.out.print("You have chosen the Add Books Option");
                System.out.print("\n");
                System.out.println("\nChoose what book type you want to add." +
                        "\nEnter 1 for Comic Book or Enter 2 for Novel" +
                        "\nEnter -1 to exit this option");

                int option = input.nextInt();

                if (option == 1) {
                    System.out.println("You have chosen the Comic Book option");

                    System.out.println("\nEnter book title or type -1 to abort: ");
                    input.nextLine();
                    bookTitle = input.nextLine();// user can put -1 anytime to exit
                    if (bookTitle.equals("-1")) {
                        System.out.println("Return to main menu...");
                        return;
                    }

                    System.out.println("Enter book author or -1 to abort: ");
                    bookAuthor = input.nextLine();
                    if (bookAuthor.equals("-1")) {
                        System.out.println("Return to main menu...");
                        return;
                    }


                    System.out.println("Enter book publisher or -1 to abort: ");
                    bookPublisher = input.nextLine();
                    if (bookPublisher.equals("-1")) {
                        System.out.println("Return to main menu...");
                        return;
                    }

                    System.out.println("Enter the price of the book or -1 to abort: ");
                    bookPrice = input.nextDouble();
                    if (bookPrice < 0) {
                        System.out.println("Return to main menu...");
                        return;
                    }

                    System.out.println("Enter what country is this book from or -1 to abort: ");
                    bookCountry = input.nextLine();
                    if (bookCountry.equals("-1")) {
                        System.out.println("Return to main menu...");
                        return;
                    }
                    input.nextLine();

                    System.out.println(
                            "Book Title:\n" + bookTitle + "\nBook Author:\n" + bookAuthor
                                    + "\nBook Publisher:\n " + bookPublisher + "\nBook Price:" + bookPrice + "\nCountry" + bookCountry);// user will see their final results here

                    System.out.println("Do you want to save this book? Yes or No?");
                    if (input.nextLine().equalsIgnoreCase("Yes")) {
                        System.out.println("The Comic Book has been added!");

                        bookList.add(new ComicBook(bookTitle, bookAuthor, bookPublisher, bookPrice, bookCountry));
                    } else if (input.nextLine().equalsIgnoreCase("No"))
                        System.out.println("The book has been discarded");
                } else if (option == 2) {
                    System.out.println("You have chosen the Novel option");

                    System.out.println("\nEnter book title or type -1 to abort: ");
                    input.nextLine();
                    bookTitle = input.nextLine();// user can put -1 anytime to exit
                    if (bookTitle.equals("-1")) {
                        System.out.println("Return to main menu...");
                        return;
                    }

                    System.out.println("Enter book author or -1 to abort: ");
                    bookAuthor = input.nextLine();
                    if (bookAuthor.equals("-1")) {
                        System.out.println("Return to main menu...");
                        return;
                    }


                    System.out.println("Enter book publisher or -1 to abort: ");
                    bookPublisher = input.nextLine();
                    if (bookPublisher.equals("-1")) {
                        System.out.println("Return to main menu...");
                        return;
                    }


                    System.out.println("Enter the language of the book or -1 to abort: ");
                    bookLanguage = input.nextLine();
                    if (bookLanguage.equals("-1")) {
                        System.out.println("Return to main menu...");
                        return;
                    }
                    System.out.println("Enter how many pages those this book have or -1 to abort: ");
                    bookPages = input.nextInt();
                    if (bookPages < 0) {
                        System.out.println("Return to main menu...");
                        return;
                    }

                    System.out.println(
                            "Book Title:\n " + bookTitle + "\nBook Author:\n " + bookAuthor
                                    + "\nBook Publisher:\n " + bookPublisher + "\nLanguage:" + bookLanguage + "\nPages:" + bookPages);// user will see their final results here
                    System.out.println("Do you want to save this book? Yes or No?");
                    if (input.nextLine().equalsIgnoreCase("Yes")) {
                        System.out.println("The Novel has been added!");

                        bookList.add(new Novel(bookTitle, bookAuthor, bookPublisher, bookLanguage, bookPages));
                    } else if (input.nextLine().equalsIgnoreCase("No")) {
                        System.out.println("Going back to main menu...");
                        return;
                    }
                } else if (option == -1) {
                    System.out.println("Return to main menu...");
                    return;
                }

            } catch (Exception ez) {
                System.out.println("Something is wrong");
                ez.printStackTrace();
            }
        }
    }


    // Process End

    public static void editBook() {
        System.out.println("You have chosen the Edit Book Option");

        if (bookList.size() == 0)
            System.out.println("There are no books available to edit.");
        else {
            for (int i = 0; i < bookList.size(); i++) {
                BookClass book = bookList.get(i);
                System.out.println(
                        (i + 1) + "Book Title:" + book.getBookTitle() + "Book Author:"
                                + book.getBookAuthor() + "Book Publisher" + book.getBookPublisher());
            }


            System.out.println("Enter a number for which part you want to edit");
            System.out.println("1.Book Title");
            System.out.println("2.Book Author");
            System.out.println("3.Book Publisher");
            int editor = input.nextInt();
            switch (editor){
                case 1-> {System.out.println("You have chosen the edit Book Title option");
                }
                case 2-> {
                    System.out.println("You have chosen the edit Book Author option");
                }
                case 3->{System.out.println("You have chosen the edit Book Publisher option");
                }
            }
        }
    }

    public static void deleteBook() {
        System.out.println("You have chosen the Delete Book Option");
        if (bookList.size() == 0) {
            System.out.println("There are currently no books\n " +
                    "Please add more books");
        } else {
            System.out.println("\nThere is/are currently " + bookList.size() + " books available.");
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println("\nBook Number: " + (i + 1));
                System.out.println("Title: " + bookList.get(i).getBookTitle());
                System.out.println("Author: " + bookList.get(i).getBookAuthor());
                System.out.println("Publisher: " + bookList.get(i).getBookPublisher());
            } // users are able to see what books before they delete it

            System.out.print("\nEnter a book number to delete >> ");
            //user enter what number to choose what book to delete
            int bookNumber = 0;//
            if (input.hasNextInt()) {
                bookNumber = input.nextInt();
                if (bookNumber < 1 || bookNumber > bookList.size()) {
                    System.out.println("Invalid book index number");
                } else {
                    bookList.remove(bookNumber - 1);//the number user put will deduct one
                    System.out.println("Book number " + bookNumber + " has been removed!.");
                }
            } else {
                input.nextLine();//for if user put words instead of numbers
                System.out.println("Invalid number,please try a number");
            }// Process End
        }
    }
}

