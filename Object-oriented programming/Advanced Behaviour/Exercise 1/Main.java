import java.util.Objects;
import java.util.Scanner;

public class Main {
        PhoneBook contact = new PhoneBook();

        public static void main(String[] args) {
                PhoneBook contact = new PhoneBook();

                System.out.println("1. Enter a number\n");
                System.out.println("2. Search Number\n");
                System.out.println("3. Show Catalog\n");
                System.out.println("4. Exit\n");
                System.out.println("Select a number(1-4): ");

                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                while (choice != 4) {
                        if (choice == 1) {
                                scanner.nextLine();
                                System.out.println("Name: ");
                                String name = scanner.nextLine();
                                System.out.println("Number: ");
                                String number = scanner.nextLine();
                                contact.addNumber(name, number);
                        } else if (choice == 2) {
                                scanner.nextLine();
                                String name = scanner.nextLine();
                                contact.showNumbersOf(name);
                        } else if (choice == 3) {
                                contact.show();
                        }
                        choice = scanner.nextInt();
                }
                System.out.println("End");
        }
}
