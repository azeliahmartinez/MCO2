/*
    This class represents the main entry point of the HALO HALO Vending Machine program.
 * It allows users to create and test a vending machine for selling items.
 * The program presents a text-based user interface where users can choose various options.
 * 
 * The program provides the following functionalities:
 *   - Creating a new vending machine with custom settings (e.g., number of slots, item names, and prices).
 *   - Testing an existing vending machine by simulating transactions and payments.
 *   - Exiting the program gracefully.
 * 
 * The program makes use of the VendingMachine class to manage vending machine operations.
 * It includes helper methods to print the main menu and the exit message.
 * 
 * @author Azeliah Martinez
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine();

        while (true) {
            printMainMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    vendingMachine.createVendingMachine();
                    break;
                case 2:
                    List<Item> vendingItems = new ArrayList<>();
                    vendingMachine.testVendingMachine(vendingItems);
                    break;
                case 3:
                    exit();
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
    
    public static void printMainMenu() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("║     ╓──────────────────────────────────╖     ║");
        System.out.println("║     ║            MAIN MENU             ║     ║");
        System.out.println("║     ╟──────────────────────────────────╢     ║");
        System.out.println("║     ║  ⦾ (1) Create a Vending Machine  ║     ║");
        System.out.println("║     ║  ⦾ (2) Test a Vending Machine    ║     ║");
        System.out.println("║     ║  ⦾ (3) Exit                      ║     ║");
        System.out.println("║     ╙──────────────────────────────────╜     ║");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }

    public static void exit() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("║             Thank you for using              ║");
        System.out.println("║        Zae's HALO HALO Vending Machine!      ║");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }
}

